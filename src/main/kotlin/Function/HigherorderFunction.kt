package Function

fun main() {
    higherOrderFunction("chandan"){
          add(13,14)
    }
    higherOrderFunctionWithInput("chandan"){
        println(it)
        add(13,14)
    }
}

fun higherOrderFunction(message: String, function: ()-> Int){
    println("$message   and  ${function()}")
}
fun higherOrderFunctionWithInput(message: String, function: (String)-> Int){
    println("$message   and  ${function("---------")}")
}

