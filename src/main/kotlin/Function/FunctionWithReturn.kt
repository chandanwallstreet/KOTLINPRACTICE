package Function

fun main(){
   val add=  add(5,5)
    val best= bestWay(5,6)
   println(add)
    println(best)
}

fun add(one: Int , two: Int) : Int{
    return one+two
}

fun bestWay(one: Int , two: Int) : Int =one+two

