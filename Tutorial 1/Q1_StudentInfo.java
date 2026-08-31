import java.util.Scanner;

public class Q1_StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter register number: ");
        String regNo = sc.nextLine();
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
        System.out.print("Enter year of study: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter college name: ");
        String college = sc.nextLine();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name           : " + name);
        System.out.println("Register No    : " + regNo);
        System.out.println("Department     : " + dept);
        System.out.println("Year of Study  : " + year);
        System.out.println("College        : " + college);

        sc.close();
    }
}
