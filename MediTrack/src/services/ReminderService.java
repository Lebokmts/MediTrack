
package services;

import models.Reminder;
import repositories.ReminderRepository;

import java.util.List;
import java.util.Optional;

public class ReminderService {
    private final ReminderRepository reminderRepo;

    public ReminderService(ReminderRepository reminderRepo) {
        this.reminderRepo = reminderRepo;
    }

    public void scheduleReminder(Reminder reminder) {
        reminderRepo.save(reminder);
    }

    public Optional<Reminder> getReminderById(String id) {
        return reminderRepo.findById(id);
    }

    public List<Reminder> getAllReminders() {
        return reminderRepo.findAll();
    }

    public void acknowledgeReminder(String id) {
        Reminder r = reminderRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Reminder not found"));
        r.acknowledge();
        reminderRepo.save(r);
    }

    public void deleteReminder(String id) {
        reminderRepo.delete(id);
    }
}

