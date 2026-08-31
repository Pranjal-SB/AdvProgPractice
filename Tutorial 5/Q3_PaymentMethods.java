abstract class PaymentMethod {
    abstract void makePayment(double amount);
}

class UPI extends PaymentMethod {
    void makePayment(double amount) {
        System.out.println("Paid Rs. " + amount + " via UPI");
    }
}

class CreditCard extends PaymentMethod {
    void makePayment(double amount) {
        System.out.println("Paid Rs. " + amount + " via Credit Card");
    }
}

class NetBanking extends PaymentMethod {
    void makePayment(double amount) {
        System.out.println("Paid Rs. " + amount + " via Net Banking");
    }
}

public class Q3_PaymentMethods {
    public static void main(String[] args) {
        String selectedMethod = "UPI";
        double amount = 1500;

        PaymentMethod payment;
        switch (selectedMethod) {
            case "UPI":
                payment = new UPI();
                break;
            case "CreditCard":
                payment = new CreditCard();
                break;
            default:
                payment = new NetBanking();
        }

        payment.makePayment(amount);
    }
}
