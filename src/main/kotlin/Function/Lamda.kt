package Function



fun main() {

    val sum = adding(44, 66)
    println(calwithIt(sum) )
    println(cal(sum) )
    println(calculateAge(sum) )
}
val adding: ( Int,Int) -> Int= { a, b ->a+b}

fun calculateAge(a: Int): Int =  a * 10

// converting it to boolean
 val cal: (Int)->Int = { a-> a*10}
val calwithIt: (Int)->Int = { it*10}