class EmployeeDetails {
    int empId;
    String empName;
    double salary;

    EmployeeDetails(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
    }
}

public class Q3_EmployeeConstructor {
    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails(101, "Rahul", 45000);
        e1.display();
    }
}
