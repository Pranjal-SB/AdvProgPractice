class StudentQ3 {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }
}

public class Q3_StudentRegistration {
    public static void main(String[] args) {
        StudentQ3 s1 = new StudentQ3();
        s1.name = "Priya";
        s1.rollNo = 205;
        s1.display();
    }
}
