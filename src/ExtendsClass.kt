fun main(){
    var abcd=StudentG2222()
    abcd.hello()
    abcd.test()
    //因为是对String类型的扩展函数，需要String.前缀
    val func: String.() -> Int = {
        this.length   //跟上面一样，扩展函数中的this依然指的是被扩展的类对象
    }
    println("sahda".func())  //可以直接对符合类型的对象使用这个函数
    func("Hello")  //如果是直接调用，那么必须要传入对应类型的对象作为首个参数，此时this就指向我们传入的参数
}//扩展类的成员函数
class StudentG2222{
    fun hello(){
        println("Hello")
    }
}
fun StudentG2222.test()=println("test")//扩展函数
//同名函数，在同class中若扩展函数修改了class已有函数，则扩展函数优先级低于类的成员函数

//若有A类，B类，A类中有一个函数，B类中有一个函数，若B类中的函数扩展了A类，则B类中的函数优先级高于A类中的函数
/*
class A {
    fun hello() = "Hello World"
}

class B (private val a: A){
    private fun A.test() {
        hello()   //直接使用优先匹配被扩展类中的方法
        this.hello()   //扩展函数中的this依然指的是被扩展的类对象
        this@B.hello()   //这里调用的才是下面的
    }

    fun hello() = "Bye World"
}
*/
//同名函数对原函数实现重载则不会有影响
//相当于继承了一个类并添加了一些新东西