// Main.groovy
class Main {
  static void main(String[] args) {
    ProductManager productManager = new ProductManager()

    // Test adding products and suppliers
    productManager.addSupplier("ABC Supplier", "123-456-7890")
    productManager.addProduct("Milk", 2.49, 5, productManager.suppliers[0])
    productManager.addProduct("Bread", 1.99, 15, productManager.suppliers[0])

    // Test displaying inventory and suppliers
    productManager.displayInventory()
    productManager.displaySuppliers()

    // Test receiving stock
    productManager.receiveStock("Milk", 10)
    productManager.displayInventory()
  }
}