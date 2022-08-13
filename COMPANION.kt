/*
    Only one companion is allowed per class
 */
fun main(){
     MyClass.f()
     MyClass.AnotherObject.g()
}

class MyClass{
    companion object MyObject{
        fun f(){
            println("Hello I am F from object")
        }
    }

    object AnotherObject{
        fun g(){
            println("Hello I am G from Another Object")
        }
    }
}