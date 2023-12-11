package Function

fun main(){

    val addNumber = add(2,4)
    if(checkage(addNumber)){
          println("$addNumber is adult")
    }
    else{
        println("$addNumber is young")
    }
}

fun checkage(addnumber: Int): Boolean {
   return  addnumber>18
}
