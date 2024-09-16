class StudentFast(private var name: String, private var age: Int) {//权限控制符
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
    fun hello() {
        println("Hello, I am $name, $age years old.")
    }
}