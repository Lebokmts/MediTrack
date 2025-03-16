## 1. Use Case: Upload Prescriptions

Actor: Doctor
Description: Allows doctors to upload digital prescriptions to the system.
Preconditions: Doctor is logged in and has the prescription in digital format.
Postconditions: Prescription is stored securely in the system.
Basic Flow:
Doctor logs in.
Doctor selects the "Upload Prescription" option.
Doctor selects the patient.
Doctor uploads the prescription file.
System validates the prescription format and content.
System encrypts and stores the prescription.
System displays a confirmation message.
Alternative Flows:
If the prescription format is invalid, the system displays an error message.
If the patient is not found, the system prompts the doctor to create a new patient profile.
If the upload fails, the system displays an error message and prompts the doctor to retry.
2. Use Case: View Prescriptions

Actor: Patient
Description: Allows patients to view their digital prescriptions.
Preconditions: Patient is logged in.
Postconditions: Patient can view their active and historical prescriptions.
Basic Flow:
Patient logs in.
Patient selects the "View Prescriptions" option.
System retrieves and displays the patient's prescriptions.
Patient views prescription details.
Alternative Flows:
If no prescriptions are found, the system displays a "No prescriptions found" message.
If the system encounters an error retrieving prescriptions, it displays an error message.
3. Use Case: Receive Medication Reminders

Actor: Patient
Description: Sends medication reminders to patients based on prescription schedules.
Preconditions: Patient is logged in and has active prescriptions.
Postconditions: Patient receives a reminder at the scheduled time.
Basic Flow:
System checks scheduled medication times.
System sends a reminder notification to the patient's mobile app.
Patient receives and views the reminder.
Patient can acknowledge the reminder.
Alternative Flows:
If the reminder fails to send, the system logs the error and retries.
If the patient's device is offline, the system stores the reminder and sends it when the device is online.
4. Use Case: Verify Prescriptions

Actor: Pharmacist
Description: Allows pharmacists to verify prescription authenticity by scanning a QR code.
Preconditions: Pharmacist is logged in and has access to a QR code scanner.
Postconditions: Prescription details and patient information are displayed.
Basic Flow:
Pharmacist logs in.
Pharmacist selects the "Verify Prescription" option.
Pharmacist scans the QR code on the prescription.
System retrieves and displays the prescription details and patient information.
Pharmacist verifies the information.
Alternative Flows:
If the QR code is invalid, the system displays an error message.
If the prescription is not found, the system displays a "Prescription not found" message.
If the system cannot connect to the database, an error message is displayed.
5. Use Case: Manage Stock

Actor: Pharmacy Manager
Description: Allows pharmacy managers to manage medication stock levels.
Preconditions: Pharmacy manager is logged in.
Postconditions: Stock levels are updated in the system.
Basic Flow:
Pharmacy manager logs in.
Pharmacy manager selects the "Manage Stock" option.
Pharmacy manager searches for the medication.
Pharmacy manager updates the stock level.
System updates the stock level in the database.
System displays a confirmation message.
Alternative Flows:
If the medication is not found, the system displays an error message.
If the stock level update fails, the system displays an error message.
6. Use Case: System Maintenance

Actor: IT Support
Description: Allows IT support to perform system maintenance tasks.
Preconditions: IT support is logged in.
Postconditions: System maintenance tasks are completed.
Basic Flow:
IT support logs in.
IT support selects the "System Maintenance" option.
IT support selects the required maintenance task (e.g., backup data, restore data, update system).
System performs the maintenance task.
System displays a confirmation message.
Alternative Flows:
If a maintenance task fails, the system displays an error message and logs the error.
If the system is unable to connect to the database, an error message is displayed.
7. Use Case: View Medication Schedule

Actor: Caregiver
Description: Allows caregivers to view medication schedules for patients.
Preconditions: Caregiver is logged in and has access to the patient's medication schedule.
Postconditions: Medication schedule is displayed.
Basic Flow:
Caregiver logs in.
Caregiver selects the patient.
System retrieves and displays the patient's medication schedule.
Caregiver views the schedule.
Alternative Flows:
If the patient is not found, the system displays an error message.
If the caregiver does not have permissions to view the schedule, an access denied message is shown.
8. Use Case: Acknowledge Reminder

Actor: Patient
Description: Allows patients to acknowledge medication reminders.
Preconditions: Patient has received a medication reminder.
Postconditions: The reminder is marked as acknowledged in the system.
Basic Flow:
Patient receives and views the reminder.
Patient selects the "Acknowledge" option.
System marks the reminder as acknowledged.
System displays a confirmation message.
Alternative Flows:
If the acknowledgment fails, the system displays an error message and prompts the patient to retry.
If the patient's device loses connection, the action is saved and completed when the device regains connectivity.
