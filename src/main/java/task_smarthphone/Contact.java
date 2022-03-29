package task_smarthphone;

public abstract class Contact {

    protected String contactname;

    public Contact(){}
    public Contact(String contactname) {
        this.contactname = contactname;
    }
    public abstract String getName();
}
