fun main(){
    var p1 = Person("Tony",20)
    var p2 = Person("Pepper",21)
    var p3 = Person("Bannr",22)

    println(p1.age)
    println(p2.age)
    println(p3.age)
    println(p1.name)
    println(p2.name)
    println(p3.name)

}

class Person(nameParam: String, ageParam:Int)
{
    val name: String = nameParam
    var age: Int = ageParam
}