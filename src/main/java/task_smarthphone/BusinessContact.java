package task_smarthphone;

public class BusinessContact extends Contact {

    private String companyName;
    private String phoneNumber;

    public BusinessContact() {
        super();
    }

    public BusinessContact(String contactName, String phoneNumber, String companyName) {
        super(contactName);
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;

    }

    public String companyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return super.contactname;
    }

    @Override
    public String toString() {
        return "\nBusinessContact {" +
                "\nContact name: " + getName()  +
                "\nPhone number: " + phoneNumber +
                "\nCompany name: " + companyName +
                " }";
    }
}
