interface Confidential {
}

class Document {
    String title;

    Document(String title) {
        this.title = title;
    }
}

class Invoice extends Document {
    Invoice(String title) {
        super(title);
    }
}

class SalarySlip extends Document implements Confidential {
    SalarySlip(String title) {
        super(title);
    }
}

class MeetingNotes extends Document implements Confidential {
    MeetingNotes(String title) {
        super(title);
    }
}

public class Q4_DocumentTagging {
    public static void main(String[] args) {
        Document[] documents = {
            new Invoice("Invoice #1042"),
            new SalarySlip("Salary Slip - August"),
            new MeetingNotes("Board Meeting Minutes")
        };

        for (Document d : documents) {
            String status = (d instanceof Confidential) ? "Confidential" : "Public";
            System.out.println(d.title + " -> " + status);
        }
    }
}
