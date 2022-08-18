fun main(){
   val nums = listOf(1,2,3,4,5)

   val userList = listOf(
    User(1,"A"),
    User(2,"B"),
    User(3,"C")
   )
   val list = nums.map {it * it}

   val PaidUserlist = userList.map{
    PaidUser(it.id, it.name, "Paid")
   }
   println(PaidUserlist)
}

data class User(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)
// To convert of one form to another we use MAP