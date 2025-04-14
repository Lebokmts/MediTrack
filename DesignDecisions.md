# 📌 Design Decisions

The following decisions were made to ensure that the class structure aligns with the MediTrack system's functionality, scalability, and maintainability:

## 1. Use of Inheritance
- The `User` class acts as a superclass for `Doctor`, `Patient`, and `Pharmacist`.
- This allows for shared attributes (e.g., `name`, `email`) and common methods (e.g., `login()`, `logout()`), reducing code duplication.

## 2. Encapsulation of Responsibilities
Each class encapsulates its specific responsibilities:
- `Doctor`: Uploads prescriptions.
- `Patient`: Views prescriptions and acknowledges reminders.
- `Pharmacist`: Scans and verifies prescriptions.
- `Medication`: Manages stock and availability.
- `Reminder`: Manages notification delivery and acknowledgment.

## 3. Clear Relationships and Multiplicity
Relationships are explicitly defined with multiplicity for clarity:
- A `Doctor` can create many `Prescriptions`.
- A `Prescription` can include multiple `Medications`.
- A `Prescription` is linked to a `QRCode` and multiple `Reminders`.

## 4. Composition
- `QRCode` and `Reminder` are tightly coupled with the `Prescription` lifecycle, indicating composition.
- If the prescription is deleted, its associated QR code and reminders should also be removed.

## 5. Support for Notifications
- `StockNotification` is linked to `Medication` to support refill alerts.
- Aligns with the requirement for inventory management and timely restocking.

## 6. Audit Logging
- The `AuditLog` class ensures traceability of user actions.
- Critical for regulatory compliance and system debugging.

## 7. Scalability and Maintainability
- The modular structure allows future extension (e.g., adding `Nurse` or `Admin` roles).
- Each class is designed to be independently testable and reusable.
