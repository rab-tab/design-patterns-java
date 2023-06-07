package factory.Employee;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("WebDeveloper -- " + 60000);
        return 60000;
    }
}
