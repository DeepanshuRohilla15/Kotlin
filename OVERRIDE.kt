fun main(){
       val onePlus = OnePlus("Smart Phone")
       onePlus.display()

    //    val generalMobile = Mobile("General")
    //    generalMobile.display()
}
open class Mobile(val type: String){
    open val name:String = ""
    open val size:Int =5

    fun makeCall() = println("Calling Mobile")
    fun powerOff()=println("Shutting Down")
    open fun display()=println("Simple Mobile Display")

}
class OnePlus(typeParam: String) : Mobile(typeParam)
{
    override val name:String = "One Plus"
    override val size:Int = 10
    override fun display()=println("One Plus Display")
 
}