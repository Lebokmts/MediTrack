/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Kelebogile
 */
public class Doctor extends User {
    public Doctor(String userID, String name, String email, String passwordHash) {
        super(userID, name, email, "Doctor", passwordHash);
    }

    public void uploadPrescription() {
        String name = null;
        System.out.println("Prescription uploaded by Doctor: " + name);
    }
}
