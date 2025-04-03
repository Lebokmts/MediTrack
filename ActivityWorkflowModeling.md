# MediTrack Activity Workflow Modeling

## 1. User Registration Workflow

```mermaid
flowchart TD
    Start -->|User Enters Details| ValidateInput
    ValidateInput -->|Valid?| CreateAccount
    ValidateInput -->|Invalid?| Error["Show Error Message"]
    CreateAccount --> SendVerification["Send Verification Email"]
    SendVerification -->|User Verifies Email| ActivateAccount
    SendVerification -->|Timeout| ExpireRequest
    ActivateAccount --> End
    ExpireRequest --> End
```

### Explanation
- This workflow ensures secure registration by requiring email verification.
- The **validation step** prevents incorrect data entry.
- **Parallel actions** (sending verification email) improve user experience.

## 2. Prescription Upload Workflow

```mermaid
flowchart TD
    Start -->|Doctor Logs In| AuthenticateUser
    AuthenticateUser -->|Valid?| UploadPrescription
    AuthenticateUser -->|Invalid?| Error["Show Authentication Error"]
    UploadPrescription --> ValidateData
    ValidateData -->|Valid?| StorePrescription
    ValidateData -->|Invalid?| Error["Show Upload Error"]
    StorePrescription --> NotifyPatient
    NotifyPatient --> End
```

### Explanation
- Ensures only **authenticated doctors** can upload prescriptions.
- **Validation step** prevents incomplete data entry.
- **Notification step** informs patients in real-time.

## 3. Prescription Viewing Workflow

```mermaid
flowchart TD
    Start -->|Patient Logs In| AuthenticateUser
    AuthenticateUser -->|Valid?| FetchPrescriptions
    AuthenticateUser -->|Invalid?| Error["Show Authentication Error"]
    FetchPrescriptions -->|Data Found?| DisplayPrescriptions
    FetchPrescriptions -->|No Data| ShowEmptyMessage
    DisplayPrescriptions --> End
    ShowEmptyMessage --> End
```

### Explanation
- **Authentication step** ensures patient privacy.
- **Fetch prescriptions step** retrieves data securely.
- **Empty message step** enhances user experience.

## 4. QR Code Verification Workflow

```mermaid
flowchart TD
    Start -->|Pharmacist Scans QR Code| ReadQRCode
    ReadQRCode -->|Valid?| FetchPrescriptionData
    ReadQRCode -->|Invalid?| Error["Show Scan Error"]
    FetchPrescriptionData --> VerifyPrescription
    VerifyPrescription -->|Valid?| DispenseMedication
    VerifyPrescription -->|Invalid?| RejectRequest
    DispenseMedication --> End
    RejectRequest --> End
```

### Explanation
- Ensures **authenticity** of prescriptions.
- **Validation steps** prevent fraudulent prescriptions.
- **Error handling** improves security compliance.

## 5. Medication Reminder Workflow

```mermaid
flowchart TD
    Start -->|System Schedules Reminder| CheckSchedule
    CheckSchedule -->|Time Reached?| SendReminder
    CheckSchedule -->|Not Yet| WaitForNextCheck
    SendReminder -->|Patient Acknowledges?| MarkAsTaken
    SendReminder -->|No Response?| ResendReminder
    MarkAsTaken --> End
    ResendReminder --> CheckSchedule
```

### Explanation
- Ensures **medication adherence** with timely reminders.
- **Resending step** ensures notifications are not missed.
- **Acknowledgment tracking** helps caregivers monitor adherence.

## 6. Stock Level Update Workflow

```mermaid
flowchart TD
    Start -->|Pharmacist Logs In| AuthenticateUser
    AuthenticateUser -->|Valid?| UpdateStock
    AuthenticateUser -->|Invalid?| Error["Show Authentication Error"]
    UpdateStock --> ValidateStockData
    ValidateStockData -->|Valid?| StoreStockUpdate
    ValidateStockData -->|Invalid?| Error["Show Input Error"]
    StoreStockUpdate --> NotifyManager
    NotifyManager --> End
```

### Explanation
- **Authentication ensures security.**
- **Validation step prevents incorrect stock data.**
- **Notifications improve inventory awareness.**

## 7. User Authentication Workflow

```mermaid
flowchart TD
    Start -->|User Enters Credentials| VerifyCredentials
    VerifyCredentials -->|Valid?| GrantAccess
    VerifyCredentials -->|Invalid?| Error["Show Login Error"]
    GrantAccess --> End
```

### Explanation
- **Simple and secure login system.**
- **Error handling prevents unauthorized access.**

## 8. Low Stock Notification Workflow

```mermaid
flowchart TD
    Start -->|System Checks Stock Levels| CheckStock
    CheckStock -->|Below Threshold?| SendAlert
    CheckStock -->|Sufficient Stock| End
    SendAlert --> NotifyManager
    NotifyManager --> End
```

### Explanation
- **Automates inventory monitoring.**
- **Reduces risk of medication shortages.**
