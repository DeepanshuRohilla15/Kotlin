fun main(){
    // val mustang = Car("Mustang", "Petrol",  100)
    // val beetle = Car("Bettle", "Diesel", 200)

    // println(mustang.type)
    // println(mustang.name)

    // println(beetle.name)
    // println(beetle.type)

    // mustang.driveCar()
    // beetle.driveCar()
    val p1 = Person("Tony",36)
    val p2 = Person("Stark",10)

    println(p1.canVote())
    println(p2.canVote())  

    p2.age = 22
    println(p2.canVote())    

}

class Person(val name: String, var age:Int){
    fun canVote(): Boolean{
        return age>18
    }
}

// class Car (val name: String, val type: String, val kmRan: Int) //properties
// {
//     fun driveCar(){  // Method
//         println("$name Car is driving")
//     }

//     fun applyBrakes(){
//         println("Applied Brakes")
//     }
// }