package payment;

public class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via Card");
    }
}
