package Builder;

import java.util.List;

public abstract class StudentBuilder {
    int rollNumber;
    int age;
    String name;
    String address;
    String country;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setCountry(String country) {
        this.country = country;
        return this;
    }
    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }

}
