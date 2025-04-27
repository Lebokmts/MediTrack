/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package repositories.inmemory;

import repositories.ReminderRepository;
import models.Reminder;

import java.util.*;

public class InMemoryReminderRepository implements ReminderRepository {
    private final Map<String, Reminder> reminders = new HashMap<>();

    @Override
    public void save(Reminder reminder) {
        reminders.put(reminder.getReminderID(), reminder);
    }

    @Override
    public Optional<Reminder> findById(String id) {
        return Optional.ofNullable(reminders.get(id));
    }

    @Override
    public List<Reminder> findAll() {
        return new ArrayList<>(reminders.values());
    }

    @Override
    public void delete(String id) {
        reminders.remove(id);
    }
}

