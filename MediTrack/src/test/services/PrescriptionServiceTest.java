package services;

import models.Prescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryPrescriptionRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class PrescriptionServiceTest {
    private PrescriptionService prescriptionService;

    @BeforeEach
    public void setUp() {
        prescriptionService = new PrescriptionService(new InMemoryPrescriptionRepository());
    }

    @Test
    public void testCreateAndVerifyPrescription() {
        Prescription p = new Prescription("RX001", "2024-05-01", "2024-06-01", "Created");
        prescriptionService.createPrescription(p);

        prescriptionService.verifyPrescription("RX001");
        Optional<Prescription> verified = prescriptionService.getPrescriptionById("RX001");
        assertTrue(verified.isPresent());
        assertEquals("Verified", verified.get().getStatus());
    }
}

