fun main(){

val sum = {a:Int, b: Int -> a+b} // Define Lambda Function

val singleParamLambda = {x: Int -> x * x} 
val lambda2: (Int)->Int = {x -> x * x} //Explicitly define type

val sayHi = {msg: String -> println("Hello $msg")}

}

fun sum(a:Int, b:Int): Int{
    return a+b;
}
