# **Traceability Matrix**

| Functional Requirement (FR) | User Story (US) | Sprint Task (T) | State Transition Diagram | Activity Diagram |
|----------------------------|-----------------|-----------------|-------------------------|-----------------|
| FR-01: Upload Prescription | US-001: As a Doctor, I want to upload digital prescriptions so that patients receive medication quickly. | T-001: Develop prescription upload API | Prescription State Diagram | Upload Prescription Workflow |
| FR-02: View Prescription | US-002: As a Patient, I want to view my prescriptions. | T-004: Develop view prescriptions API | Prescription State Diagram | View Prescription Workflow |
| FR-03: Receive Medication Reminders | US-003: As a Patient, I want to receive reminders to take my medication. | T-006: Implement medication reminder service | Reminder State Diagram | Medication Reminder Workflow |
| FR-04: QR Code Verification | US-004: As a Pharmacist, I want to verify prescriptions by scanning a QR code. | T-008: Develop QR scanning functionality | Prescription Verification State Diagram | QR Code Verification Workflow |
| FR-05: Manage Stock Levels | US-005: As a Pharmacy Manager, I want to track medication stock levels. | T-005: Update stock levels UI | Inventory State Diagram | Stock Management Workflow |
| FR-06: Receive Low Stock Notification | US-006: As a Pharmacy Manager, I want to receive refill notifications. | T-007: Implement notification service | Stock Notification State Diagram | Low Stock Alert Workflow |
| FR-07: Authenticate User | US-007: As a User, I want to log in securely. | T-011: Implement authentication | User Account State Diagram | User Login Workflow |
| FR-08: View Medication History | US-008: As a Patient, I want to view my medication history. | T-012: Create database schemas | Medication History State Diagram | View Medication History Workflow |
