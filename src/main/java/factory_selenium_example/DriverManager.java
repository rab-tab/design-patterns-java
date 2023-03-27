package factory_selenium_example;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    WebDriver driver;

    abstract void getDriver();

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
