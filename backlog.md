Story ID	User Story	Priority (MoSCoW)	Effort Estimate (Story Points)	Dependencies	Justification
US-001	As a Doctor, I want to upload digital prescriptions so that patients receive medication quickly.	Must-have	3	None	Directly addresses the need for efficient prescription management, critical for patient care.
US-002	As a Patient, I want to view my prescriptions so that I can manage my medication.	Must-have	2	US-001	Core functionality for patient empowerment and medication adherence.
US-003	As a Patient, I want to receive medication reminders so that I take my medication on time.	Must-have	3	US-002	Critical for ensuring medication adherence and patient safety.
US-004	As a Pharmacist, I want to verify prescriptions by scanning a QR code so that I can ensure authenticity.	Must-have	3	US-001	Essential for preventing prescription fraud and ensuring patient safety.
US-009	As a system admin, I want user data encrypted with AES-256 so that security compliance is met.	Must-have	5	None	Critical for meeting regulatory compliance and ensuring data security.
US-005	As a Pharmacy Manager, I want to track medication stock levels so that I can ensure adequate supply.	Should-have	3	None	Important for inventory management and preventing stockouts, but not as critical as patient-facing features.
US-006	As a Pharmacy Manager, I want to receive refill notifications so that I can replenish stock on time.	Should-have	2	US-005	Improves inventory management efficiency, but can be managed manually in the short term.
US-007	As a Patient/Caregiver, I want to view medication schedules so that I can ensure timely medication administration.	Could-have	2	US-002	Useful for caregivers and patients with complex medication regimens, but not essential for initial release.
US-008	As a Patient, I want to acknowledge reminders so that I can confirm I took my medication.	Could-have	1	US-003	Improves medication adherence tracking, but not critical for initial functionality.
US-010	As a user, I want search results to load within 2 seconds so that I can find information quickly.	Could-have	2	US-002, US-007	Enhances user experience, but not critical for initial functionality.
US-011	As a IT support, I want to view system logs so that I can troubleshoot issues.	Could-have	3	None	Important for system maintenance, but not essential for the initial release.
US-012	As a user, I want to manage my profile so that I can keep my information up to date.	Could-have	2	None	Improves user experience, but not critical for initial functionality.
