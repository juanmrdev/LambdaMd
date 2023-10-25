fun main(args: Array<String>) {


    println(expensiveProducts)
}

typealias ValidatePrice = (Product) -> Boolean

data class Product(val name: String, val price: Double)

val products = listOf(
    Product("Laptop", 999.99),
    Product("Smartphone", 599.99),
    Product("Headphones", 79.99),
    Product("Tablet", 299.99)
)

val filterExpensiveProducts: ValidatePrice = { product ->
    product.price > 100.0
}

val expensiveProducts = products.filter(filterExpensiveProducts)







