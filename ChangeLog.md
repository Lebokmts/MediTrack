# ChangeLog - MediTrack Project

This changelog documents the key changes and progress made throughout Assignment 10 of the MediTrack system.

---

## Version History

### [v1.0.0] - Initial Class Implementation
**Date:** 2024-04-19  
**Added:**
- Implemented core domain classes: `User`, `Doctor`, `Patient`, `Pharmacist`, `Prescription`, `Reminder`, `Medication`, `QRCode`, `StockNotification`, `AuditLog`.
- Established proper inheritance and composition relationships.
- Encapsulated attributes and added essential methods.

---

### [v1.1.0] - Simple Factory Pattern
**Date:** 2024-04-19  
**Added:**
- Created `SimpleUserFactory.java` to handle dynamic user object creation.
- Tested user creation with different roles.

---

### [v1.2.0] - Factory Method Pattern
**Date:** 2024-04-19  
**Added:**
- Created `PrescriptionFactory` abstract class and `BasicPrescriptionFactory` subclass.
- Encapsulated prescription creation logic.

---

### [v1.3.0] - Abstract Factory Pattern
**Date:** 2024-04-19  
**Added:**
- Implemented `PrescriptionPlanFactory` interface.
- Added `StandardPrescriptionFactory` and `UrgentPrescriptionFactory`.
- Each factory returns a `Prescription` and a `Reminder`.

---

### [v1.4.0] - Builder Pattern
**Date:** 2024-04-19  
**Added:**
- Integrated builder pattern into `Reminder` class using static inner builder class.
- Supports flexible object creation with optional parameters.

---

### [v1.5.0] - Prototype Pattern
**Date:** 2024-04-19  
**Added:**
- Implemented `PrescriptionPrototype` interface in `Prescription.java`.
- Enabled cloning of prescription objects.

---

### [v1.6.0] - Singleton Pattern
**Date:** 2024-04-19  
**Added:**
- Implemented `AuditLogger` as a Singleton.
- Ensures only one logger instance exists across system.

---

### [v1.7.0] - Unit Testing
**Date:** 2024-04-19  
**Added:**
- Wrote JUnit tests for all six creational design patterns.
- Tests located in the `/test` directory.
- Validated correct object creation and pattern behavior.

---

### [v1.8.0] - GitHub Documentation and Cleanup
**Date:** 2024-04-19  
**Added:**
- Updated `README.md` with project structure, usage, and instructions.
- Created `Project Structure.md` and this `changelog.md` file.
- Confirmed GitHub repo reflects all project elements for submission.

---

