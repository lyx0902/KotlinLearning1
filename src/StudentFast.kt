class StudentFast(private var name: String, private var age: Int) {//权限控制符
    //open代表可以被继承
    //class StudentFast(private var name: String, private var age: Int)
    fun getName(): String = name
    fun getAge(): Int = age
    //getter and setter
    fun setName(name: String) {
        if(name.contains("刚"))
            return //return nothing
        this.name = name
    }
    fun setAge(age: Int) {
        this.age = age
    }
    fun test(){
        println("test")
    }
    fun hello() {
        println("Hello, I am $name, $age years old.")
    }
}
open class Student1{
    var name:String ="小明"//加open表示可以被继承
    init {
        println("I am a student.")
    }
    open fun hello(){
        println("Hello, I am $name.")
    }
    open fun hello1(){
        println("Hello, I am $name,I am a NJUST student.")
    }
}
class ArtStudent: Student1(){
    init {
        println("I am an art student.")
    }
    override fun hello1() {
        println("Hello, I am $name,I am an NJUST ART student.")
        super.hello1()
    }
    override fun hello()=println("Hello, I am an art student:${name}.")//override重写覆盖继承父类的函数继承
    fun study(){
        println("I am studying art.")
    }
}