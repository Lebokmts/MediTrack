/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Kelebogile
 */
public class StockNotification {
    private String notificationID;
    private int threshold;
    private boolean isSent;

    public StockNotification(String id, int threshold) {
        this.notificationID = id;
        this.threshold = threshold;
        this.isSent = false;
    }

    public void sendNotification() {
        if (!isSent) {
            isSent = true;
            System.out.println("Low stock alert sent.");
        }
    }
}
