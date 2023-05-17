package Builder;

import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String address;
    String country;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.address = studentBuilder.address;
        this.country = studentBuilder.country;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
