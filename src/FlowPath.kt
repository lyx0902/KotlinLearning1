fun main(){
    //选择结构if-else
    var a=10
    var b=20
    if(a>b){
        println("a>b")
    }else{
        println("a<=b")
    }
    val res=if(a>b) "Yes" else "No" //if表达式
    println(res)
    //选择结构when
    var x=10
    when(x){
        1-> println("x=1")
        2-> println("x=2")
        else-> println("x is neither 1 nor 2")
    }
    b=1
    val value=when(b){
        1,3-> println("b=1")//多个条件
        2-> println("b=2")
        else-> println("b is neither 1 nor 2")
    }
    //循环结构
    //for循环
    val range:IntRange=1..10 //定义一个范围变量
    for (i in range){
        println(i)
        println("Hello $i")
    }
    for(i in range step 2){//步长为2
        if(i==5){continue}
        if(i==9){break}
        println(i)
    }
    for(i in range.reversed()){//倒序
        println(i)
    }
    for(i in 10 downTo 1){//倒序
        println(i)
    }
    //终止或加速循环
    outer@ for (i in 0..3) {   //在循环语句前，添加 标签@ 来进行标记
        inner@ for (j in 1..3) {
            if (i == j) break@outer  //break后紧跟要结束的循环标记，当i == j时终止外层循环
            println("$i, $j")
        }
    }
    print("Hello World")
}