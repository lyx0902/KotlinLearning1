//class Student(var name: String, var age: Int) {
    //在类内定义属性需要初始化，否则会报错
    //var name: String = "张三"
    //var age: Int = 20
/*class Student{
    lateinit var name: String
    lateinit var age: String //lateinit表示延迟初始化，只能用于var类型，不能用于基本数据类型
    //getter和setter方法

}*/
class Student(var name: String, var age: Int) {
    constructor(name: String): this(name, 20){
        println("次构造函数")
    }//次构造函数 constructor关键字
    constructor():this("",19){
        println("次构造函数123")
    }//次构造函数 constructor关键字
    operator fun component1()=name
    operator fun component2()=age
}