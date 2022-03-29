package model;

public class BiologyStudent extends Student implements Citizen{
    private String adress;
    public BiologyStudent(String name, int studentId) {
        super(name, studentId);
    }

    @Override
    public String getName() {
        return null;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    @Override
    public String getAdress() {
        return this.adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return studentId;
    }

    @Override
    public String toString() {
        return "\nBiologyStudent{" + super.toString() +
                "\nAdresse: " + getAdress();
    }
}
