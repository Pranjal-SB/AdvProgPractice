import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Q5_ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        Shape[] shapes = {
            new Circle(radius),
            new Rectangle(length, breadth),
            new Triangle(base, height)
        };

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " Area: " + s.calculateArea());
        }

        sc.close();
    }
}
