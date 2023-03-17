package Composite;

public class Client {
    public static void main(String[] args) {
        SalesDepartment salesDept=new SalesDepartment(2,"Sales");
        FinanceDepartment financeDepartment=new FinanceDepartment(2,"Finance");
        HeadDepartment headDepartment=new HeadDepartment(1,"head dept");
        headDepartment.addDepartment(salesDept);
        headDepartment.addDepartment(financeDepartment);

        headDepartment.printDepartmentName();

    }
}
