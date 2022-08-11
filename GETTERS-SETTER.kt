fun main(){
 

    val p1 = Person("deepanshu rohilla",21)
    println(p1.age)
    p1.age=-2
    println(p1.name)

}
   
  class Person(nameParam:String, ageParam:Int){
    var name:String = nameParam
    get(){
        return field.toUpperCase()
    }

    var age:Int = ageParam
    set(value){
         if(value>0)
         {
            field = value
         }
         else
         {
            println("Age can't be negative")
         }
    }
  }

// class Calculator{
//     fun add(a:Int,b:Int):Int
//     {
//         return a+b;
//     }
//     fun mutliply(a:Int,b:Int):Int
//     {
//          return a*b;
//     }
// }