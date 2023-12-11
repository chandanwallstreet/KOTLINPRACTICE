package Function

fun main(){
    calculate1(first= 20, second = 200, message = "number is decided by", multipleBy = 4)
}

 fun calculate1(first: Int= 10,
                       second: Int=100,
                       message: String,
                       multipleBy: Int) {
    for (i in first..second) {
        if (i % multipleBy == 0) {
            println("$i $message $multipleBy")
        }
    }
}