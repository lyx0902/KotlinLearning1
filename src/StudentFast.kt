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
    override fun equals(other: Any?): Boolean {
        if(this === other) return true  //如果引用的是同一个对象，肯定是true不多逼逼
        if(other !is StudentFast) return false //如果要判断的对象根本不是Student类型的，那也不用继续了
        if(name != other.name) return false  //判断名字是否相同
        if(age != other.age) return false  //判断年龄是否相同
        return true   //都没问题，那就是相等了
    }
    override fun toString(): String {  //直接重写toString函数
        return "Student(name='$name', age=$age)"
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