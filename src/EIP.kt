fun main(){
    val student = StudentFast("Alice", 20)
    println(student.getName())
    println(student.getAge())
    student.setName("王刚")
    println(student.getName())
    student.hello()
    val artStudent = ArtStudent()
    artStudent.hello()
    artStudent.hello1()
    artStudent.study()
}//Encapsulation, inheritance, polymorphism