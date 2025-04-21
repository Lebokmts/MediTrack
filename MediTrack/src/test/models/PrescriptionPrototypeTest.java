package test;

import models.Prescription;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrescriptionPrototypeTest {
    @Test
    public void testCloneCreatesNewPrescription() {
        Prescription original = new Prescription("RX_ORIG", "2024-04-19", "2024-05-01", "Created");
        Prescription copy = original.clone();

        assertNotNull(copy);
        assertNotSame(original, copy);
        assertTrue(copy.getPrescriptionID().contains("COPY"));
    }
}
