class StudentQ5 {
    String name;
    int age;

    void display() {
        System.out.println("Name : " + name + ", Age : " + age);
    }
}

public class Q5_MultipleStudents {
    public static void main(String[] args) {
        StudentQ5 s1 = new StudentQ5();
        s1.name = "Karthik";
        s1.age = 19;

        StudentQ5 s2 = new StudentQ5();
        s2.name = "Divya";
        s2.age = 20;

        s1.display();
        s2.display();
    }
}
