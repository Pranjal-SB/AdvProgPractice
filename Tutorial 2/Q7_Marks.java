class Marks {
    int sub1, sub2, sub3;

    void calculate() {
        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
    }
}

public class Q7_Marks {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.sub1 = 85;
        m1.sub2 = 90;
        m1.sub3 = 78;
        m1.calculate();
    }
}
