import account.Account;
import account.SavingsAccount;
import account.CurrentAccount;
import payment.Payment;
import payment.SecurePayment;
import payment.OnlineTransaction;
import payment.UPIPayment;
import payment.CardPayment;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = {
            new SavingsAccount("SB1001", "Arjun Rao", 25000, 4.5),
            new CurrentAccount("CA2002", "Meera Nair", 80000, 50000)
        };

        for (Account a : accounts) {
            a.displayDetails();
        }

        Payment[] payments = { new UPIPayment(), new CardPayment() };
        for (Payment p : payments) {
            p.pay(2500);
            if (p instanceof SecurePayment) {
                ((SecurePayment) p).verifyPayment();
            }
            System.out.println(p.getClass().getSimpleName() + " is online transaction: "
                + (p instanceof OnlineTransaction));
        }
    }
}
