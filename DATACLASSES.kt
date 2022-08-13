fun main(){
   val p1 = Person(1,"John")
   val p2 = Person(1,"John")
   
   val p3 = p1.copy()  // Utility Functions
   println(p3)
//    println(p1) // toString -->comes from Any CLass
//    println(p2)
//    println(p1.hashCode())
//    println(p1==p2)
}

data class Person(val id: Int,val name:String)
{

}