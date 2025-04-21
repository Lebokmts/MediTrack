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
