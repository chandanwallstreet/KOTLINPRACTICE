package OOPS

class vicle(var color: String= "---",var model: String= "lllll") {

    // if we will add init block it will run at the time of initialization
    // And the value pass at the time of initialization will be ignored
    init {
        color= "monkey"
        model = "Audi"
    }

}


fun main(){

    val  vicle= vicle(color = "blue", model= "i20")

    // if we will pass any value after initialization , the value what we gave inside init and constructor
    //it will be ignored

    vicle.color = "tiger"
    vicle.model = "sorf"

    println(vicle.color )
    println(vicle.model )
}