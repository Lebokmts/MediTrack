
package models;

public class Doctor extends User {
    public Doctor(String userID, String name, String email, String passwordHash) {
        super(userID, name, email, "Doctor", passwordHash);
    }

    public void uploadPrescription() {
        String name = null;
        System.out.println("Prescription uploaded by Doctor: " + name);
    }
}
