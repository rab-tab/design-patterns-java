package Builder;

public class Admin {
    StudentBuilder studentBuilder;

    Admin(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Admin() {
    }

    public Student createStudent(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;

        if (studentBuilder instanceof EngStudent) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudent) {
            return createMBAStudent();
        }
        return null;
    }


    private Student createEngineeringStudent() {

        return studentBuilder.setRollNumber(1).setAge(22).setName("sj").setSubjects().build();
    }

    private Student createMBAStudent() {

        return studentBuilder.setRollNumber(2).setAge(24).setName("sj").setSubjects().build();

    }

}
