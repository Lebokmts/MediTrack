## Getting Started

1. Clone the repository:

git clone https://github.com/your-username/MediTrack.git


# MediTrack

MediTrack is a mobile application designed to digitize prescriptions and streamline medication management for patients and pharmacists. It aims to improve medication adherence and reduce prescription fraud.

## Project Description

This project will create a mobile app that allows:

* Patients to access digital prescriptions.
* Patients to receive medication reminders.
* Pharmacists to verify prescriptions via QR code.
* Stock level tracking for medications.

## Links

* [SPECIFICATION.md](SPECIFICATION.md)
* [ARCHITECTURE.md](ARCHITECTURE.md)
* [Reflection.md](Reflection.md)
* [SRD.md](SRD.md)
* [Stakeholder Analysis.md](StakeholderAnalysis.md)
* [UseCaseSpecifications.md](UseCaseSpecifications.md)
* [TestCaseDevelopment.md](TestCaseDevelopment.md)
* [UseCase.md](UseCase.md)
* [ActivityWorkflowModeling.md](ActivityWorkflowModeling.md)
* [AgilePlanning.md](AgilePlanning.md)
* [Backblog.md](Backblog.md)
* [KanbanExplanation.md](KanbanExplanation.md)
* [ObjectStateModelling.md](ObjectStateModelling.md)
* [SpringPlanning.md](SpringPlanning.md)
* [TraceabilityMatrix.md](TraceabilityMatrix.md)
* [UserStories.md](UserStories.md)
* [DomainModelDescription.md](DomainModelDescription.md)
* [DesignDecisions.md](DesignDecisions.md)
* [ClassDiagram.md](ClassDiagram.md)
* [Reflection_Assignment_9.md](Reflection_Assignment_9.md)
  

# MediTrack - Creational Design Patterns & Testing

## Language Choice
This project is implemented in **Java**, as it offers strong support for object-oriented programming and design patterns like Factory, Builder, Singleton, etc.

## Project Structure

```plaintext
MediTrack/
├── README.md                    # Project overview and instructions
├── src/                         # Source code for the main application
│   ├── Main.java                # Main test file for running patterns
│   ├── models/                  # Core classes based on class diagram
│   │   ├── User.java
│   │   ├── Doctor.java
│   │   ├── Patient.java
│   │   ├── Pharmacist.java
│   │   ├── Prescription.java
│   │   ├── Medication.java
│   │   ├── Reminder.java
│   │   ├── QRCode.java
│   │   ├── StockNotification.java
│   │   └── AuditLog.java
│   └── repositories/inmemory/      # In-memory repository implementations
│       ├── InMemoryUserRepository.java
│       ├── InMemoryPrescriptionRepository.java
│       ├── InMemoryReminderRepository.java
│       ├── InMemoryMedicationRepository.java
│       └── InMemoryAuditLogRepository.java
│   ├── factories/               # Simple Factory pattern
│   │   └── SimpleUserFactory.java
│   ├── factorymethod/           # Factory Method pattern
│   │   ├── PrescriptionFactory.java
│   │   └── BasicPrescriptionFactory.java
│   ├── abstractfactory/         # Abstract Factory pattern
│   │   ├── PrescriptionPlanFactory.java
│   │   ├── StandardPrescriptionFactory.java
│   │   └── UrgentPrescriptionFactory.java
│   ├── builders/                # Builder pattern (implemented inside Reminder.java)
│   ├── prototypes/              # Prototype pattern
│   │   └── PrescriptionPrototype.java (interface used inside Prescription.java)
│   └── singletons/              # Singleton pattern
│       └── AuditLogger.java
├── test/                        # JUnit test classes
│   ├── factories/
│   │   └── SimpleUserFactoryTest.java
│   ├── factorymethod/
│   │   └── PrescriptionFactoryTest.java
│   ├── abstractfactory/
│   │   └── PrescriptionPlanFactoryTest.java
│   ├── models/
│   │   ├── ReminderBuilderTest.java
│   │   └── PrescriptionPrototypeTest.java
│   └── singletons/
│       └── AuditLoggerTest.java
│   └── repositories/               # JUnit 5 test classes for repositories
│       ├── InMemoryUserRepositoryTest.java
│       ├── InMemoryPrescriptionRepositoryTest.java
│       ├── InMemoryReminderRepositoryTest.java
│       ├── InMemoryMedicationRepositoryTest.java
│       └── InMemoryAuditLogRepositoryTest.java
```

