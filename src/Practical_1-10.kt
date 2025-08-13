class Car(var type: String, var model: String, var price: Double, var owner: String, var milesdriven: Double) {
    fun displayCarInfo() {
        println("----------------------------------------------")
        println("----------------------------------------------")
        println("Model: $model")
        println("Type: $type")
        println("Owner: $owner")
        println("Miles Driven: $milesdriven")
        println("Original Price: $price")
        println("----------------------------------------------")
        println("----------------------------------------------")
        println("")
    }
}

fun main() {
    val c = Car(type = "Sedan", model = "Toyota Etios VXD", price = 1100000.0, owner = "Naisarg", milesdriven = 50000.0)
    c.displayCarInfo()
}
