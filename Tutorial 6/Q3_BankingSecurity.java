interface BasicSecurity {
    void login(String username);
    void logout(String username);
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuth();
    void faceRecognitionAuth();
}

class BankingApplication implements AdvancedSecurity {
    public void login(String username) {
        System.out.println(username + " logged in");
    }

    public void logout(String username) {
        System.out.println(username + " logged out");
    }

    public void fingerprintAuth() {
        System.out.println("Fingerprint authentication successful");
    }

    public void faceRecognitionAuth() {
        System.out.println("Face recognition authentication successful");
    }
}

public class Q3_BankingSecurity {
    public static void main(String[] args) {
        BankingApplication app = new BankingApplication();

        app.login("Pranjal");
        app.fingerprintAuth();
        app.faceRecognitionAuth();
        app.logout("Pranjal");
    }
}
