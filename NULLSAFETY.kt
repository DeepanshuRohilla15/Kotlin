fun main(){
    var gender: String = "Male" //Female, Others
    var gender2: String? = null  //accept null also
    var isAdult: Boolean? = true

    if(gender2 != null){
        println(gender2.toUpperCase())
    }

    println(gender2?.toUpperCase())

    gender2?.Let{
        println("Line 1")
        println("Line 2 $gender")
        println("Line 3 $it")
    }

     var selected = gender2 ?: "NA"
     var value = gender2!!.toUpperCase()

}