/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package test;

import models.Reminder;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class ReminderBuilderTest {
    @Test
    public void testReminderBuilderCreatesReminder() {
        Reminder reminder = new Reminder.ReminderBuilder("REM_BUILDER_1", LocalDateTime.now())
                                .setRecurring(true)
                                .setNote("Test Reminder")
                                .build();

        assertNotNull(reminder);
        assertEquals("REM_BUILDER_1", reminder.getReminderID());
    }
}
