class RemainingTimeTask implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Remaining time: " + (30 - i * 10) + " min");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class AutoSaveTask implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Auto-saving answers...");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class NetworkCheckTask implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Network connection: OK");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Q3_OnlineExamSystem {
    public static void main(String[] args) {
        Thread timeThread = new Thread(new RemainingTimeTask());
        Thread saveThread = new Thread(new AutoSaveTask());
        Thread networkThread = new Thread(new NetworkCheckTask());

        timeThread.setName("TimeDisplayThread");
        saveThread.setName("AutoSaveThread");
        networkThread.setName("NetworkCheckThread");

        timeThread.start();
        saveThread.start();
        networkThread.start();
    }
}
