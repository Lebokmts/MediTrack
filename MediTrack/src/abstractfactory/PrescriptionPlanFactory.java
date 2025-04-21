
package abstractfactory;
import models.Prescription;
import models.Reminder;

public interface PrescriptionPlanFactory {
    Prescription createPrescription();
    Reminder createReminder();
}

