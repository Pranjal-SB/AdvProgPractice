import java.util.Scanner;

public class Q4_SwapRollNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number of student A: ");
        int a = sc.nextInt();
        System.out.print("Enter roll number of student B: ");
        int b = sc.nextInt();

        // (a) Using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap using temp variable:");
        System.out.println("A = " + a + ", B = " + b);

        // (b) Without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap without temp variable:");
        System.out.println("A = " + a + ", B = " + b);

        sc.close();
    }
}
