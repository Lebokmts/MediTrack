# Reflection: Domain Model and Class Diagram for MediTrack

## 1. Challenges I Faced

Making the domain model and class diagram for MediTrack was not easy at first. One of the hardest parts was knowing **how much detail to include**. Sometimes I made the model too simple, and sometimes I added too many details. For example, I wasn’t sure if `Prescription` should be part of the `Patient` class or its own class. After thinking about how doctors, patients, and pharmacists all use prescriptions, I decided it needed to be its own class.

Another challenge was drawing the **relationships** between the classes. I had to figure out how many objects connect to each other. For example, a `Doctor` can write many `Prescriptions`, and each `Prescription` can have many `Medications`. I also found it tricky to decide between **association**, **composition**, and **inheritance**. In the end, I used composition for things like `Reminder`, because it only exists as part of a `Prescription`.

It was also hard to come up with the right **methods** (functions) for each class. At first, I only focused on the data (attributes). Later, I realized that I needed methods like `verifyPrescription()` or `acknowledgeReminder()` to show how the system should behave.

## 2. How This Connects to Previous Work

This class diagram matches the earlier assignments really well. In Assignment 5, one use case said that “Patients view prescriptions and get reminders.” That helped me decide to include both `Prescription` and `Reminder` in the class diagram.

The state diagrams and activity diagrams from Assignment 8 also helped me think about how the system works step by step. For example, in the state diagram, a `Prescription` moves from "Created" to "Dispensed," so I added a `markAsDispensed()` method.

In Assignment 4 (requirements), there was a rule that all user data must be secure. That helped me decide to include an `AuditLog` class. Other requirements like managing medication stock helped me design classes like `Medication` and `StockNotification`.

## 3. Trade-offs and Decisions

I had to make some choices to keep the diagram simple. At first, I wanted to make different classes for `Doctor`, `Pharmacist`, and `Patient`. But they all share some features, like logging in and updating their profile. So I made a single `User` class and gave each user a role. This made the diagram simpler and reduced repeated code.

I also left out some admin features in this version of the diagram. I did that to focus on the main parts of the system, like prescriptions, reminders, and medications.

## 4. What I Learned

This task taught me a lot about **object-oriented design**. I learned that every class should have a clear job, and it’s better to keep each class focused. I also learned that making diagrams like this takes time and you might need to change your design as you understand the system better.

The class diagram helps turn ideas into something we can build later with real code. It also helped me understand how different parts of the system work together.

Using Mermaid.js was also very helpful. It made it easier to draw the diagram and explain it clearly in GitHub.

Overall, this task helped me think more like a software designer and not just a programmer.
