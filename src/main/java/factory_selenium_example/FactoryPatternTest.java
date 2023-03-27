package factory_selenium_example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.PortUnreachableException;

public class FactoryPatternTest {
    DriverManager driverManager;
    WebDriver driver;


    @BeforeTest
    public void init()
    {
        System.out.println("Before test");
        driverManager=DriverManagerFactory.getManager(DriverType.CHROME);
        driverManager.getDriver();
    }

    @Test
    public void launch(){
        System.out.println("in launch test");
       // driver.get("https://www.google.com");
    }

    @AfterTest
    public void shutDown()
    {
        driverManager.quitDriver();
    }

}
