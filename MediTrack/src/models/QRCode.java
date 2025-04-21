
package models;

import java.time.LocalDateTime;

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
