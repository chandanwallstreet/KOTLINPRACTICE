package OOPS

fun main(){
  println("chandan".removefirstandlast())
}

fun String.removefirstandlast() : String{

        return this.substring(1, length-1)

}