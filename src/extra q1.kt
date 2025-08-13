fun main(){
    var a = 10
    var b = 20
    var x = 10
    var y = 20
    println("before swaping: a = ${a}, b = ${b}")
    var temp = a
    a = b
    b = temp
    println("swaping using third variable:")
    println("a = ${a}, b = ${b}")
    println("before swaping: a = ${x}, b = ${y}")
    x = x + y
    y = x - y
    x = x - y
    println("swaping withou using third variable:")
    println("a = ${x}, b = ${y}")
}