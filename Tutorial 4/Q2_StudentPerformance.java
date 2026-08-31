class Student {
    int rollNumber;
    String name;
    double[] marks;
    double attendance;

    Student(int rollNumber, String name, double[] marks, double attendance) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }
}

public class Q2_StudentPerformance {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Arun", new double[] {80, 75, 90}, 85);
        students[1] = new Student(2, "Priya", new double[] {60, 55, 40}, 70);
        students[2] = new Student(3, "Ravi", new double[] {90, 88, 95}, 92);
        students[3] = new Student(4, "Divya", new double[] {45, 50, 40}, 60);
        students[4] = new Student(5, "Kiran", new double[] {70, 65, 72}, 80);

        int topIndex = 0;
        double topAverage = -1;

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            double total = 0;
            for (int j = 0; j < s.marks.length; j++) {
                total += s.marks[j];
            }
            double average = total / s.marks.length;

            String result = (average >= 50) ? "Pass" : "Fail";
            String scholarship = (average >= 75 && s.attendance >= 80) ? "Eligible" : "Not Eligible";
            String grade = (average >= 85) ? "Excellent" : "Good";

            System.out.println("Roll No       : " + s.rollNumber);
            System.out.println("Name          : " + s.name);
            System.out.println("Total Marks   : " + total);
            System.out.println("Average Marks : " + average);
            System.out.println("Result        : " + result);
            System.out.println("Scholarship   : " + scholarship);
            System.out.println("Performance   : " + grade);
            System.out.println();

            if (average > topAverage) {
                topAverage = average;
                topIndex = i;
            }
        }

        System.out.println("Highest Average: " + students[topIndex].name + " (" + topAverage + ")");
    }
}
