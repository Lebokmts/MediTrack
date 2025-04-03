# Reflection on Object State and Activity Workflow Modeling

## 1. Challenges in Choosing Granularity for States & Actions
One of the key challenges was **balancing detail vs. readability**. When modeling object states, including too many intermediary states (e.g., `Prescription Uploaded → Under Review → Approved`) made the diagram complex. However, oversimplifying states (e.g., just `Pending` and `Approved`) risked omitting critical transitions.

For activity diagrams, defining actions at the **right level of abstraction** was difficult. For example, should `Verify Prescription` include detailed steps like `Scan QR Code` and `Check Doctor Credentials`, or should it be a single action? The key was **keeping details that affect process flow while avoiding unnecessary complexity**.

## 2. Aligning Diagrams with Agile User Stories
Mapping state and activity diagrams to **Agile user stories** (from Sprint Planning) posed another challenge. Agile stories focus on user goals rather than system internals. This meant some stories, like **"As a patient, I want to receive reminders"**, had to be translated into both:
- A **state diagram** (e.g., `Reminder Created → Sent → Acknowledged`)
- An **activity diagram** (e.g., `Check schedule → Trigger reminder → Notify patient`)

To ensure alignment, we consistently referenced **functional requirements and sprint backlog items** while designing the diagrams.

## 3. Comparing State Diagrams vs. Activity Diagrams
| **Aspect**            | **State Transition Diagram (Object Behavior)** | **Activity Diagram (Process Flow)** |
|----------------------|---------------------------------|----------------------------------|
| **Focus** | Tracks how an object changes states over time | Maps the sequence of actions in a workflow |
| **Example** | `Prescription` moves from *Pending* → *Approved* | Steps for "Upload Prescription" (e.g., *Doctor submits → System verifies → Patient notified*) |
| **Granularity** | Higher-level changes in object state | More detailed, step-by-step process flow |
| **Best Use Case** | Tracking lifecycle of key entities (e.g., prescriptions, reminders) | Describing interactions between users and the system |

## 4. Conclusion
State diagrams helped model **system rules**, while activity diagrams made **workflows clear**. Both are essential for Agile development, ensuring that the system supports real-world user needs. This modeling approach refined our understanding of MediTrack’s dynamic behavior and prepared us for the next development phases.
