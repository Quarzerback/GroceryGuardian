// Main.groovy
class Main {
  static void main(String[] args) {
    ProductManager productManager = new ProductManager()

    // Test adding products
    productManager.addProduct("Milk", 2.49, 50)
    productManager.addProduct("Bread", 1.99, 100)

    // Test displaying inventory
    productManager.displayInventory()
  }
}