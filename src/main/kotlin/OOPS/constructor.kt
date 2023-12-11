package OOPS

class car(color: String= "---",model: String= "lllll") {

    var color= color
    var model = model
}

fun main(){

 val  car= car(color = "blue", model= "i20")
    println(car.color )
    println(car.model )
}