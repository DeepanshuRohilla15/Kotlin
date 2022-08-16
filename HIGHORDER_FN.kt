import kotlin.math.pow

fun main(){
    calculator(5.0,5.0, ::sum)
}

fun sum(a: Double,b: Double):Double {
    return a+b;
}

fun calculator(a: Double,b: Double, gn: (Double,Double)->Double){
    val result = gn(a,b)
    println(result)
}