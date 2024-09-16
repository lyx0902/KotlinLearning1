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