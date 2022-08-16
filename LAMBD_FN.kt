import kotlin.math.pow

fun main(){
    println(sum(2.0,3.0))
    println(power(2.0,3.0))

    var fn = ::sum
    println(fn(2.0,4.0))
}

fun sum(a: Double,b: Double): Double{
    return a+b;
}
fun power(a: Double,b: Double): Double{
    return a.pow(b)
}