fun main(){
    
    val nums = listOf(1,2,3,4,5)

   // val list = nums.filter(::isOdd) Method 1
   //val list = nums.filter {a: Int -> a % 2!=0} //Method 2
   val list = nums.filter {it % 2!=0}  //Method 3

   val userList = listOf(
    User(1,"A"),
    User(2,"B"),
    User(3, "C")
   )
    println(userList.filter{it.id==2})
    println(list)
}

data class User(val id: Int, val name: String)

fun isOdd(a: Int): Boolean{
    return a % 2 !=0
}