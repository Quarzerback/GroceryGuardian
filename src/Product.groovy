// Product.groovy
class Product {
    String name
    double price
    int quantity
    Supplier supplier

    Product(String name, double price, int quantity, Supplier supplier) {
        this.name = name
        this.price = price
        this.quantity = quantity
        this.supplier = supplier
    }
}