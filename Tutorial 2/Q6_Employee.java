class Employee {
    String name;
    String designation;
    double salary;

    void display() {
        System.out.println("Name        : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
    }
}

public class Q6_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Suresh";
        e1.designation = "Manager";
        e1.salary = 55000;

        Employee e2 = new Employee();
        e2.name = "Meena";
        e2.designation = "Developer";
        e2.salary = 42000;

        e1.display();
        e2.display();
    }
}
