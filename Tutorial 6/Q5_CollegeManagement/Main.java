import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Arjun Rao", "Computer Science");
        Course c1 = new Course(501, "Advanced Programming Practices", 4);

        s1.display();
        c1.display();
    }
}
