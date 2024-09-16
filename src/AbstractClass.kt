fun main(){
    var student12345=Student2();
    println(student12345 is A)
}
//抽象类
abstract class Student123 {//自带open属性，可以被继承
    abstract val type: String
    abstract fun hello()
    fun test() = println("不会有人玩到大三了才开始学Java吧")  //定义非抽像属性或函数，在子类中不强制要求重写
}
class ArtStudent123 : Student123() {
    override val type: String
        get() = "Art"
    override fun hello() {
        println("Hello, I am an art student.")
    }
}
open class TEACHER{
    open fun hello(){
        println("I am a teacher.")
    }
}
abstract class STUDENT:TEACHER(){
    abstract fun study()
}//抽象类可以继承非抽象类，但是非抽象类不能继承抽象类

//接口：不允许有状态，只能有属性，不能有方法体，只能是抽象的。Kotlin不存在多继承，但是可以实现多个接口
interface A {
    val x: String  //接口中所有属性默认都是abstract的（可省略关键字）
    fun sleep()=println("管他什么早八不早八的，睡舒服再说")   //接口中所有函数默认都是abstract的（可省略关键字）
}
interface B {
    fun game()
    fun sleep()=println("七点起床学习，八点开始玩游戏")   //接口中所有函数默认都是abstract的（可省略关键字）
}
class Student2: A, B {   //接口的实现与类的继承一样，直接写到后面，多个接口用逗号隔开
    override val x: String = "测试"   //跟抽象类一样，接口中的内容是必须要实现的
    override fun sleep() {
        super<A>.sleep()  //如果接口A和接口B中有相同的函数，那么在实现类中必须要指定调用哪个接口的函数
        //解决了接口中的冲突
    } //接口中的函数也是必须要实现的
    override fun game() = println("读大学就该玩游戏玩到爽")
}