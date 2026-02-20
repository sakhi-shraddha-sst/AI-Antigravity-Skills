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
