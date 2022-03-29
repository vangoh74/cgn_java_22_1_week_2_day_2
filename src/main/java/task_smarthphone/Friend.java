package task_smarthphone;

public class Friend extends Contact {
    private String phoneNumber;

    public Friend() {
        super();
    }

    public Friend(String contactname, String phoneNumber) {
        super(contactname);
        this.phoneNumber = phoneNumber;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nFriend {\nName: " + this.getName() +
                "\nPhone number: " + phoneNumber +
                " }";
    }

    @Override
    public String getName() {
        return super.contactname;
    }
}
