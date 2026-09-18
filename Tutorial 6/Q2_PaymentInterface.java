interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via UPI");
    }
}

class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " via Net Banking");
    }
}

public class Q2_PaymentInterface {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(),
            new UPIPayment(),
            new NetBankingPayment()
        };

        for (Payment p : payments) {
            p.pay(1500);
        }
    }
}
