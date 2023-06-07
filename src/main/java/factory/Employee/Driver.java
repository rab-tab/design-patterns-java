package factory.Employee;

public class Driver {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("AndroidDeveloper");
        System.out.println("Salary of AndroidDeveloper is "+employee.salary());
    }
}
