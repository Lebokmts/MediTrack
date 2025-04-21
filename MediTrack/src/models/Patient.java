
package models;

public class Patient extends User {
    public Patient(String userID, String name, String email, String passwordHash) {
        super(userID, name, email, "Patient", passwordHash);
    }

    public void viewPrescription() {
        String name = null;
        System.out.println("Patient " + name + " is viewing prescription.");
    }

    public void acknowledgeReminder() {
        String name = null;
        System.out.println("Reminder acknowledged by Patient: " + name);
    }
    
}
