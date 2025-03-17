# MediTrack - Test Cases

| Test Case ID |	Requirement ID | Description	| Steps	| Expected Result	| Actual Result | Status |
|-------------|----------------|-------------|-------|------------------|---------------|--------|
| TC-001	| FR-01	| Upload Prescription	| 1. Doctor logs in. 2. Upload prescription. 3. Submit.	| Prescription stored securely	| ... | ... |
| TC-002	| FR-02	| View Prescription	| 1. Patient logs in. 2. View prescription. | Prescription details displayed | ... | ... |
| TC-003	| FR-03	| Receive Reminders	| 1. System schedules reminder. 2. Send notification	| Patient receives reminder	| ... | ... |
| TC-004	| FR-04	| QR Code Verification	| 1. Pharmacist scans QR. 2. Verify prescription | Prescription details retrieved	| ... | ... |
| TC-005	| FR-05	| Manage Stock Levels	| 1. Pharmacist logs in. 2. Updates stock	| Stock level updated	| ... | ... |
| TC-006	| FR-06	| Receive Low Stock Notification	| 1. Stock below threshold. 2. Notification sent	| Pharmacy manager notified	| ... | ... |
| TC-007	| FR-07	| Authenticate User	| 1. User logs in. 2. Enter credentials	| Access granted	| ... | ... |
| TC-008	| FR-08	| View Medication History	| 1. Patient logs in. 2. View history	| History displayed	| ... | ... |

# MediTrck Non-Functional Tests
| Test Case ID	| Requirement ID	| Description |	Steps |	Expected Result |
|-------------|----------------|-------------|-------|------------------|
| TC-NF-001 |	NFR-09	| Performance Test	| 1. Simulate 1000 users. 2. Measure response time.	| Response time ≤ 2 sec |
| TC-NF-002	| NFR-07	| Security Test	| 1. Attempt unauthorized data access. |	Data remains encrypted |
