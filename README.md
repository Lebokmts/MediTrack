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
