package Enum_Sealed


object Repository1{
    private var getCurrentState: Result1 = Result1.Loading
    private var data: String? = null

    fun fetchData(){
        getCurrentState= Result1.Loading
        data= "Mydata"
    }
    fun Feached(){
        getCurrentState= Result1.Success(data)
        data= null
    }
    fun Error(){
        getCurrentState= Result1.Error(Exception("Execption"))
    }
    fun getCurrentstate(): Result1 {
        return getCurrentState
    }

}

fun getData1(result: Result1){
    when(result){
       is Result1.Success ->{
           println(result.data?:"Wait a while")
                  }
        is Result1.Error ->{
            println(result.error.toString())
        }
        is Result1.Loading ->{
            println("Loading ---------")
        }
        is Result1.Failure ->{
            println("Failure ---------")
        }
    }

}
abstract class Result1{
   data class Success(val data: String?): Result1()
    data class Error(val error: Exception): Result1()
    object Loading: Result1()
    object Failure:Result1()
}
fun main() {

    Repository1.fetchData()
    getData1(result = Repository1.getCurrentstate())
    Repository1.Feached()
    getData1(result = Repository1.getCurrentstate())
    Repository1.Error()
    getData1(result = Repository1.getCurrentstate())
}