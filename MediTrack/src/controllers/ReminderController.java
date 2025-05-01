package controllers;

import com.google.gson.Gson;
import models.Reminder;
import repositories.inmemory.InMemoryReminderRepository;
import services.ReminderService;

import static spark.Spark.*;

public class ReminderController {

    public static void initRoutes() {
        Gson gson = new Gson();
        ReminderService reminderService = new ReminderService(new InMemoryReminderRepository());

        // Create reminder
        post("/api/reminders", (req, res) -> {
            Reminder r = gson.fromJson(req.body(), Reminder.class);
            reminderService.scheduleReminder(r);
            res.status(201);
            return "Reminder scheduled";
        });

        // Get all reminders
        get("/api/reminders", (req, res) -> {
            res.type("application/json");
            return gson.toJson(reminderService.getAllReminders());
        });

        // Get reminder by ID
        get("/api/reminders/:id", (req, res) -> {
            Reminder r = reminderService.getReminderById(req.params("id"))
                    .orElseThrow(() -> new Exception("Reminder not found"));
            res.type("application/json");
            return gson.toJson(r);
        });

        // Acknowledge reminder
        put("/api/reminders/:id/acknowledge", (req, res) -> {
            reminderService.acknowledgeReminder(req.params("id"));
            return "Reminder acknowledged.";
        });

        // Delete reminder
        delete("/api/reminders/:id", (req, res) -> {
            reminderService.deleteReminder(req.params("id"));
            return "Reminder deleted.";
        });
    }
}

