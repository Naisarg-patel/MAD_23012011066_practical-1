fun findMaxNumber(numbers: ArrayList<Int>): Int? {
    if (numbers.isEmpty()) return null
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun main() {
    val numbers = arrayListOf(45, 12, 78, 34, 89, 23)
    println("ArrayList Elements: $numbers")

    val max = findMaxNumber(numbers)
    if (max != null) {
        println("Maximum Number: $max")
    } else {
        println("The list is empty.")
    }
}
