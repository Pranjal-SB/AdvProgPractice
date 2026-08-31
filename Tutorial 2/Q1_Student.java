class StudentQ1 {
    String name;
    int rollNo;
    String department;
}

public class Q1_Student {
    public static void main(String[] args) {
        StudentQ1 s1 = new StudentQ1();
        s1.name = "Arjun";
        s1.rollNo = 101;
        s1.department = "CSE";

        System.out.println("Name       : " + s1.name);
        System.out.println("Roll No    : " + s1.rollNo);
        System.out.println("Department : " + s1.department);
    }
}
