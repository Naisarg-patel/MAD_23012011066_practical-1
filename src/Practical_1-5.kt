fun main(){
    print("Enter Number for Months:")
    var N = readln().toInt()
    var M = when(N){
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "Jun"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "Octomber"
        11 -> "November"
        12 -> "Dcember"
        else -> "Enter valid Number."
    }
    println("${M}")
}