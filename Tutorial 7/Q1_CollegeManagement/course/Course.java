package course;

public class Course {
    public int courseId;
    public String courseName;
    public int credits;

    public Course(int courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public void display() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName + ", Credits: " + credits);
    }
}
