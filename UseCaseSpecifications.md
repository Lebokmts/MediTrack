# MediTrack Use Case Specification: 

## 1. Upload Prescriptions

**Actor:** Doctor
- **Description:** Allows doctors to upload digital prescriptions to the system.
- **Preconditions:** Doctor is logged in and has the prescription in digital format.
- **Postconditions:** Prescription is stored securely in the system.
- **Basic Flow:**
  1. Doctor logs in.
  2. Doctor selects the "Upload Prescription" option.
  3. Doctor selects the patient.
  4. Doctor uploads the prescription file.
  5. System validates the prescription format and content.
  6. System encrypts and stores the prescription.
  7. System displays a confirmation message.
- **Alternative Flows:**
  1. If the prescription format is invalid, the system displays an error message.
  2. If the patient is not found, the system prompts the doctor to create a new patient profile.
  3 .If the upload fails, the system displays an error message and prompts the doctor to retry.
   
## 2. View Prescriptions

**Actor:** Patient
- **Description:** Allows patients to view their digital prescriptions.
- **Preconditions:** Patient is logged in.
- **Postconditions:** Patient can view their active and historical prescriptions.
- **Basic Flow:**
  1. Patient logs in.
  2. Patient selects the "View Prescriptions" option.
  3. System retrieves and displays the patient's prescriptions.
  4. Patient views prescription details.
- **Alternative Flows:**
  1. If no prescriptions are found, the system displays a "No prescriptions found" message.
  2. If the system encounters an error retrieving prescriptions, it displays an error message.

## 3. Receive Medication Reminders

**Actor:** Patient
- **Description:** Sends medication reminders to patients based on prescription schedules.
- **Preconditions:** Patient is logged in and has active prescriptions.
- **Postconditions:** Patient receives a reminder at the scheduled time.
- **Basic Flow:**
  1. System checks scheduled medication times.
  2. System sends a reminder notification to the patient's mobile app.
  3. Patient receives and views the reminder.
  4. Patient can acknowledge the reminder.
- **Alternative Flows:**
  1. If the reminder fails to send, the system logs the error and retries.
  2. If the patient's device is offline, the system stores the reminder and sends it when the device is online.
   
## 4. Verify Prescriptions

**Actor:** Pharmacist
- **Description:** Allows pharmacists to verify prescription authenticity by scanning a QR code.
- **Preconditions:** Pharmacist is logged in and has access to a QR code scanner.
- **Postconditions:** Prescription details and patient information are displayed.
- **Basic Flow:**
  1. Pharmacist logs in.
  2. Pharmacist selects the "Verify Prescription" option.
  3. Pharmacist scans the QR code on the prescription.
  4. System retrieves and displays the prescription details and patient information.
  5. Pharmacist verifies the information.
- **Alternative Flows:**
  1. If the QR code is invalid, the system displays an error message.
  2. If the prescription is not found, the system displays a "Prescription not found" message.
  3. If the system cannot connect to the database, an error message is displayed.

## 5. Manage Stock

**Actor:** Pharmacy Manager
- **Description:** Allows pharmacy managers to manage medication stock levels.
- **Preconditions:** Pharmacy manager is logged in.
- **Postconditions:** Stock levels are updated in the system.
- **Basic Flow:**
  1. Pharmacy manager logs in.
  2. Pharmacy manager selects the "Manage Stock" option.
  3. Pharmacy manager searches for the medication.
  4. Pharmacy manager updates the stock level.
  5. System updates the stock level in the database.
  6. System displays a confirmation message.
- **Alternative Flows:**
  1. If the medication is not found, the system displays an error message.
  2. If the stock level update fails, the system displays an error message.
   
## 6. System Maintenance

**Actor:** IT Support
- **Description:** Allows IT support to perform system maintenance tasks.
- **Preconditions:** IT support is logged in.
- **Postconditions:** System maintenance tasks are completed.
- **Basic Flow:**
  1. IT support logs in.
  2. IT support selects the "System Maintenance" option.
  3. IT support selects the required maintenance task (e.g., backup data, restore data, update system).
  4. System performs the maintenance task.
  5. System displays a confirmation message.
  6. Alternative Flows:
  7. If a maintenance task fails, the system displays an error message and logs the error.
  8. If the system is unable to connect to the database, an error message is displayed.
   
## 7. View Medication Schedule

**Actor:** Caregiver
- **Description:** Allows caregivers to view medication schedules for patients.
- **Preconditions:** Caregiver is logged in and has access to the patient's medication schedule.
- **Postconditions:** Medication schedule is displayed.
- **Basic Flow:**
  1. Caregiver logs in.
  2. Caregiver selects the patient.
  3. System retrieves and displays the patient's medication schedule.
  4. Caregiver views the schedule.
- **Alternative Flows:**
  1. If the patient is not found, the system displays an error message.
  2. If the caregiver does not have permissions to view the schedule, an access denied message is shown.
   
## 8. Acknowledge Reminder

**Actor:** Patient
- **Description:** Allows patients to acknowledge medication reminders.
- **Preconditions:** Patient has received a medication reminder.
- **Postconditions**: The reminder is marked as acknowledged in the system.
- **Basic Flow:**
  1. Patient receives and views the reminder.
  2. Patient selects the "Acknowledge" option.
  3. System marks the reminder as acknowledged.
  4. System displays a confirmation message.
- **Alternative Flows:**
  1. If the acknowledgment fails, the system displays an error message and prompts the patient to retry.
  2. If the patient's device loses connection, the action is saved and completed when the device regains connectivity.
