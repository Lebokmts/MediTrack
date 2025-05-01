# MediTrack Requirements Reflection

## Challenges in Balancing Stakeholder Needs

Balancing the needs of diverse stakeholders in the MediTrack project presented had challenges:

1.  **Conflicting Priorities:**
    * Patients prioritize ease of use and data privacy, while pharmacists require strict verification and stock management. These different priorities sometimes led to trade-offs in design decisions.
2.  **Regulatory Compliance:**
    * Ensuring compliance with healthcare regulations added complexity to the requirements. Meeting these standards required careful consideration of security and data privacy.
3.  **Technical Feasibility:**
    * Balancing stakeholder desires with technical limitations was challenging. Some desired features, while beneficial, required significant development effort or had scalability concerns.
4.  **Usability vs. Functionality:**
    * Striking a balance between a user-friendly interface and robust functionality was crucial. Overly complex features could overwhelm users, while overly simply designs might lack necessary capabilities.
5.  **Scalability and Performance:**
    * Ensuring the system could handle a large number of users while maintaining performance was a key consideration. This required careful planning and architectural decisions.
6. **Data Security:**
    * Ensuring all stakeholders that their data would be secure, and that the system was built with security as a priority was a challenge.

To address these challenges, I employed the following strategies:

* **Prioritization:** Used stakeholder analysis to prioritize requirements based on impact and feasibility.
* **Iterative Development:** Planned for iterative development to allow for feedback and adjustments.
* **Clear Communication:** Maintained open communication with stakeholders to ensure alignment.
* **Thorough Testing:** Planned extensive testing to ensure usability, performance, and security.

Despite these challenges, the process of defining requirements provided valuable insights into the MediTrack system and its potential impact.


##   Challenges in Translating Requirements to Use Cases/Tests

Translating requirements to use cases and test cases for the MediTrack system presented several challenges:

1.**Abstraction Level:**
- Functional requirements describe what the system should do, while use cases describe how users interact with the system to achieve those goals. Bridging this gap required careful consideration to ensure that use cases adequately covered all functional requirements.
2.  **Granularity of Use Cases:**
- Determining the appropriate level of detail for use cases was challenging. Use cases needed to be detailed enough to guide development and testing but not so granular that they became overly complex.
3.  **Identifying Actors and Their Boundaries:**
- Accurately identifying all relevant actors and defining their roles and responsibilities was crucial. It was important to ensure that all stakeholders were represented and that their interactions with the system were clearly defined.
4. **Handling Alternative Flows and Exceptions:**
- Specifying all possible alternative flows and exceptions for each use case required thorough analysis. It was challenging to anticipate every potential scenario and ensure that the system would handle them appropriately.
5.  **Test Case Coverage:**
- Developing test cases that provided comprehensive coverage of all functional and non-functional requirements was a significant challenge. It was important to design test cases that were effective in validating the system's behavior and identifying potential defects.
6.  **Prioritization:**
- Deciding which use cases and test cases to prioritize was challenging, especially given resource constraints. It was important to focus on the most critical aspects of the system and ensure that they were thoroughly tested.
7.  **Ensuring Traceability:**
- Maintaining traceability between requirements, use cases, and test cases was essential for ensuring that all requirements were implemented and tested. It was challenging to establish and maintain these links throughout the development process.

## To address these challenges, I employed the following strategies:

**Iterative Approach:**
- I used an iterative approach, starting with a high-level overview and gradually adding more detail. This allowed me to refine the use cases and test cases over time and ensure that they were aligned with the requirements.
  
**Stakeholder Involvement:**
- I involved stakeholders in the process to validate the use cases and test cases and ensure that they accurately reflected their needs and expectations.
  
**Use Case Templates and Checklists:**
- I used use case templates and checklists to ensure that all necessary information was included and that the use cases were complete and consistent.
  
**Test-Driven Development (TDD) Principles:**
- I applied TDD principles to guide the development of test cases, writing test cases before implementing the corresponding functionality.
  
**Regular Reviews:**
- I conducted regular reviews of the use cases and test cases to identify any gaps or inconsistencies and ensure that they were of high quality.

-Overall, the process of translating requirements to use cases and test cases was a valuable learning experience. It highlighted the importance of careful analysis, clear communication, and a systematic approach to software development.


## 5. Reflection: Navigating Internal Resistance in Agile Planning

As the sole driver of the MediTrack project, I encountered significant internal resistance throughout the Agile planning process. This wasn't resistance from external stakeholders, but rather from the inherent difficulty of balancing competing priorities and making definitive decisions within the confines of my own limited perspective. The process became a rigorous exercise in self-negotiation and overcoming the inertia of indecision.

