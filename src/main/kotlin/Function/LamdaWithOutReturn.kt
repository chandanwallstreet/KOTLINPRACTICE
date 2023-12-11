package Function

fun main()
{

    whatsurnmae("Chandan")
    println( myname("chndan"))
    //here the return type is void/unit so output shoud be kotlin.unit
    println( myname1("chndan"))
    myname1("chndan")
}

fun whatsurnmae(s: String) {
          println(s)
}

//Lamda

val myname: (String)->String= {  it }
val myname1: (String)->Unit= {  println( it) }