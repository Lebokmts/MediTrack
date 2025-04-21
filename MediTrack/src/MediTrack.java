
import singletons.AuditLogger;

public class Main {
    public static void main(String[] args) {
        AuditLogger logger1 = AuditLogger.getInstance();
        AuditLogger logger2 = AuditLogger.getInstance();

        logger1.log("Doctor uploaded a prescription.");
        logger2.log("Pharmacist verified a prescription.");

        // Check if both logger references are the same
        System.out.println("Same instance? " + (logger1 == logger2)); // should print true
    }
}


