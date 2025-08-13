class Matrix(private val data: Array<IntArray>) {

    val rows = data.size
    val cols = data[0].size

    operator fun plus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result)
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result)
    }

    operator fun times(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(other.cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result)
    }

    override fun toString(): String {
        return data.joinToString("\n") { row ->
            row.joinToString(" ", "[", "]")
        }
    }
}
fun main() {
    val m1 = Matrix(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))
    val m2 = Matrix(arrayOf(intArrayOf(5, 6), intArrayOf(7, 8)))

    println("Matrix 1:\n$m1")
    println("Matrix 2:\n$m2")

    println("Addition:\n${m1 + m2}")
    println("Subtraction:\n${m1 - m2}")
    println("Multiplication:\n${m1 * m2}")
}
