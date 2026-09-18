import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(102, "Kiran Shah", "Information Technology");
        Course c1 = new Course(502, "Database Management Systems", 4);

        s1.display();
        c1.display();
    }
}
