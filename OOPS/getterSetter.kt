class Person(nameParam:String, ageParam:Int){
    var name:String = nameParam
    get(){
        return field.uppercase()
    }
    var age:Int = ageParam
    set(value){
        if(value>0){
            field = value
        }else{
            println("Age can't be negative")
        }
    }

}

fun main(){
    val p1 = Person("shubham",21)
    // p1.age = 24
    p1.age = -21
    println(p1.name)
    println(p1.age)
}