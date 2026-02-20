---
name: scaffolding-playwright-frameworks
description: Generates a complete Playwright automation framework from scratch using TypeScript, Page Object Model (POM), and a custom reporter. Triggers when the user provides a domain name and automation instructions to build a new test suite.
---

# Scaffolding Playwright Frameworks

## When to use this skill
- When starting a new end-to-end (E2E) testing project.
- When the user provides a domain (e.g., `https://example.com`) and wants a structured framework.
- When a project requires a Page Object Model (POM) and custom reporting integration.

## Workflow (Plan-Validate-Execute)
1.  **Analyze**: Extract the domain URL and specific automation steps from the user's prompt.
2.  **Environment Setup**:
    - [ ] Create project root directory.
    - [ ] Initialize `package.json`.
    - [ ] Install dependencies: `npm i -D @playwright/test typescript ts-node`.
3.  **Framework Scaffolding**:
    - [ ] Create `playwright.config.ts` (configured for custom reporter).
    - [ ] Create `reporters/custom-reporter.ts`.
    - [ ] Create `pages/base.page.ts`.
    - [ ] Generate specific Page Objects in `pages/` based on automation instructions.
4.  **Test Generation**:
    - [ ] Create `tests/` directory.
    - [ ] Generate `.spec.ts` files implementing the user's instructions.
5.  **Validation**: Run `npx playwright check` to verify syntax.

## Instructions
### 1. Project Configuration
Ensure `playwright.config.ts` includes the custom reporter path and standard best practices (retries, video on failure, use of `baseUrl`).

### 2. Base Page Pattern
Every Page Object must extend the `BasePage` which contains common utility methods (e.g., `waitForElement`, `navigate`).

### 3. Custom Reporter Logic
The reporter should implement the `FullReporter` interface to log test start, end, and failure details to both console and a structured file.

## Resources
- [Playwright Config Template](resources/playwright.config.ts)
- [Custom Reporter Template](resources/custom-reporter.ts)
- [Base Page Template](resources/base.page.ts)
