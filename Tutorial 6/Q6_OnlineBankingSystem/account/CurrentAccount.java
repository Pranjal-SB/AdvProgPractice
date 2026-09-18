package account;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void displayDetails() {
        System.out.println("Current Account " + accountNumber + " (" + holderName + "), Balance: Rs. "
            + balance + ", Overdraft Limit: Rs. " + overdraftLimit);
    }
}
