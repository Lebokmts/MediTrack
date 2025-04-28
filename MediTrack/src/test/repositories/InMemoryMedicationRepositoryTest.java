
package repositories;

import models.Medication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryMedicationRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryMedicationRepositoryTest {

    private InMemoryMedicationRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryMedicationRepository();
    }

    @Test
    void testSaveAndFindById() {
        Medication m = new Medication("MED001", "Paracetamol", "500mg", "8h", 100, "Pain relief");
        repo.save(m);

        Optional<Medication> found = repo.findById("MED001");
        assertTrue(found.isPresent());
        assertEquals("Paracetamol", found.get().getName());
    }

    @Test
    void testDelete() {
        repo.save(new Medication("MED002", "Ibuprofen", "200mg", "12h", 50, "Inflammation"));
        repo.delete("MED002");
        assertFalse(repo.findById("MED002").isPresent());
    }

    @Test
    void testFindAll() {
        repo.save(new Medication("MED003", "Amoxicillin", "250mg", "24h", 30, "Antibiotic"));
        repo.save(new Medication("MED004", "Cough Syrup", "10ml", "8h", 20, "Cold relief"));
        assertEquals(2, repo.findAll().size());
    }
}
