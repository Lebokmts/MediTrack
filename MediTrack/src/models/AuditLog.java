
package models;

import java.time.LocalDateTime;

public class AuditLog {
    private String logID;
    private String action;
    private String status;
    private LocalDateTime timestamp;

    public AuditLog(String logID, String action, String status) {
        this.logID = logID;
        this.action = action;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public void recordAction() {
        System.out.println("Action: " + action + " | Status: " + status + " | Time: " + timestamp);
    }
}
