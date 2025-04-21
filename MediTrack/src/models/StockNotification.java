
package models;

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
