/*    1. Class and its Single Object is created at once.
     2. No constructors are allowed
      3. Singleton pattern
      4. You can inherit class/interface.
 */
fun main(){
     Sharing.increamentTlikes()
     Sharing.increamentTlikes()
     Sharing.increamentTlikes()
     Sharing.increamentFlikes()
     Sharing.display()
}

object Sharing{
   private var twitterLikes=0
    private var fbLikes=0

    fun increamentTlikes()= twitterLikes++
    fun increamentFlikes()= fbLikes++
    fun display()= println("Facebook - $fbLikes --- Twitter - $twitterLikes")
}
