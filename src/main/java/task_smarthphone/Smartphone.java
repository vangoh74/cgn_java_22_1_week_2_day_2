package task_smarthphone;

import java.util.Arrays;

public class Smartphone implements Radio, Gps {
    private String modellName;
    private String producerName;
    private Contact[] allContacts;

    public Smartphone() {}

    public Smartphone(String modellName, String producerName, Contact[] allContacts) {
        this.modellName = modellName;
        this.producerName = producerName;
        this.allContacts = allContacts;
    }

    public String producerName() {
        return producerName;
    }

    public String modellName() {
        return modellName;
    }

    public Contact[] allContacts() {
        return allContacts;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public void setModellName(String modellName) {
        this.modellName = modellName;
    }

    public void setAllContacts(Contact[] allContacts) {
        this.allContacts = allContacts;
    }

    @Override
    public String gePosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "\nSmartphone{ " +
                "modellName: '" + modellName + '\'' +
                ", producerName: '" + producerName + '\'' +
                ", allContacts: " + Arrays.toString(allContacts) +
                '}';
    }

    // Bonus I
    public void addContact(Contact contact) {
        // Es gibt auch eine Methode Array.copyOf(array), hier nicht benutzt
        int lastIndex = allContacts.length;
        Contact[] newContacts = new Contact[allContacts.length+1];
        for (int i = 0; i < newContacts.length; i++) {
            if (i == lastIndex) {
                newContacts[lastIndex] = contact;
            } else {
                newContacts[i] = allContacts[i];
            }
        }
        allContacts = newContacts;
    }

    public Contact getContact(int index) {
        if (index >= 0 && index < allContacts.length) {
            return allContacts[index];
        }
        return null;
    }
    // Bonus II
    public Contact getContactByName(String name) {
        for (Contact ct : allContacts) {
            if (ct.getName().equals(name)) {
                return ct;
            }
        }
        return null;
    }

    public boolean removeContactByName(String name) {
        Contact[] newContacts = new Contact[allContacts.length - 1];
        int newIndex = 0;
        if (isIncluded(name)) {
            for (int i = 0; i < allContacts.length; i++) {
                if (allContacts[i].getName().equals(name)) {
                    newIndex = i;
                    i++;
                    newContacts[newIndex] = allContacts[i];
                    newIndex++;
                } else {
                    newContacts[newIndex] = allContacts[i];
                    newIndex++;
                }
            }
            allContacts = newContacts;
            return true;
        } else {
            return false;
        }
    }
    public boolean isIncluded(String name) {
        for (Contact ct : allContacts) {
            if (ct.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
