fun main(){
      dragObjects(arrayOf(Circle(4.0),Square(4.0),Triangle(2.0,3.0),Player("Smiley")))
}

fun dragObjects(objects: Array<Draggable>)
{
    for(obj in objects)
    {
        obj.drag()
    }
}

interface Draggable{
    fun drag()
}

abstract class Shape: Draggable{
    abstract fun area(): Double
    
}

class Circle(val radius:Double): Shape(){
    override fun area(): Double= Math.PI*radius*radius
    override fun drag()= println("Circle is dragging")

}

class Square(val side:Double): Shape(){
    override fun area():Double = side*side
    override fun drag() = println("Square is dragging")
}

class Triangle(val base:Double, val height:Double): Shape(){
    override fun area():Double = 0.5*base*height
    override fun drag()= println("Triangle is dragging")
}

class Player(val name: String)
{
    override fun drag()= println("$name is dragging")
}