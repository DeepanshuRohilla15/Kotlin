fun main(){
     val shape = Shape()
     printArea(shape)

     val square = Square(4.0)
     printArea(square)
}

fun printArea(shape:Shape){
    println(shape.area())
}

open class Shape{
    open fun area():Double = 0.0
}

class Circle(val radius:Double):Shape(){
    override fun area():Double = Math.PI*radius*radius
}

class Square(val side:Double): Shape(){
    override fun area():Double = side*side
}

class Triangle(val base:Double, val height:Double): Shape(){
    override fun area():Double = 0.5*base*height
}