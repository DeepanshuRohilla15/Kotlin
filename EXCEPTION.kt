import java.lang.Exception
import java.lang.NullPointerException


fun main(){
    val arr = arrayOf(1,2,3)
    try{
        println(arr[5])
    }
    catch(ex: NullPointerException){

    }
    catch(e: Exception){
        println("Please check the array index")
    }
    finally{
        println("I will execute no matter what")
    }

    println("This will not run")
}
// try ek hi hoga 
// try ke saath ya to 'catch' or 'finally'
// catch more than one allowed