open class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
) {
    constructor() : this("Unknown", "Unknown", 0)

    override fun toString(): String {
        return "Name: $firstName $lastName, Age: $age"
    }
}

class Student(
    firstName: String,
    lastName: String,
    age: Int,
    val enrollmentNo: String,
    val branch: String,
    val studentClass: String,
    val labBatch: String
) : Person(firstName, lastName, age) {

    constructor() : this("John", "Doe", 20, "EN123456", "CSE", "TY", "B1")

    override fun toString(): String {
        return """
            ${super.toString()}
            Enrollment No: $enrollmentNo
            Branch: $branch
            Class: $studentClass
            Lab Batch: $labBatch
        """.trimIndent()
    }
}

fun main() {
    val students = arrayListOf(
        Student("Naisarg", "Patel", 19, "066", "CE", "TY", "A2"),
        Student("Anuj", "Patel", 20, "028", "IT", "TY", "B2"),
        Student("Kavya", "Joshi", 22, "071", "EC", "FY", "C1"),
        Student("Sneha", "Mehta", 19, "099", "ME", "SY", "D1"),
        Student("Karan", "Desai", 23, "070", "CE", "TY", "A2")
    )

    for (student in students) {
        println("----- Student Info -----")
        println(student)
    }
}
