// ProductManager.groovy
class ProductManager {
    List<Product> inventory = []
    List<Supplier> suppliers = []

    void addProduct(String name, double price, int quantity, Supplier supplier) {
        Product newProduct = new Product(name, price, quantity, supplier)
        inventory.add(newProduct)
        println("Product added to inventory: ${newProduct.name}")
    }

    void addSupplier(String name, String contactNumber) {
        Supplier newSupplier = new Supplier(name, contactNumber)
        suppliers.add(newSupplier)
        println("Supplier added: ${newSupplier.name}")
    }

    void displayInventory() {
        println("\nCurrent Inventory:")
        inventory.each { product ->
            println("Name: ${product.name} | Price: \$${product.price} | Quantity: ${product.quantity} | Supplier: ${product.supplier.name}")
        }
    }

    void displaySuppliers() {
        println("\nCurrent Suppliers:")
        suppliers.each { supplier ->
            println("Name: ${supplier.name} | Contact Number: ${supplier.contactNumber}")
        }
    }

    void receiveStock(String productName, int quantity) {
        Product product = inventory.find { it.name == productName }
        if (product) {
            product.quantity += quantity
            println("Received ${quantity} units of ${productName}. Updated inventory.")
        } else {
            println("Product not found in inventory: ${productName}")
        }
    }
}