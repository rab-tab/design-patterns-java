package factory_selenium_example;

public class FirefoxDriverManager extends DriverManager{
    @Override
    void getDriver() {
        System.out.println("Creatnig firefox driver");
    }
}
