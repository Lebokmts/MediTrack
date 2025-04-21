/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;
/**
 *
 * @author Kelebogile
 */
public class QRCode {
    private String qrID;
    private String encodedData;
    private LocalDateTime createdOn;

    public QRCode(String id, String data) {
        this.qrID = id;
        this.encodedData = data;
        this.createdOn = LocalDateTime.now();
    }

    public void generate() {
        System.out.println("QR Code generated: " + qrID);
    }

    public void scan() {
        System.out.println("QR Code scanned: " + encodedData);
    }

    public void verify() {
        System.out.println("QR Code verified.");
    }
}
