var a = 10//全局变量,jvm中的静态变量,可以在其他函数体中直接调用
    get()=field+10//自定义get方法
    set(value) {
        println("Value: $value")
        field=value+100//自定义set方法
    }
    //val不能设置set方法
var <T> List<T>.lastIndex: Int
    get() = size * size
    set(value) {
        //size = value + 1
    }
//自动生成get和set方法 通过get和set方法可以对属性进行操作 通过field关键字可以获取属性的值 通过value关键字可以设置属性的值
fun main() {
    val result = add(10, 20)
    println("Result: $result")
    val result1 = delete(20, 10)
    println("Result: $result1")
    val result2 = delete1(20, 10)
    println("Result: $result2")
    void()
    test()
    println(a)
}
//function to add two numbers
fun add(i: Int, i1: Int): Any {
    return i + i1
}
fun delete(i: Int, i1: Int): Int {
    return i - i1
}
fun delete1(i: Int, i1: Int) = i - i1//简化函数自动推断返回值类型
//形参无法直接调用，只能在函数内部使用，实参可以直接调用，实参是调用函数时传递的参数，形参是函数定义时的参数
fun add1(i: Int, i1: Int): Int {
    //i=20//传入的形参视为val类型，其修饰的变量不可变，不能再次赋值
    fun test()="666"//函数内部定义函数,只能在函数内部调用,不能在函数外部调用
    return i + i1+test().toInt()
}
fun void() {//Unit 表示没有返回值
    println("Hello")
}
fun test(Message:String="Hello"){//默认参数在函数中预设
    println(Message)
}