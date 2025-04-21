
package abstractfactory;

import models.Prescription;
import models.Reminder;
import java.time.LocalDateTime;

public class UrgentPrescriptionFactory implements PrescriptionPlanFactory {
    @Override
    public Prescription createPrescription() {
        return new Prescription("RX200", "2024-04-19", "2024-04-25", "Urgent");
    }

    @Override
    public Reminder createReminder() {
        return new Reminder("REM200", LocalDateTime.now().plusHours(6));
    }
}
