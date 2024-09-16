import com.test.User//导入User类
fun main(){
    var stu=Student("张三",20)//创建对象，仅仅代表对象的引用
    var stu2=Student("李四",30)
    var stu3=Student("王五")
    val (a,b)=stu//解构声明
    println("姓名：$a 年龄：$b")
    //非空类型的变量是不允许为空的，如果为空会报错
    var stu4:Student?=null//可为空类型的变量而非引用对象
    //stu4!!.name//!!表示不为空，如果为空会报错 导致空指针异常
    if(stu4!=null){
        println(stu4.name)
    }
    println(stu.name)
    println(stu.age)
    val person=Person("张三")
    person.hello()
    println("User.name:${User().name}")
}
class Person constructor(val name:String){
    /*constructor(name:String,age:Int):this(name+age){
        println("次构造函数")
    }*/
    init{
        println("初始化代码块")
    }
    init {
        println("初始化代码块123")
    }
    fun hello(){
        println("我是${name},Hello")
    }
}