package collection

fun main() {

val emptylist= emptyList<Any>()
    //unmutable
    emptylist.get(0)
// Set
    val myset = setOf(1,2,3,4)
    myset.forEach{
        println(it)
        println()
    }
    val mutableSet= mutableSetOf(1,2,3,4,5)
    mutableSet.add(3)
    //it will not take duplecate
    mutableSet.forEach{
      //  println(it)
    }

    //dufferent way to initialize
    val myset2= mutableSetOf<Any>()
    myset2.add(1)
    myset2.add("1")
    //map
    val mymap= mapOf("one" to 1, "two" to 2)
  //  println(mymap)

    val myMutablemap= mutableMapOf("one" to 1
                                    , "two " to 23)

    myMutablemap["three"] to 3
    println(myMutablemap)

    val myMutablemap3= mutableMapOf<String, Any>()
}