# MediTrack Class Diagram

This class diagram provides a high-level structural view of the MediTrack system. It models the main classes, their attributes and methods, as well as relationships such as associations, composition, and inheritance using Mermaid.js syntax.

---

## Mermaid Class Diagram

```mermaid
classDiagram

%% === USERS ===
class User {
  +String userID
  +String name
  +String email
  +String role
  +String passwordHash
  +login()
  +logout()
  +updateProfile()
}

class Doctor {
  +uploadPrescription()
}

class Patient {
  +viewPrescription()
  +acknowledgeReminder()
}

class Pharmacist {
  +scanQRCode()
  +verifyPrescription()
}

User <|-- Doctor
User <|-- Patient
User <|-- Pharmacist

%% === PRESCRIPTION SYSTEM ===
class Prescription {
  +String prescriptionID
  +String issueDate
  +String expiryDate
  +String status
  +upload()
  +view()
  +encrypt()
}

class Medication {
  +String medicationID
  +String name
  +String dosage
  +String frequency
  +int stockLevel
  +String description
  +updateStock()
  +checkAvailability()
}

class Reminder {
  +String reminderID
  +DateTime scheduleTime
  +Boolean isAcknowledged
  +sendReminder()
  +acknowledge()
}

class QRCode {
  +String qrID
  +String encodedData
  +DateTime createdOn
  +generate()
  +scan()
  +verify()
}

%% === RELATIONSHIPS ===
Doctor "1" --> "0..*" Prescription : creates
Patient "1" --> "0..*" Prescription : receives
Prescription "1" --> "1..*" Medication : includes
Prescription "1" --> "1" QRCode : contains
Prescription "1" --> "0..*" Reminder : triggers
Reminder "1" --> "1" Patient : notifies
Pharmacist "1" --> "0..*" QRCode : scans

%% === STOCK NOTIFICATIONS ===
class StockNotification {
  +String notificationID
  +int threshold
  +Boolean isSent
  +sendNotification()
}
Medication "1" --> "0..*" StockNotification : triggers

%% === AUDIT ===
class AuditLog {
  +String logID
  +String action
  +String status
  +DateTime timestamp
  +recordAction()
}
User "1" --> "0..*" AuditLog : performs

