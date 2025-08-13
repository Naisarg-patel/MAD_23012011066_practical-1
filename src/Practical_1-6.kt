fun add(a:Int,b: Int){
    println("${a} + ${b} = ${a+b}")
}
fun sub(a:Int,b: Int){
    println("${a} - ${b} = ${a-b}")
}
fun mul(a:Int,b: Int){
    println("${a} * ${b} = ${a*b}")
}
fun divi(a:Int,b: Int){
    println("${a} / ${b} = ${a/b}")
}

fun main(){
    var n1 = 111
    var n2 = 2222
    print("enter + , - , * , / :")
    var n = readln()
    when(n){
        "+" -> add(n1,n2)
        "-" -> sub(n1,n2)
        "*" -> mul(n1,n2)
        "/" -> divi(n1,n2)

    }
}