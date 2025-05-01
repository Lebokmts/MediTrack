package services;

import models.Reminder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryReminderRepository;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ReminderServiceTest {
    private ReminderService reminderService;

    @BeforeEach
    public void setUp() {
        reminderService = new ReminderService(new InMemoryReminderRepository());
    }

    @Test
    public void testScheduleAndAcknowledgeReminder() {
        Reminder reminder = new Reminder.ReminderBuilder("REM001", LocalDateTime.now())
                .setNote("Take meds")
                .setRecurring(false)
                .build();

        reminderService.scheduleReminder(reminder);
        reminderService.acknowledgeReminder("REM001");

        Optional<Reminder> result = reminderService.getReminderById("REM001");
        assertTrue(result.isPresent());
        assertTrue(result.get().isAcknowledged());
    }
}

