// Main.groovy
class Main {
  static void main(String[] args) {
    ProductManager productManager = new ProductManager()

    // Test adding products
    productManager.addProduct("Milk", 2.49, 5)
    productManager.addProduct("Bread", 1.99, 15)
    productManager.addProduct("Eggs", 1.79, 25)

    // Test displaying inventory
    productManager.displayInventory()

    // Test tracking stock levels
    productManager.trackStockLevels()
  }
}