Prioritization, in particular, proved to be a formidable challenge. While the MoSCoW method provided a structured framework, applying it consistently required a constant internal dialogue. The "Must-have" stories were ostensibly clear, focusing on core functionality and security. However, the line between "Should-have" and "Could-have" blurred easily, leading to endless debates about the relative importance of features. For instance, the inventory management features (US-005, US-006) were deemed "Should-have," as they improved efficiency, but a part of me questioned if they were truly crucial for the MVP. This internal struggle highlighted the difficulty of objectively assessing value when lacking diverse perspectives.

Effort estimation posed another hurdle. Initially, I underestimated the complexity of certain tasks, leading to unrealistic timeframes. The Fibonacci sequence, while helpful, didn't automatically translate to accurate estimates. The implementation of AES-256 encryption (US-009), for instance, was initially estimated at 3 story points, but after further research, it became clear that 5 points were more appropriate. This experience underscored the importance of thorough analysis and a willingness to revise estimates as needed. The internal struggle to admit my own initial underestimation created some mental friction.

Aligning Agile principles with the realities of individual development proved to be a unique challenge. Agile emphasizes collaboration and iterative development, but when working alone, these concepts take on a different form. The constant need for self-review and self-correction became a time-consuming process. The daily stand-ups, normally a team activity, became internal monologues, where I questioned my progress and reevaluated my priorities. The lack of external feedback meant that I had to be exceptionally critical of my own work, which sometimes led to analysis paralysis.

Furthermore, the need to balance technical and user-centric stories created a tension. While I recognized the importance of security and performance (US-009, US-010), the allure of developing user-facing features was strong. The temptation to prioritize visually appealing elements over robust backend functionality was a constant struggle. This internal conflict highlighted the need for discipline and a clear understanding of the project's long-term goals.

Ultimately, this exercise in solo Agile planning revealed the inherent limitations of working in isolation. While the principles of Agile are valuable, they are most effective when applied in a collaborative setting. The absence of diverse perspectives and external feedback made the process more challenging, but it also forced me to develop a deeper understanding of the trade-offs and decisions involved in software development.


# Reflection on Kanban Template Selection and Customization

## Lessons Learned

- **Importance of Customization**: Choosing and customizing the **Kanban template** helped me realize the importance of aligning task management tools with project-specific requirements. For **MediTrack**, features like task status and **Testing** and **Blocked** columns are vital for tracking the prescription management process.
  
- **Automation Benefits**: The **Automated Kanban** template’s automation features (auto-moving issues between columns) significantly enhance workflow management and reduce manual effort. This is essential for **Agile** methodologies as it speeds up task transitions.
  
- **Integration with GitHub Issues**: Linking **user stories** and tasks to GitHub Issues ensures traceability and smooth integration between project management and development processes.

## Comparison to Other Tools

While **GitHub Projects** offers a **simple and effective Kanban board** for small teams, it lacks the depth and reporting features of tools like **Jira**. However, its integration with **GitHub Issues** makes it a better fit for development-focused projects like **MediTrack**.


# 🪞 Reflection: Assignment 12 – API and Service Layer Development

This assignment was a valuable continuation of the MediTrack system, pushing the project from internal logic and repositories into fully exposed and testable REST APIs. It deepened my understanding of how layered software architecture translates from design to working applications, especially in a healthcare context where data flow and reliability are critical.

## 🔧 Challenges Faced

One of the primary challenges was designing services that both encapsulate business logic and remain decoupled from the data layer. Ensuring clean separation while keeping services testable required thoughtful constructor injection and consistent use of interfaces.

Another challenge was implementing REST APIs without Spring Boot. Using **Spark Java** provided simplicity but also required manual configuration of routes, serialization, and status codes. Documenting the API using **OpenAPI** also took some time to structure correctly, especially when nesting multiple entities and actions under the same path.

## 🧠 Lessons Learned

- The importance of layering: repositories abstract data access, services enforce business rules, and controllers handle requests.
- How to document APIs effectively using Swagger and YAML.
- The value of testing services independently before exposing them through HTTP.

This assignment brought together nearly all architectural elements of the MediTrack project and helped me solidify best practices in backend development. It also sets a strong foundation for future extensions, such as switching from in-memory storage to real databases or adding authentication.

*Overall, this task has significantly improved my ability to design and expose robust backend services for real-world applications.*
