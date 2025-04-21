
package models;

import java.time.LocalDateTime;

public class Reminder {
    private String reminderID;
    private LocalDateTime scheduleTime;
    private boolean isAcknowledged;
    private boolean isRecurring;
    private String note;

    // Private constructor: only accessible via builder
    private Reminder(ReminderBuilder builder) {
        this.reminderID = builder.reminderID;
        this.scheduleTime = builder.scheduleTime;
        this.isRecurring = builder.isRecurring;
        this.note = builder.note;
        this.isAcknowledged = false;
    }

    public void sendReminder() {
        System.out.println("Reminder [" + reminderID + "] sent at " + scheduleTime + (isRecurring ? " [Recurring]" : ""));
    }

    public void acknowledge() {
        this.isAcknowledged = true;
        System.out.println("Reminder acknowledged.");
    }

    // Inner static Builder class
    public static class ReminderBuilder {
        private String reminderID;
        private LocalDateTime scheduleTime;
        private boolean isRecurring;
        private String note;

        public ReminderBuilder(String id, LocalDateTime time) {
            this.reminderID = id;
            this.scheduleTime = time;
        }

        public ReminderBuilder setRecurring(boolean recurring) {
            this.isRecurring = recurring;
            return this;
        }

        public ReminderBuilder setNote(String note) {
            this.note = note;
            return this;
        }

        public Reminder build() {
            return new Reminder(this);
        }
    }
}

