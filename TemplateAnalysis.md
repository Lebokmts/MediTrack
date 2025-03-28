## **MediTrack Templates Analysis**

| **Template**          | **Columns & Workflow**                                      | **Automation Features**                                      | **Suitability for Agile**                                      |
|----------------------|------------------------------------------------------------|-------------------------------------------------------------|---------------------------------------------------------------|
| **Basic Kanban**     | To Do → In Progress → Done                                 | Manual movement of tasks                                    | Suitable for simple Agile tracking but lacks automation for large teams. |
| **Automated Kanban** | Backlog → To Do → In Progress → Done                       | Issues auto-move when PRs are opened, closed, or merged      | Good for Agile as it streamlines task management and provides automation for smoother workflows. |
| **Bug Triage**       | New Issues → Needs Triage → High Priority → In Progress → Done | Automatically labels and assigns issues                      | Useful for managing bug fixes but lacks features for full Agile project development. |
| **Team Planning**    | Icebox → Backlog → In Progress → Review → Done             | Automates backlog prioritization and team assignments        | Ideal for Agile as it supports backlog grooming, sprint planning, and team collaboration. |

## **Justification:**

### **1. Aligning with Agile Methodology**
The Kanban template is a great choice for managing the MediTrack project because it supports Agile principles such as continuous delivery, adaptability, and workflow transparency. Agile methodology is great for delivering small, working increments of a project frequently, which the Kanban system enables by visually tracking progress and identifying bottlenecks.

For MediTrack, which is a healthcare application focused on managing digital prescriptions, an efficient and adaptable workflow is necessary. The Kanban template helps ensure that features such as prescription uploads, verification, security implementation, and patient reminders move through various stages smoothly.

### **2. Efficient Task Management and Workflow Visualization**
The Kanban template offers a clear visual representation of tasks. In our project, tasks move through different stages like:

  - **To Do** (Tasks planned for the sprint but not started)
  - **In Progress** (Tasks currently being worked on)
  - **Testing** (Tasks undergoing verification)
  - **Blocked** (Tasks that cannot proceed due to dependencies or issues)
  - **Done** (Completed tasks)

This structure ensures that all team members have a clear understanding of task status at a glance, improving coordination and efficiency.

### **3. Automation Features Reduce Manual Effort**
One of the key advantages of using the Kanban template is its automation features. For MediTrack, these features are useful in several ways:

  - Issues automatically move from "To Do" to "In Progress" when a developer starts working on them.
  - Completed tasks auto-move to "Testing" when ready for review.
  - Tasks marked as blocked remain visible, helping the team identify problems early.
  - Tasks close automatically when they are marked "Done", ensuring a clean workflow.

This automation reduces administrative workload, allowing the development team to focus more on coding and testing rather than manually updating task statuses.

### **4. Flexibility for Customization**
The Kanban template is highly customizable, which is essential for a project like MediTrack that involves multiple stakeholders, including doctors, patients, pharmacists, and system administrators. By adding custom columns like "Testing" and "Blocked", we ensure:

  - **Testing Phase:** Features such as prescription verification and encryption undergo quality checks before deployment.
  - **Blocked Items Visibility:** If a task is waiting for security approval or API integration, it is marked as blocked so the team can quickly resolve the issue.

Such customizations help in prioritizing tasks effectively and ensuring high-quality outputs.

### **5. Integration with GitHub Issues for Traceability**
The Kanban template integrates well with GitHub Issues, which we use to track user stories and tasks. This allows:

  - Direct linking of tasks to user stories.
  - Assignment of tasks to team members with @mentions.
  - Better visibility of sprint progress.

Since MediTrack is a software project, having everything within GitHub (code, issues, and Kanban board) creates a centralized workflow that improves traceability and team collaboration.

### **6. Supports Continuous Improvement**
The Kanban approach allows for ongoing improvements by highlighting inefficiencies. If a column (e.g., Testing) gets overcrowded, it signals that testing needs more resources. If too many tasks are stuck in Blocked, the team can review and remove dependencies. This makes MediTrack's development process more efficient over time.
