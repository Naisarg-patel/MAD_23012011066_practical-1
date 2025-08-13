fun factorial(n: Int): Int{
    if(n == 0 || n == 1)
        return  1
    else
        return n * factorial(n-1)
}

fun main(){
    print("Enter Number:")
    var n = readln().toInt()
    var result = factorial(n)
    println("Factotal of ${n} = ${result}")
}
