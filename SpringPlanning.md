## **Sprint 1 Planning**

### **1. Sprint Goal:**

**Sprint Goal:** "Implement core prescription management functionality for patients and pharmacists, enabling prescription upload, viewing, verification, and essential security measures."

#### Explanation of Sprint Goal:

- This goal focuses on the essential features that deliver immediate value to the primary users (patients and pharmacists).
- It directly contributes to the MVP by enabling the core functionality of digital prescription management.
- It also prioritizes security, which is critical for healthcare applications.

### **2. User Stories for Sprint 1:**

- US-001: As a Doctor, I want to upload digital prescriptions so that patients receive medication quickly.
- US-002: As a Patient, I want to view my prescriptions so that I can manage my medication.
- US-003: As a Patient, I want to receive medication reminders so that I take my medication on time.
- US-004: As a Pharmacist, I want to verify prescriptions by scanning a QR code so that I can ensure authenticity.
- US-009: As a system admin, I want user data encrypted with AES-256 so that security compliance is met.

### **3. Sprint Backlog Table:**

| Task ID | Task Description                                 | Assigned To | Estimated Hours | Status (To Do/In Progress/In Review) |
|---------|--------------------------------------------------|-------------|-----------------|---------------------------------|
| T-001   | Develop prescription upload API endpoint (US-001) | Backend Dev | 16              | In Review                           |
| T-002   | Design prescription upload UI (US-001)           | Frontend Dev| 8               | In Progress                           |
| T-003   | Implement prescription storage encryption (US-001, US-009) | Backend Dev | 16 | In Progress |
| T-004   | Develop view prescriptions API endpoint (US-002) | Backend Dev | 16              | To Do                           |
| T-005   | Design view prescriptions UI (US-002)           | Frontend Dev| 8               | To Do                           |
| T-006   | Implement medication reminder service (US-003)    | Backend Dev | 16              | To Do                           |
| T-007   | Design medication reminder display (US-003)      | Frontend Dev| 8               | To Do                           |
| T-008   | Develop QR code scanning functionality (US-004)  | Mobile Dev  | 24              | To Do                           |
| T-009   | Develop prescription verification API (US-004) | Backend Dev | 16 | In Review |
| T-010 | Implement AES-256 encryption (US-009) | Backend Dev | 16 | To Do |
| T-011 | Create Database Schemas for prescription data. | Backend Dev | 8 | To Do |
| T-012 | Create Unit tests for API endpoints. | Backend Dev | 16 | To Do |

## **Explanation of Sprint Contribution to MVP:**

- This sprint focuses on the core prescription management features, which are essential for the MVP.
- By completing these user stories, the MediTrack system will enable doctors to upload prescriptions, patients to view and receive reminders, and pharmacists to verify prescriptions.
- By implementing the security story, the base level of data security will be in place.
- These features represent the foundational functionality that provides the most value to users in the initial release.
- This sprint will create a functional base that can be expanded on in later sprints.
