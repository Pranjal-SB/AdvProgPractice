class Rectangle {
    double length;
    double breadth;

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of room: " + area);
    }
}

public class Q4_Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 12.5;
        r1.breadth = 10.0;
        r1.calculateArea();
    }
}
