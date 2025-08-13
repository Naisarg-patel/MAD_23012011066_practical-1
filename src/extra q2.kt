open class Product(
    val productName: String,
    val quantity: Int,
    val amountPerQuantity: Double
) {
    constructor() : this("Unknown", 0, 0.0)

    fun totalAmount(): Double = quantity * amountPerQuantity
}
class Laptop(
    productName: String,
    quantity: Int,
    amountPerQuantity: Double,
    val cpu: String,
    val ram: String,
    val hdd: String
) : Product(productName, quantity, amountPerQuantity) {

    constructor() : this("Laptop", 1, 50000.0, "Intel i5", "8GB", "512GB SSD")

    override fun toString(): String {
        return """
            Product Name: $productName
            Quantity: $quantity
            Amount per Quantity: ₹$amountPerQuantity
            Total Amount: ₹${totalAmount()}
            CPU: $cpu
            RAM: $ram
            HDD: $hdd
        """.trimIndent()
    }
}

fun main() {
    val laptops = arrayListOf(
        Laptop("Dell Inspiron", 2, 45000.0, "Intel i5", "8GB", "1TB HDD"),
        Laptop("HP Pavilion", 1, 55000.0, "Intel i7", "16GB", "512GB SSD"),
        Laptop("Lenovo ThinkPad", 3, 60000.0, "AMD Ryzen 5", "8GB", "256GB SSD"),
        Laptop("Asus VivoBook", 1, 48000.0, "Intel i3", "4GB", "1TB HDD"),
        Laptop("Apple MacBook Air", 1, 95000.0, "Apple M1", "8GB", "256GB SSD")
    )

    for (laptop in laptops) {
        println("----- Laptop Info -----")
        println(laptop)
    }
}
