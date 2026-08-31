class Area {
    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }
}

public class Q5_AreaMethodOverloading {
    public static void main(String[] args) {
        Area a = new Area();

        System.out.println("Area of square    : " + a.calculateArea(5.0));
        System.out.println("Area of rectangle : " + a.calculateArea(4.0, 6.0));
        System.out.println("Area of circle    : " + a.calculateArea(7));
    }
}
