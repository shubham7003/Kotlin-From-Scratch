open class Parent{
    init{
        println("Parent's Constructor called")
    }
    val name:String = ""

    fun myMethod(){
        println("I am in Parent")
    }
}

class Child:Parent(){
    init{
        println("Child's constructor called")
    }
    val name2:String = ""

    fun mymethod2(){
        println("I am in Child")
    }
}

fun main(){
    val objChild = Child()

}

// Multiple Inheritance not allowed
