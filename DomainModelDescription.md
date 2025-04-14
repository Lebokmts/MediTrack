# MediTrack Domain Model

This document outlines the core domain entities of the MediTrack system, including their attributes, behaviors, relationships, and business rules. The domain model supports functionalities such as digital prescription management, medication reminders, stock tracking, and secure access.


## Domain Entities Overview

| Entity              | Attributes                                                                 | Methods                                                    | Relationships                                                                 |
|---------------------|----------------------------------------------------------------------------|------------------------------------------------------------|--------------------------------------------------------------------------------|
| **User**            | `userID`, `name`, `email`, `role` (Doctor/Patient/Pharmacist/Admin), `passwordHash` | `login()`, `logout()`, `updateProfile()`                   | - Can upload/view prescriptions<br>- Associated with multiple `Reminders`     |
| **Prescription**    | `prescriptionID`, `patientID`, `doctorID`, `medicationList`, `issueDate`, `expiryDate`, `status` | `upload()`, `view()`, `verify()`, `encrypt()`              | - Linked to `Doctor` and `Patient` (`User`)<br>- Associated with `QR Code`, `Reminder` |
| **Medication**      | `medicationID`, `name`, `dosage`, `frequency`, `stockLevel`, `description` | `updateStock()`, `checkAvailability()`                     | - Part of `Prescription`<br>- Managed by `PharmacyManager`                    |
| **Reminder**        | `reminderID`, `prescriptionID`, `scheduleTime`, `isAcknowledged`          | `sendReminder()`, `acknowledge()`                          | - Linked to `Prescription`<br>- Sent to `Patient`                             |
| **QR Code**         | `qrID`, `encodedData`, `createdOn`                                         | `generate()`, `scan()`, `verify()`                         | - Attached to `Prescription`<br>- Used by `Pharmacist`                        |
| **StockNotification** | `notificationID`, `medicationID`, `threshold`, `isSent`                  | `sendNotification()`                                       | - Triggered when medication stock < threshold                                 |
| **AuditLog**        | `logID`, `userID`, `action`, `timestamp`, `status`                         | `recordAction()`                                           | - Tracks system-wide user actions                                             |


## Business Rules

1. A **Patient** can only view **their own prescriptions**.
2. A **Doctor** can only upload prescriptions for patients **they are assigned to**.
3. Prescriptions must be encrypted for security and compliance *(FR-009)*.
5. A **Medication** must exist in the system **before** it can be added to a prescription.
6. **Reminder notifications** are only sent if the **prescription is active**.
7. **Stock notifications** are sent **only when stock is below the defined threshold**.
8. A **QR Code** is generated per prescription and must be **verified by the pharmacist**.
9. All user actions are **recorded in the AuditLog** for traceability and compliance.

