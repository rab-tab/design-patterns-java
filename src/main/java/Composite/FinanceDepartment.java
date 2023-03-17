package Composite;

public class FinanceDepartment implements Department{

    private Integer id;
    private String name;

    public FinanceDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("finance dept");
    }
}
