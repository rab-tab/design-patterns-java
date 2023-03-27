package factory_selenium_example;

import org.openqa.selenium.WebDriver;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType driverType) {
        DriverManager driverManager;
        switch (driverType) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                return null;
        }
        return driverManager;
    }
}
