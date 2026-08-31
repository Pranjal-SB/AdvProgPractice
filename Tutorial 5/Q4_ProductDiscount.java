abstract class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    double finalPrice() {
        return price - calculateDiscount();
    }

    void display() {
        System.out.println(name + " (ID " + productId + ") Price: Rs. " + price
            + ", Discount: Rs. " + calculateDiscount() + ", Final: Rs. " + finalPrice());
    }
}

class Electronics extends Product {
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    Books(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return price * 0.05;
    }
}

public class Q4_ProductDiscount {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Headphones", 2000),
            new Clothing(2, "Jacket", 1500),
            new Books(3, "Java Programming", 800)
        };

        for (Product p : products) {
            p.display();
        }
    }
}
