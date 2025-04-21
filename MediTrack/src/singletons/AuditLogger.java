/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletons;
/**
 *
 * @author Kelebogile
 */


public class AuditLogger {
    private static AuditLogger instance;

    private AuditLogger() {
        // Private constructor so it can’t be instantiated outside
    }

    public static AuditLogger getInstance() {
        if (instance == null) {
            instance = new AuditLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[Audit Log] " + message);
    }
}

