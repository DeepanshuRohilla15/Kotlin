 //Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 // 1. Abstract is by default open
 // 2.  CLass can't be instantiated
 // 3. Abstract class can have both abstract and non abstract properties and methods
 // 4. If a class has abstract method or property then class must be declared as abstract
 
fun main(){
    val circle = Circle(4.0)
    println(circle.area())
    circle.display()
}

abstract class Shape{
    var name : String = ""
    abstract fun area(): Double
    abstract fun display()
}

class Circle(val radius:Double): Shape(){
    override fun area(): Double= Math.PI*radius*radius
    override fun display(){
        println("Circle is getting displayed")
    }
}
