fun main(){
    var abcd=StudentG2222()
    abcd.hello()
    abcd.test()
}//扩展类的成员函数
class StudentG2222{
    fun hello(){
        println("Hello")
    }
}
fun StudentG2222.test()=println("test")//扩展函数
//同名函数，扩展函数优先级低于类的成员函数
//同名函数对原函数实现重载则不会有影响
//相当于继承了一个类并添加了一些新东西