package Enum_Sealed

import java.io.IOException
import java.lang.Error


object SealedRepo{
    private var getCurrentState: resource = resource.Loading
    private var data: String? = null

    fun fetchData(){
        getCurrentState= resource.Loading
        data= "Mydata"
    }
    fun Feached(){
        getCurrentState= resource.Success(data)
        data= null
    }
    fun Error(){
        getCurrentState= resource.Error(Exception("Execption"))
    }
    fun anotherFailure(){
        getCurrentState= customeFailure.anotherfaiolure(another = java.lang.NullPointerException("----"))
    }
    fun customFailure(){
        getCurrentState= customeFailure.custumefailure(custumefailure = IOException("*****"))
    }
    fun getCurrentstate(): resource {
        return getCurrentState
    }

}

fun get(result: resource){
    when(result){
        is resource.Success ->{
            println(result.data?:"Wait a while")
        }
        is resource.Error ->{
            println(result.error.toString())
        }
        is resource.Loading ->{
            println("Loading ---------")
        }
        is resource.Failure ->{
            println("Failure ---------")
        }
        is  customeFailure.custumefailure->
        {
            println(result.custumefailure.toString())
        }
        is customeFailure.anotherfaiolure->{
            println(result.another.localizedMessage)
        }
    }

}
sealed class resource{
    data class Success(val data: String?): resource()
    data class Error(val error: Exception): resource()
    object Loading: resource()
    object Failure:customeFailure()

}

sealed class customeFailure: resource()
{
    data class custumefailure(val custumefailure: IOException): customeFailure()
    data class anotherfaiolure(val another : NullPointerException): customeFailure()
}
fun main() {

    SealedRepo.fetchData()
    get(result = SealedRepo.getCurrentstate())
    SealedRepo.Feached()
    get(result = SealedRepo.getCurrentstate())
    SealedRepo.Error()
    get(result = SealedRepo.getCurrentstate())
    SealedRepo.customFailure()
    get(result = SealedRepo.getCurrentstate())
    SealedRepo.anotherFailure()
    get(result = SealedRepo.getCurrentstate())
}