/*
         OBJECT EXPRESSION
        
    1. Anonymous Objects using object keyword.
    2. Replacement of Java's Anonymous Inner Class.
 */


fun main(){
     var obj = object : Cloneable{
        override fun clone(){
            println("I am clone")
        }
     }

     obj.clone()
}

interface Cloneable{
    fun clone()
}