package model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Student {

    protected String name;
    private LocalDate birthdate;
    protected int studentId;
    private String email;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getName();

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name) && Objects.equals(birthdate, student.birthdate) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate, studentId, email);
    }

    @Override
    public String toString() {
        return  "\nid= " + studentId +
                "\nname= " + name +
                "\nbirthdate= " + birthdate +
                "\nemail= " + email +
                '}';
    }
}