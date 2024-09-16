typealias Number=Int
fun main(){
    val str:String= readln()
    println(str)
    //Math类的方法
    /*
    println(Math.abs(-10)) //绝对值
    println(Math.max(10,20)) // 最大值
    println(Math.min(10,20)) //最小值
    println(Math.pow(2.0,3.0)) //2的3次方
    println(Math.sqrt(4.0)) //开平方
    println(Math.cbrt(8.0)) //开立方
    println(Math.round(10.5)) //四舍五入
    println(Math.floor(10.5)) //向下取整
    println(Math.ceil(10.5)) //向上取整
    println(Math.random()) //生成0-1之间的随机数
    println(Math.sin(30.0)) //正弦/余弦/正切
    println(Math.cos(30.0))
    println(Math.tan(30.0))
    println(Math.asin(0.5)) //反正弦/反余弦/反正切
    println(Math.acos(0.5))
    println(Math.atan(0.5))
    println(Math.toDegrees(30.0))//角度转弧度
    println(Math.toRadians(30.0))//弧度转角度
    println(Math.exp(2.0)) //e的2次方
    println(Math.log(2.0)) //以e为底的对数
    println(Math.log10(2.0)) //以10为底的对数
    println(Math.log1p(2.0)) //以e为底的对数+1
    println(Math.hypot(3.0,4.0))//求两个数的平方和的平方根
    println(Math.sinh(30.0)) //双曲正弦/双曲余弦/双曲正切
    println(Math.cosh(30.0))
    println(Math.tanh(30.0))
    */
    //表示一个接受String类型参数的函数，返回值为String类型
    var func:(String)->Int
    //表示一个接受两个Int类型参数的函数，返回值为Int类型
    var func1:((String)->Number)->(((String)->Number)->Unit)// 函数类型的嵌套
    var func2:(String)->Int=fun(str:String):Int{return 10}//匿名函数:函数的接口 函数式编程
    var func3:(String)->Int={str->120}//lambda表达式
    var func4:(String,String)->Int={//表示一个接受String作为参数返回值为Int类型的函数
        a,b->
        println(a)
        println(b)//分行写
        10
    }//lambda表达式
    var func5:(String,String)->Int={//表示一个接受String作为参数返回值为Int类型的函数
            _,b->//不使用的参数可以用_代替
        println(b)//分行写
        10
    }//lambda表达式
    println(func2(""))
    println(func3(""))
    func4("Hello","World")
    func5("Hello","World")
    test{
        println(it)
        10
    }
    //func作为函数类型参数，首先处理func调用，而这个func函数体中会打印it的值，然后返回10，之后test函数会打印10，所以最终结果为Hello 10
    //函数作为参数传递的位置一定是在参数的最后一个位置，否则会报错
    //流程控制
    val func6: (Int) -> String = test1@{
        //比如这里判断到it大于10就提前返回结果
        if(it > 10) return@test1 "我是提前返回的结果"
        println("我是正常情况")
        "收到的参数为$it"
    }//lambda表达式 闭包
    test1(func6)

    testName {  //默认使用函数名称
        if(it > 10) return@testName "我是提前返回的结果"
        println("我是正常情况")
        "收到的参数为$it"
    }
    test2{
        return//lambda在内联函数中可以使用return导致函数提前返回，可以用标签来指定返回的位置
    }
    println("123")
}
fun test(func:(String)->Int){
    println(func("Hello"))
}//函数作为参数传递
fun test1(func:(Int)->String){
    println(func(20))
}//函数作为参数传递
fun testName(func: (Int) -> String) {
    println(func(66))
}//函数作为参数传递
//内联函数
inline fun test2(func:(Int)->String){
    println(func(20))
}//在编译时将函数体内联到调用处，减少函数调用的开销，提高性能