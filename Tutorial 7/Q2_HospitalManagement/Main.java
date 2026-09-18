import doctor.Doctor;
import patient.Patient;

public class Main {
    static String specializationFor(String disease) {
        if (disease.equalsIgnoreCase("Chest Pain") || disease.equalsIgnoreCase("Heart Arrhythmia")) {
            return "Cardiology";
        }
        return "Orthopedics";
    }

    public static void main(String[] args) {
        Doctor[] doctors = {
            new Doctor(1, "Dr. Anita Verma", "Cardiology", 800),
            new Doctor(2, "Dr. Ravi Kumar", "Orthopedics", 600)
        };

        Patient[] patients = {
            new Patient(101, "Suresh Iyer", "Chest Pain", 54),
            new Patient(102, "Meena Pillai", "Fractured Wrist", 29),
            new Patient(103, "Deepak Joshi", "Heart Arrhythmia", 61)
        };

        int[] patientCount = new int[doctors.length];

        for (Patient p : patients) {
            String neededSpecialization = specializationFor(p.getDisease());
            for (int i = 0; i < doctors.length; i++) {
                if (doctors[i].getSpecialization().equals(neededSpecialization)) {
                    patientCount[i]++;
                    p.display();
                    doctors[i].display();
                    System.out.println();
                    break;
                }
            }
        }

        for (int i = 0; i < doctors.length; i++) {
            double totalFee = doctors[i].getConsultationFee() * patientCount[i];
            System.out.println(doctors[i].getName() + " - Patients: " + patientCount[i]
                + ", Total Consultation Fee: Rs. " + totalFee);
        }
    }
}
