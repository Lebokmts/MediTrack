/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Kelebogile
 */
public class Medication {
    private String medicationID;
    private String name;
    private String dosage;
    private String frequency;
    private int stockLevel;
    private String description;

    public Medication(String id, String name, String dosage, String frequency, int stock, String desc) {
        this.medicationID = id;
        this.name = name;
        this.dosage = dosage;
        this.frequency = frequency;
        this.stockLevel = stock;
        this.description = desc;
    }

    public void updateStock(int amount) {
        this.stockLevel += amount;
        System.out.println("Updated stock for " + name + ": " + stockLevel);
    }

    public boolean checkAvailability() {
        return stockLevel > 0;
    }
}
