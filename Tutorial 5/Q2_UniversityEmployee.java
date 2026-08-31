class Employee {
    String name;
    int empId;
    double basicSalary;

    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println(name + " (ID " + empId + ") Salary: Rs. " + calculateSalary());
    }
}

class Professor extends Employee {
    Professor(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

class LabAssistant extends Employee {
    LabAssistant(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.10);
    }
}

class AdministrativeStaff extends Employee {
    AdministrativeStaff(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.05);
    }
}

public class Q2_UniversityEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
            new Professor("Dr. Arun", 1, 60000),
            new LabAssistant("Priya", 2, 25000),
            new AdministrativeStaff("Ravi", 3, 20000)
        };

        for (Employee e : employees) {
            e.display();
        }
    }
}
