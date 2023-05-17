package Builder;

public class Client {
    public static void main(String[] args) {
        Student student = new Admin().createStudent(new EngStudent());
        System.out.println(student);

    }

}
