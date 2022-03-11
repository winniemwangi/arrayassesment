import java.util.*
import kotlin.collections.ArrayList

fun main(){
    cars()
    cities()
    numbers()
    var names = animals(arrayOf("cow","chicken","horse",))
    println(names)

}
// functions that takes in four strings creates and print out an array
fun cars(){
    var types = arrayOf("toyota","bugatti","chevrolet","audi")
    println(types.contentToString())

}
fun cities(){
    var towns = arrayOf("harare","mumbai","dodoma","jakarta")
    towns.sortedArray().forEach { area ->
        println(area.capitalize())
    }
}
fun numbers(){
    var num = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var y =num[1]+num[4]
    println(y)
    println(num.indexOf(158))

    var z = num.sortedArray()
    println(Arrays.toString(z))
}
fun animals(x:Array<String>):String{
    var names = x.contentToString()
    return names

}