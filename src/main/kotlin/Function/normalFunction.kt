package Function

fun main(){
    calculate(1, 10,3)
}

fun calculate(first: Int, second: Int, multipleBy: Int) {
    for (i in first..second ){
        if (i%multipleBy == 0 ){
            println("$i number is decided by $multipleBy")
        }
    }

}
