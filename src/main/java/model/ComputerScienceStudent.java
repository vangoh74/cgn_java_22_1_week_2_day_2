package model;

import java.util.Arrays;

public class ComputerScienceStudent extends Student implements Citizen {

    private String[] oopSubject;
    private String name;
    public ComputerScienceStudent(String name, int studentID, String[] subjects) {
        super(name, studentID);
        this.oopSubject = subjects;
        this.name = name;
    }

    public String[] subjects() {
        return oopSubject;
    }

    public void setOopSubject(String[] oopSubject) {
        this.oopSubject = oopSubject;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{\nid: " + super.studentId +
                "\nname: " + super.name +
                "\nOOP Contents= " + Arrays.toString(oopSubject) +
                '}';
    }

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }
}
