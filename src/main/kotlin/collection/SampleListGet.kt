package collection

fun main() {
    val mixedList = listOf(1, "hello", 3.14, true, listOf(5, 6, 7), mapOf("name" to "John", "age" to 25))
  //  println(mixedList)
    val myList = listOf("one", "two","three","four")
  //  println(myList)
    for (i in myList){
  //      println(i)
    }


    // mutable list
    val mutablelist = mutableListOf("name", "age","dob")
    mutablelist.add("chandan")
 //   println(mutablelist)
    mutablelist.remove("name")
  //  println(mutablelist)

    //With foreach
    mutablelist.forEach{
        println(it)
    }
}