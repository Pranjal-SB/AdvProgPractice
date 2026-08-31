class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : Rs. " + balance);
    }
}

public class Q1_BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1001, "Arun", 5000);

        account.deposit(2000);
        account.withdraw(1500);
        account.display();
    }
}
