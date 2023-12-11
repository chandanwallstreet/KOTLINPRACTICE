package collection

fun main() {
    val list = listOf("a", "b", "f")
  val new=  list.filter {
        it== "a"
      
    }
    println(new)
}