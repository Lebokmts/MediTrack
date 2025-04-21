
package singletons;


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

