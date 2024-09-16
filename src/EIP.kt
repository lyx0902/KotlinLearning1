fun main(){
    val student = StudentFast("Alice", 20)
    var student1=ArtStudent();
    test(student1)
    println(student.getName())
    println(student.getAge())
    student.setName("王刚")
    println(student.getName())
    student.hello()
    val artStudent = ArtStudent()
    artStudent.hello()
    artStudent.hello1()
    artStudent.study()
    var student2:Any=ArtStudent()
    var student3=StudentFast("Alice", 20)
    var student4=StudentFast("Alice", 20)
    println(student3.equals(student4))
    println(student3==student4)
    println(student3)
}//Encapsulation, inheritance, polymorphism
fun test(student: Student1){
    println(student is Student1)
    if(student is ArtStudent){
        student.study()
        student as Student1//强制类型转换
    }
}//每个kotlin类都有一个any的父类，类似于java的object类