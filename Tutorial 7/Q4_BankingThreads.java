class TransactionTask implements Runnable {
    public void run() {
        for (int count = 1; count <= 3; count++) {
            System.out.println(Thread.currentThread().getName() + " - Processing transaction, run #" + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class BalanceUpdateTask implements Runnable {
    public void run() {
        for (int count = 1; count <= 3; count++) {
            System.out.println(Thread.currentThread().getName() + " - Updating balance, run #" + count);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SmsNotificationTask implements Runnable {
    public void run() {
        for (int count = 1; count <= 3; count++) {
            System.out.println(Thread.currentThread().getName() + " - Sending SMS notification, run #" + count);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Q4_BankingThreads {
    public static void main(String[] args) {
        Thread transactionThread = new Thread(new TransactionTask());
        Thread balanceThread = new Thread(new BalanceUpdateTask());
        Thread smsThread = new Thread(new SmsNotificationTask());

        transactionThread.setName("TransactionThread");
        balanceThread.setName("BalanceUpdateThread");
        smsThread.setName("SmsNotificationThread");

        transactionThread.start();
        balanceThread.start();
        smsThread.start();
    }
}
