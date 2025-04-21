
package abstractfactory;

import models.Prescription;
import models.Reminder;
import java.time.LocalDateTime;

public class StandardPrescriptionFactory implements PrescriptionPlanFactory {
    @Override
    public Prescription createPrescription() {
        return new Prescription("RX100", "2024-04-19", "2024-05-19", "Standard");
    }

    @Override
    public Reminder createReminder() {
        return new Reminder("REM100", LocalDateTime.now().plusDays(1));
    }
}
