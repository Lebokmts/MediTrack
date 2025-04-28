
package repositories;

import models.Reminder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryReminderRepository;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryReminderRepositoryTest {

    private InMemoryReminderRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryReminderRepository();
    }

    @Test
    void testSaveAndFindById() {
        Reminder r = new Reminder.ReminderBuilder("REM001", LocalDateTime.now())
            .setRecurring(true)
            .setNote("Take meds")
            .build();

        repo.save(r);
        Optional<Reminder> found = repo.findById("REM001");

        assertTrue(found.isPresent());
        assertEquals("REM001", found.get().getReminderID());
    }

    @Test
    void testDelete() {
        Reminder r = new Reminder.ReminderBuilder("REM002", LocalDateTime.now()).build();
        repo.save(r);
        repo.delete("REM002");

        assertFalse(repo.findById("REM002").isPresent());
    }

    @Test
    void testFindAll() {
        repo.save(new Reminder.ReminderBuilder("REM003", LocalDateTime.now()).build());
        repo.save(new Reminder.ReminderBuilder("REM004", LocalDateTime.now()).build());

        assertEquals(2, repo.findAll().size());
    }
}

