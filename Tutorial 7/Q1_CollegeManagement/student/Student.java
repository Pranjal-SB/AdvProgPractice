package student;

public class Student {
    public int rollNumber;
    public String name;
    public String department;

    public Student(int rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Dept: " + department);
    }
}
