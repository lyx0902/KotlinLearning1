class StudentFast(private var name: String, private var age: Int) {
    fun getName(): String = name
    fun getAge(): Int = age
    //getter and setter
    fun setName(name: String) {
        this.name = name
    }
    fun setAge(age: Int) {
        this.age = age
    }
}