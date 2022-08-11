//      Kotlin allow SINGLE INHERITANCE

fun main() {
        val objChild = Child()
        objChild.myMethod()
        objChild.myMethod2() 
}
open class Phone {
    val name: String = ""  //Properties
    val type: String = ""
    val volume: Int = 10

    // Methods
    fun makeCall() {}     
    fun display() {}
    fun powerOff() {}
    fun getDeviceInfo() {}
}

class BasicPhone: Phone() {
    fun getScreenInfo() {}
}

class SmartPhone: Phone() {
    fun playMovie() {}
    fun takePicture() {}
    fun getLocation() {}
}

 open class Parent{

    init{
        println("Parent Constructor is called")
    }
    val name: String = ""

    fun myMethod(){
        println("I am in parent")
    }
 }
 class Child: Parent(){

     init{
        println("Child Constructor is called")
    }
    val name2: String = ""
    fun myMethod2() {
        println("I am in Child")
    }
 }