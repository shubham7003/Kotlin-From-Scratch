class car(val name : String, val type : String, var kmRan : Int ){
    fun drive(){
        println("$name driving")
    }

    fun newbie(): Boolean{
        return kmRan < 50
    }
}

fun main(){
    val c1 = car("Mustang","petrol", 100)
    val c2 = car("Brezza","petrol",21)
    println(c1.drive())
    println(c1.newbie())
    println(c2.newbie())
}
