import java.util.Scanner;

public class Q8_MonthlySalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter allowance: ");
        double allowance = sc.nextDouble();

        double totalSalary = basic + allowance;
        System.out.println("Total salary: " + totalSalary);

        sc.close();
    }
}