## Implemented Design Patterns

| Pattern           | Location                    | Purpose                                        |
|-------------------|-----------------------------|------------------------------------------------|
| Simple Factory    | `/src/factories/`           | Create users (Doctor, Patient, Pharmacist)    |
| Factory Method    | `/src/factorymethod/`       | Create prescriptions via subclass factories   |
| Abstract Factory  | `/src/abstractfactory/`     | Create prescription + reminder as a package   |
| Builder           | `/src/models/Reminder.java` | Build complex Reminder objects step by step   |
| Prototype         | `/src/models/Prescription.java` | Clone prescription objects                 |
| Singleton         | `/src/singletons/`          | Ensure one instance of `AuditLogger`          |

## Unit Testing

All patterns are tested using **JUnit 5**. See the `/test` directory for:

- `SimpleUserFactoryTest`
- `PrescriptionFactoryTest`
- `PrescriptionPlanFactoryTest`
- `ReminderBuilderTest`
- `PrescriptionPrototypeTest`
- `AuditLoggerTest`

## How to Compile & Run 

javac models/*.java factories/*.java factorymethod/*.java abstractfactory/*.java singletons/*.java prototypes/*.java Main.java
java Main

## Repository Interface Design

I introduced a **generic `Repository<T, ID>` interface** to define standard CRUD operations. This promotes:
- Reusability of core logic
- Clean abstraction for multiple entities
- Flexibility in implementing various storage strategies (e.g., in-memory, database)

### Entity-Specific Interfaces
Each domain entity (e.g., `User`, `Prescription`, `Reminder`) extends the generic interface to provide type-safe repository access:
public interface UserRepository extends Repository<User, String> {}

## 💾 In-Memory Repository Implementation

All repositories use `HashMap` to simulate persistent storage. They implement the standard CRUD operations:
- `save()` → Adds/updates an entry
- `findById()` → Retrieves an entry by ID
- `findAll()` → Lists all entries
- `delete()` → Removes an entry

Example:
private final Map<String, User> users = new HashMap<>();

All repositories are unit tested using **JUnit 5**. Each test class verifies:
- Saving and retrieving data
- Deleting entries
- Listing all stored items

To run tests in **NetBeans**:
- Right-click the test class → **Run File**
- Or right-click the project → **Test**

## 📘 API Documentation (OpenAPI)

This project uses OpenAPI 3.0 for documenting its REST API.

- 🔗 [View openapi.yaml](./openapi.yaml)
- 📖 Open using [Swagger Editor](https://editor.swagger.io/)
- Copy & paste the content of `openapi.yaml`

## CI/CD Pipeline Overview

MediTrack uses GitHub Actions for continuous integration and delivery to ensure code quality and automate builds.

### Workflow Summary

- **Trigger:** Runs on every push and pull request to `main`
- **Build & Test Job:**
  - Compiles all Java classes from `src/`
  - Simulates or runs unit tests
- **Release Job:**
  - Triggered only on pushes to `main`
  - Packages the app as `MediTrack.jar`
  - Uploads the artifact as a downloadable file

### Branch Protection Rules

The `main` branch is protected to ensure:
- Pull request reviews are required
- Status checks (CI workflow) must pass
- Direct pushes and force pushes are blocked

### Releasing a New Version

To create a new release:
1. Push code to the `main` branch
2. The workflow will:
   - Build and package the project
   - Upload the `.jar` as a release artifact

You can find the release artifacts in the **Actions → Artifacts** tab or link them to GitHub Releases.

---

### Download the Build

After a successful run:
- Navigate to **Actions**
- Select the latest completed workflow
- Scroll to **Artifacts** and download `meditrack-release`

---

### Maintainer Notes

- Update CI logic in `.github/workflows/ci.yml`
- To run tests manually, insert your JUnit command under `Simulate Unit Tests`
- Protect the `main` branch via repository **Settings → Branch Rulesets**

