class Car {
    String model;
    double price;

    Car() {
        model = "Not Specified";
        price = 0;
    }

    Car(String model) {
        this.model = model;
        this.price = 0;
    }

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model : " + model + ", Price : " + price);
    }
}

public class Q4_CarConstructorOverloading {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Swift");
        Car c3 = new Car("Creta", 1200000);

        c1.display();
        c2.display();
        c3.display();
    }
}
