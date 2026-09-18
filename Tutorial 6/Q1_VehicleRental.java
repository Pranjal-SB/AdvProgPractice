class Vehicle {
    String vehicleNumber;
    String brand;
    int speed;

    Vehicle(String vehicleNumber, String brand, int speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle " + vehicleNumber + " (" + brand + "), Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String vehicleNumber, String brand, int speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    void displayDetails() {
        System.out.println("Car " + vehicleNumber + " (" + brand + "), Speed: " + speed
            + " km/h, Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String vehicleNumber, String brand, int speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    void displayDetails() {
        System.out.println("Bike " + vehicleNumber + " (" + brand + "), Speed: " + speed
            + " km/h, Gear: " + (hasGear ? "Yes" : "No"));
    }
}

public class Q1_VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("KA01AB1234", "Toyota", 180, 4),
            new Bike("KA01XY5678", "Yamaha", 150, true)
        };

        for (Vehicle v : vehicles) {
            v.displayDetails();
        }
    }
}
