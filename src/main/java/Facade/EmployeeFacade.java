package Facade;

public class EmployeeFacade {

    EmployeeDAO employeeDAO;

    public EmployeeFacade(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void insert() {
    }

    public Employee getEmployeeDetails(int empId) {
        return new Employee();
    }
}
