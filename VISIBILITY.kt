/*    Modifiers    Top Level Declarations    Class Members
    1.  public          Everywhere            Everywhere                 
    2.  internal        With in a module      With in a module
    3.  private         With in file          With in class
    4. protected        N/A                   Subclasses
 */


fun main(){
    val obA = A()
    val obB = B()
}

open class A{
    public var p =10
    private var q = 20
    internal var r= 30
    protected var s= 40
}

class B: A(){
    fun test(){
        println(p)
        println(q)
        println(r)
        println(s)
    }
}