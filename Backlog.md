## **MediTrack Backlog Table**

| Story ID |	User Story	| Priority (MoSCoW) |	Effort Estimate (Story Points) |	Dependencies	| Justification |
|-------------|----------------|-------------|-------|------------------|---------------|
| US-001	| As a Doctor, I want to upload digital prescriptions so that patients receive medication quickly.	| Must-have	| 3 |	None	| Directly addresses the need for efficient prescription management, critical for patient care. |
| US-002	| As a Patient, I want to view my prescriptions so that I can manage my medication.	| Must-have	| 2	| US-001	| Core functionality for patient empowerment and medication adherence. |
| US-003	| As a Patient, I want to receive medication reminders so that I take my medication on time.	| Must-have	| 3	| US-002	| Critical for ensuring medication adherence and patient safety. |
| US-004	| As a Pharmacist, I want to verify prescriptions by scanning a QR code so that I can ensure authenticity.	| Must-have	| 3	| US-001	| Essential for preventing prescription fraud and ensuring patient safety. |
| US-009	| As a system admin, I want user data encrypted with AES-256 so that security compliance is met.	| Must-have	| 5	| None	| Critical for meeting regulatory compliance and ensuring data security. |
| US-005	| As a Pharmacy Manager, I want to track medication stock levels so that I can ensure adequate supply.	| Should-have	| 3	| None	| Important for inventory management and preventing stockouts, but not as critical as patient-facing features. |
| US-006	| As a Pharmacy Manager, I want to receive refill notifications so that I can replenish stock on time.	| Should-have	| 2	| US-005	| Improves inventory management efficiency, but can be managed manually in the short term. |
| US-007	| As a Patient/Caregiver, I want to view medication schedules so that I can ensure timely medication administration.	| Could-have	| 2	| US-002	| Useful for caregivers and patients with complex medication regimens, but not essential for initial release. |
| US-008	| As a Patient, I want to acknowledge reminders so that I can confirm I took my medication.	| Could-have	| 1	| US-003	| Improves medication adherence tracking, but not critical for initial functionality. |
| US-010	| As a user, I want search results to load within 2 seconds so that I can find information quickly.	| Could-have	| 2	| US-002, US-007	| Enhances user experience, but not critical for initial functionality. |
| US-011	| As a IT support, I want to view system logs so that I can troubleshoot issues.	| Could-have | 3 |	None	| Important for system maintenance, but not essential for the initial release. |
| US-012	| As a user, I want to manage my profile so that I can keep my information up to date.	| Could-have | 2	| None	| Improves user experience, but not critical for initial functionality. |

## **Justification of Prioritization:**

### **Must-have:**
  1. These stories (US-001 to US-004, US-009) align directly with the core functionality of the MediTrack system and address critical stakeholder needs.
  2. They are essential for patient safety, prescription integrity, and regulatory compliance.
  3. They are also critical for the MVP, as without them the application would not be functional.

### **Should-have:**
  1. These stories (US-005 and US-006) improve operational efficiency and inventory management.
  2. While important, they are not as critical as the patient-facing and security-related stories.
  3. These are important for the long term health of the application.
     
### **Could-have:**
  1. These stories (US-007, US-008, US-010, US-011, US-012) enhance the user experience and provide additional features.
  2. They are not essential for the initial release and can be implemented in future sprints.
  3. They are desirable, but not necessary.
     
## **Effort Estimates (Story Points):**

  1. Story points are used to estimate the relative effort required to complete each user story.
  2. Smaller stories (e.g., US-008) are given lower estimates (1 or 2).
  3. Larger, more complex stories (e.g., US-009) are given higher estimates (3 or 5).
  4. The estimates are used to help plan sprints.
