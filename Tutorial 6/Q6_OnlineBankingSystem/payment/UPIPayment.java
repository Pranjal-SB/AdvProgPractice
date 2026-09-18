package payment;

public class UPIPayment implements SecurePayment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via UPI");
    }

    public void verifyPayment() {
        System.out.println("UPI payment verified via OTP");
    }
}
