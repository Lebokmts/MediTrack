# MediTrack Project Roadmap

This roadmap outlines the ongoing development goals for the MediTrack system. It provides contributors and maintainers with a shared vision of upcoming improvements and long-term plans.

## Current Features (as of Assignment 13)
- REST API for prescriptions, users, and reminders
- GitHub Actions CI/CD pipeline
- In-memory repository pattern
- Unit tests for all core services
- Branch protection and test automation
- OpenAPI documentation with YAML and Swagger support

## Short-Term Goals (1–3 weeks)
- [ ] Add Swagger UI page at `/docs` endpoint
- [ ] Expand test coverage with real JUnit test execution in CI
- [ ] Document database migration options (e.g., from in-memory to PostgreSQL)
- [ ] Improve error handling and status messages in controllers
- [ ] Add validation for prescription dates and user input


## Mid-Term Goals (1–2 months)
- [ ] Implement JWT-based authentication
- [ ] Support role-based access (Doctor, Pharmacist, Patient)
- [ ] Migrate from manual compilation to Maven or Gradle
- [ ] Add global exception handler for REST endpoints
- [ ] Include audit logging for user actions


## Long-Term Vision
- [ ] Build a full frontend (React, Vue, or Android app)
- [ ] Integrate Redis caching for repeated prescription queries
- [ ] Deploy the system via Docker and host on GitHub Pages or Render
- [ ] Add monitoring (e.g., Prometheus, Grafana for health checks)
- [ ] Support internationalization (i18n) for multi-language use

---

## Suggestions Welcome
Have an idea for a new feature or improvement? Open an [issue](../../issues) or submit a pull request. Community feedback is always welcome!
