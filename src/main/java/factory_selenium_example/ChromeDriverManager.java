package factory_selenium_example;

public class ChromeDriverManager extends DriverManager{
    @Override
    void getDriver() {
        System.out.println("Creatnig chrome driver");
    }
}
