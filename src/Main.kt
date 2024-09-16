//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
fun main() {
    println("Hello World")
    //变量的声明：var
    var a: Int;//声明临时变量
    var b: Int=10//赋值可以自动推断数据类型，不需要额外定义
    //val是只读变量不可修改，类似java中的final
    val c =10
    val d:Long=12
    val e=12L
    //无符号数的类型 对应的有UByte, UShort, UInt, ULong
    val f:UByte=10u //u表示无符号数8位
    val g:UShort=10U //U表示无符号数16位
    val h:UInt=10U  //U表示无符号数32位
    val i:ULong=10U //U表示无符号数64位
    //double 和float
    val j:Double=10.0 //double
    val k:Float=10.0f //float
    var l=b.toDouble()
    //字符运算
    var m='a'
    var n='b'
    println(m+ n.code) //字符的运算
    //位运算
    var o=10
    var p=20
    println(o and p) //按位与
    println(o or p) //按位或
    println(o xor p) //按位异或
    println(o shl 2) //左移2位
    println(o shr 2) //右移2位
    println(o ushr 2) //无符号右移2位
    println(o.inv()) //按位取反
    //类型转换
    var q=10
    var r=10.0
    var s=q.toDouble()
    var t=r.toInt()
    //BOOLean
    var u:Boolean=true
    var v:Boolean=false
    println(u)
    var w:Boolean?=null
    println(w)
    val xxxx=10
    println(xxxx in 1..10)
    println(xxxx in 1 until 10)
    println(xxxx !in 1..10)
    //逻辑运算符
    var aa=true
    var bb=false
    println(aa && bb)
    println(aa || bb)
    println(!aa)
    //字符串
    var cc:Char="hello".get(0)//获取第一个字符
    var zz:String="hello" //字符串
    var dd="hello".subSequence(0,2)//获取0-2的子字符串
    var ee="hello".substring(0,2)//获取0-2的子字符串
    var ff="hello".length//获取字符串长度
    var gg="hello".isEmpty()//判断字符串是否为空
    var hh="hello".isNotEmpty()//判断字符串是否不为空
    var ii="hello".contains("he")//判断字符串是否包含指定字符
    var jj="hello".startsWith("he")//判断字符串是否以指定字符开头
    var kk="hello".endsWith("lo")//判断字符串是否以指定字符结尾
    var ll="hello".toUpperCase()//转换为大写
    var mm="hello".toLowerCase()//转换为小写
    var nn="hello".capitalize()//首字母大写
    var oo="hello".decapitalize()//首字母小写
    var pp="hello".reversed()//反转字符串
    var qq="hello".replace("he","aa")//替换字符串
    var rr="hello".trim()//去除字符串两端空格
    var ss="hello".trimStart()//去除字符串开始空格
    var tt="hello".trimEnd()//去除字符串结尾空格
    var uu="hello".padStart(10,'a')//在字符串前面填充字符
    var vv="hello".padEnd(10,'a')//在字符串后面填充字符
    var ww="hello".repeat(3)//重复字符串
    var abcd:String="""hello
        |world
        |hello
    """.trimMargin()//多行字符串
    println(abcd)
    //数组
    var xx= arrayOf(1,2,3,4,5)
    var yy= arrayOfNulls<Int>(5)
    //浮点数
    println(b)
    var x=readLine()!!.toInt()
    var y=readLine()!!.toInt()
    var z=x+y;
    println(z)
    println(z+b)
}