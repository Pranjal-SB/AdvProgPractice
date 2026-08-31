import java.util.Scanner;

public class Q3_RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        System.out.println("Area of playground: " + area);

        sc.close();
    }
}
