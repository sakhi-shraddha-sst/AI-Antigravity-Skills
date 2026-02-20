### 🚨 Selenium Review Examples

``` public void login() {
    driver.findElement(By.xpath("/html/body/div[1]/form/input[1]")).sendKeys("user");
    driver.findElement(By.xpath("/html/body/div[1]/form/input[2]")).sendKeys("pass");
    Thread.sleep(5000); // ❌ Anti-pattern: Hard wait
    driver.findElement(By.xpath("/html/body/div[1]/form/button")).click();
}
```

Based on the Selenium Java Code Reviewer skill guidelines, here is a Senior SDET architectural review of the provided code snippet.

### 🚨 Code Review Findings

**1. Critical Severity: Fragile Absolute XPaths**
- **Issue**: The code uses brittle, absolute XPaths (`/html/body/div[1]/form/input[...]`). Any minor change in the UI hierarchy will break these locators.
- **Fix**: Use stable, semantic locators such as `By.id`, `By.cssSelector`, or `By.name` whenever possible.

**2. Critical Severity: Hardcoded `Thread.sleep()`**
- **Issue**: You correctly identified this anti-pattern (`Thread.sleep(5000)`). Explicit pauses slow down test suites and cause flaky tests when environments are slow.
- **Fix**: Replace hardware pauses with `WebDriverWait` (Explicit Waits) to wait dynamically only as long as required.

**3. Major Severity: Violation of the Page Object Model (POM)**
- **Issue**: Web elements are being found and interacted with directly inside what appears to be a test method. This violates the DRY (Don't Repeat Yourself) principle and makes maintenance difficult.
- **Fix**: Extract UI locators and interactions into a separate Page Object class.

**4. Major Severity: Hardcoded Test Data**
- **Issue**: The values `"user"` and `"pass"` are hardcoded inside the method.
- **Fix**: Parameterize the test method so that it accepts `username` and `password` as arguments, separating data from test implementation.

---

### ✅ Refactored, Production-Grade Code (POM Approach)

Here is the optimized, automated implementation incorporating all necessary best practices, synchronization mechanisms, and structural improvements:

```java
package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // 1. Defined semantic locators (Assuming id/name/css are available)
    // If IDs are missing, use robust CSS: "form input[type='text']"
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // 2. Initialize Explicit Wait instead of Thread.sleep()
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    }

    // 3. Encapsulate actions inside Page Methods, wait dynamically
    public void enterUsername(String username) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput));
        element.clear();
        element.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        element.clear();
        element.sendKeys(password);
    }

    public void clickLogin() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        element.click();
    }

    // 4. Parameterized High-Level Interaction for Test Classes
    public void loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
```

### 📋 Review Checklist Passed
- [x] `Thread.sleep()` eliminated and replaced with explicit waits dynamically waiting for states.
- [x] Locators are robust (brittle absolute XPaths removed).
- [x] Page elements and test logic are strictly separated (POM implemented).
- [x] Test data (username/password) is parameterized.
