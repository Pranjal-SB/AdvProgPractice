class Product {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Q1_ProductBilling {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(101, "Laptop", 50000, 1);
        products[1] = new Product(102, "Mouse", 500, 3);
        products[2] = new Product(103, "Keyboard", 1200, 2);
        products[3] = new Product(104, "Monitor", 8000, 1);
        products[4] = new Product(105, "Headphones", 1500, 4);

        for (int i = 0; i < products.length; i++) {
            Product p = products[i];
            double totalPrice = p.price * p.quantity;
            double discountRate = (totalPrice >= 5000) ? 0.10 : 0.05;
            double discount = totalPrice * discountRate;
            double finalPrice = totalPrice - discount;

            System.out.println("Product ID   : " + p.productId);
            System.out.println("Name         : " + p.name);
            System.out.println("Total Price  : Rs. " + totalPrice);
            System.out.println("Discount     : Rs. " + discount);
            System.out.println("Final Price  : Rs. " + finalPrice);
            System.out.println();
        }
    }
}
