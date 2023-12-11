package AdvanceConcept

class Generics<T>(val elements: List<T>) {

    fun Finder(element: T ,function: (element: T?)-> Unit)
    {

   val item= elements.filter {
       it == element
   }
        if(item.isNullOrEmpty()) {
            function(null)
        }
        else{
            function(item.first())
        }

    }


}

fun main() {
    val list= listOf("ckr","QWWw","Wwww","Wwwww")
    val list2= listOf(1,2,3)
    val listofitems = Generics(list2)
     listofitems.Finder(3){
      println(it)
  }
}