class Patient {
    String name;
    double consultationFee;

    Patient(String name, double consultationFee) {
        this.name = name;
        this.consultationFee = consultationFee;
    }

    double finalAmount(double discountRate) {
        return consultationFee - (consultationFee * discountRate);
    }

    void display(double discount, double finalAmount) {
        System.out.println("Patient Name        : " + name);
        System.out.println("Consultation Fee    : Rs. " + consultationFee);
        System.out.println("Discount            : Rs. " + discount);
        System.out.println("Final Amount        : Rs. " + finalAmount);
        System.out.println();
    }
}

public class Q4_HospitalBilling {
    public static void main(String[] args) {
        Patient[] patients = new Patient[5];
        patients[0] = new Patient("Arun", 2500);
        patients[1] = new Patient("Priya", 1500);
        patients[2] = new Patient("Ravi", 3000);
        patients[3] = new Patient("Divya", 1000);
        patients[4] = new Patient("Kiran", 2000);

        for (Patient p : patients) {
            double discountRate = (p.consultationFee >= 2000) ? 0.10 : 0.05;
            double discount = p.consultationFee * discountRate;
            double finalAmount = p.finalAmount(discountRate);
            p.display(discount, finalAmount);
        }
    }
}
