class TrafficJunction extends Thread {
    private String status;
    private long interval;

    TrafficJunction(String name, String status, long interval) {
        super(name);
        this.status = status;
        this.interval = interval;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(getName() + " - Traffic status: " + status);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Q5_TrafficMonitoring {
    public static void main(String[] args) {
        TrafficJunction junction1 = new TrafficJunction("Junction-MGRoad", "Moderate", 400);
        TrafficJunction junction2 = new TrafficJunction("Junction-Silkboard", "Heavy", 600);
        TrafficJunction junction3 = new TrafficJunction("Junction-Hebbal", "Light", 800);

        junction1.start();
        junction2.start();
        junction3.start();
    }
}
