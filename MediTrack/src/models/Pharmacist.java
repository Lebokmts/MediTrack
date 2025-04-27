/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Kelebogile
 */
public class Pharmacist extends User {
    public Pharmacist(String userID, String name, String email, String passwordHash) {
        super(userID, name, email, "Pharmacist", passwordHash);
    }

    public void scanQRCode() {
        String name = null;
        System.out.println("Pharmacist " + name + " scanned a QR Code.");
    }

    public void verifyPrescription() {
        String name = null;
        System.out.println("Pharmacist " + name + " verified the prescription.");
    }
}
