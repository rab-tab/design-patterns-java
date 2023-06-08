package factory.AbstractFactory;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("AndroidDeveloper salary--50000");
        return 50000;
    }

    @Override
    public String name() {
        return "AndroidDeveloper";
    }
}
