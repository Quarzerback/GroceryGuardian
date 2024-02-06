// ProductManager.groovy
class ProductManager {
    List<Product> inventory = []

    void addProduct(String name, double price, int quantity) {
        Product newProduct = new Product(name, price, quantity)
        inventory.add(newProduct)
        println("Product added to inventory: ${newProduct.name}")
    }

    void displayInventory() {
        println("\nCurrent Inventory:")
        inventory.each { product ->
            println("Name: ${product.name} | Price: \$${product.price} | Quantity: ${product.quantity}")
        }
    }

    void trackStockLevels() {
        println("\nStock Levels:")
        inventory.each { product ->
            if (product.quantity <= 10) {
                println("Low stock alert for ${product.name}! Quantity: ${product.quantity}")
            }
        }
    }
}