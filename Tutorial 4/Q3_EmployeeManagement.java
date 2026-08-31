class Employee {
    int empId;
    String name;
    double monthlySalary;

    Employee(int empId, String name, double monthlySalary) {
        this.empId = empId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
    }

    double annualSalary() {
        return monthlySalary * 12;
    }

    double bonus() {
        return isBonusEligible() ? annualSalary() * 0.10 : 0;
    }

    boolean isBonusEligible() {
        return monthlySalary >= 30000;
    }
}

public class Q3_EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(1, "Arun", 35000);
        employees[1] = new Employee(2, "Priya", 28000);
        employees[2] = new Employee(3, "Ravi", 42000);
        employees[3] = new Employee(4, "Divya", 25000);
        employees[4] = new Employee(5, "Kiran", 30000);

        for (Employee e : employees) {
            e.display();
            System.out.println("Annual Salary       : Rs. " + e.annualSalary());
            System.out.println("Bonus               : Rs. " + e.bonus());
            System.out.println("Bonus Eligible      : " + (e.isBonusEligible() ? "Yes" : "No"));
            System.out.println();
        }
    }
}
