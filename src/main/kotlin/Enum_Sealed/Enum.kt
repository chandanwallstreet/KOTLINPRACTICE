package Enum_Sealed

fun main() {

     Repository.fetchData()
     getData(result = Repository.getCurrentstate())
     Repository.Feached()
     getData(result = Repository.getCurrentstate())
     Repository.Error()
     getData(result = Repository.getCurrentstate())
}

object Repository{
    private var getCurrentState: Result = Result.Loading
    private var data: String? = null

    fun fetchData(){
        getCurrentState= Result.Loading
        data= "Mydata"
    }
    fun Feached(){
        getCurrentState= Result.Success
        data= null
    }
    fun Error(){
        getCurrentState= Result.Error
        data= "Mydata"
    }
    fun getCurrentstate(): Result {
        return getCurrentState
    }

}

fun getData(result: Result){
        when(result){
            Result.Loading ->{
                println("Loading.......")
            }
            Result.Error ->{
                println("Error.......")
            }
            Result.Success ->{
                println("Success.......")
            }
            Result.Failure ->{
                println("Fail.......")
            }

        }

}
enum class Result{
    Loading,
    Success,
    Failure,
    Error
}