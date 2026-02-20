---
name: reviewing-selenium-java
description: Reviews Selenium and Java automation code for syntax issues, logical bugs, anti-patterns, and framework design flaws. Acts as a Senior SDET and Automation Architect to provide optimized, production-grade tests.
---
# Selenium Java Code Reviewer

## When to use this skill
- When the user asks to review, refactor, or optimize existing Selenium Java code.
- When performing a code review on a pull request containing Selenium WebDriver and Java scripts.
- To detect anti-patterns such as `Thread.sleep()`, hardcoded locators, and lack of Page Object Model.
- To identify synchronization issues and framework design flaws in UI automation code.

## Workflow
1. **Analyze Intent**: Understand the code’s purpose and framework context (TestNG, JUnit, BDD, etc.).
2. **Perform Static Analysis**: Review Java code for syntax, object-oriented principles, exception handling, and efficiency.
3. **Audit Selenium Practices**: Inspect WebDriver implementations for explicit waits, robust locator strategies, browser session management, and stale element handling.
4. **Evaluate Architecture**: Ensure alignment with the Page Object Model (POM), SOLID principles, and DRY concepts. Verify test data is separated from logic.
5. **Deliver Findings**: Output a detailed review. Structure the feedback clearly, categorize issues by severity (Critical, Major, Minor), and provide the optimized, production-grade code that resolves all identified issues.

## Instructions
* **Locators**: Enforce the use of reliable locators (`id`, `css`, relative `xpath`). Disallow unstable, deeply nested absolute XPaths. 
* **Synchronization**: Strictly prohibit `Thread.sleep()`. Mandate `WebDriverWait` (Explicit Waits) or `FluentWait`.
* **Design Patterns**: Enforce the Page Object Model (POM). Flag UI interactions occurring directly within `@Test` methods.
* **Assertions**: Ensure assertions are clearly defined using proper frameworks (e.g., AssertJ, TestNG, Hamcrest). Promote soft assertions where applicable.
* **Driver Management**: Check for correct instantiation and teardown (`driver.quit()`) to prevent resource leaks. Thread-safety should be verified (e.g., using `ThreadLocal<WebDriver>`).
* **Exception Handling**: Validate that proper custom exceptions are utilized. Intercept silent failures or catch blocks that just print stack traces instead of failing the test.
* **Code Cleanliness**: Advocate for concise, readable methods. Identify unused imports, redundant variables, and lack of logging (e.g., Log4j, SLF4j).

## Review Checklist
- [ ] `Thread.sleep()` eliminated and replaced with explicit waits?
- [ ] Locators are robust (no brittle absolute XPaths)?
- [ ] Page elements and test logic are strictly separated (POM)?
- [ ] Assertions validate specific behavior without over-asserting?
- [ ] WebDriver sessions are correctly managed and thread-safe?
- [ ] Appropriate logging and exception handling are implemented?
- [ ] Test data is parameterized/externalized?

## Resources
- [See Selenium POM Example](examples/selenium-optimized-example.java)
- [See Refactored Login Page Example](examples/refactored-login-page.java)
