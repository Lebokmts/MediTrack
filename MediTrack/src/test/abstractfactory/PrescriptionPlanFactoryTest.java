package test;

import abstractfactory.PrescriptionPlanFactory;
import abstractfactory.StandardPrescriptionFactory;
import models.Prescription;
import models.Reminder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrescriptionPlanFactoryTest {
    @Test
    public void testStandardFactoryCreatesBothObjects() {
        PrescriptionPlanFactory factory = new StandardPrescriptionFactory();
        Prescription rx = factory.createPrescription();
        Reminder rem = factory.createReminder();

        assertNotNull(rx);
        assertNotNull(rem);
    }
}
