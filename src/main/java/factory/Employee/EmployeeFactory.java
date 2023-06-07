package factory.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(String empType) {
        if (empType.equalsIgnoreCase("AndroidDeveloper")) {
            return new AndroidDeveloper();
        } else if (empType.equalsIgnoreCase("WebDeveloper")) {
            return new WebDeveloper();
        } else return null;

    }
}
