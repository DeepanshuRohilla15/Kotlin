fun main(){
    val circle = Circle(4.0)
    val player= Player("tony")

     val arr = arrayOf(circle,player)
     for(obj in arr){  
        if(obj is Circle)  //type checking
        {
            println(obj.area())  
        }
        else{
            (obj as Player).sayMyName()  // Smart casting
        }
     }
}

interface Draggable{
    fun drag()
}

abstract class Shape: Draggable{
    abstract fun area(): Double
}

class Circle(val radius: Double):Shape(){
    override fun area():Double = Math.PI*radius*radius
    override fun drag()= println("Circle is dragging")
}

class Player(val name:String):Draggable{
    override fun drag()= println("$name is dragging")
    fun sayMyName()= println("Hey my name is - $name") 

}