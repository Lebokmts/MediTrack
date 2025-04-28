
package repositories;

import models.Prescription;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryPrescriptionRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryPrescriptionRepositoryTest {

    private InMemoryPrescriptionRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryPrescriptionRepository();
    }

    @Test
    void testSaveAndFindById() {
        Prescription p = new Prescription("RX001", "2024-04-19", "2024-05-01", "Created");
        repo.save(p);

        Optional<Prescription> found = repo.findById("RX001");
        assertTrue(found.isPresent());
        assertEquals("Created", found.get().getStatus());
    }

    @Test
    void testDelete() {
        repo.save(new Prescription("RX002", "2024-04-01", "2024-05-01", "Active"));
        repo.delete("RX002");
        assertFalse(repo.findById("RX002").isPresent());
    }

    @Test
    void testFindAll() {
        repo.save(new Prescription("RX003", "2024-01-01", "2024-02-01", "Done"));
        repo.save(new Prescription("RX004", "2024-02-01", "2024-03-01", "Pending"));
        assertEquals(2, repo.findAll().size());
    }
}

