package account;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Savings Account " + accountNumber + " (" + holderName + "), Balance: Rs. "
            + balance + ", Interest Rate: " + interestRate + "%");
    }
}
