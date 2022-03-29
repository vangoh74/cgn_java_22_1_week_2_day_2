package task_smarthphone;

import java.io.FileReader;

public class AppMain {
    public static void main(String[] args) {
        Contact sven = new Friend("Sven", "017546354876");
        Contact heike = new Friend("Heike", "00551173847");
        Contact hahn = new BusinessContact("Hahn", "040234576", "Banco do Brasil");
        Contact mayer = new BusinessContact("Mayer", "06923451024", "Combustol");
        Contact heike2 = new Friend("Heike", "089234756");
/*
        System.out.println(sven.toString());
        System.out.println(heike.toString());
        System.out.println(schultz.toString());
        System.out.println(mayer.toString());
*/
        Contact[] contacts = new Contact[] {sven, heike, hahn, mayer};
        Smartphone asus = new Smartphone("ASUS ROG Phone 5s", "ASUS", contacts );
        Smartphone apple = new Smartphone("iPhone 13", "Apple", contacts);

        System.out.println(asus.toString());
        //System.out.println(apple.toString());
        asus.addContact(heike2);
        System.out.println(asus.toString());

        Contact ct = asus.getContact(4);
        if (ct == null) {
            System.out.println("\nContact not available");
        } else {
            System.out.println("\nContact by index 4: " + ct);
        }
        System.out.println("\nwanted - first Heike: " + asus.getContactByName("Heike"));
        String nameToBeMoved = "Maria";
        if(asus.removeContactByName(nameToBeMoved)) {
            System.out.println('\n' + nameToBeMoved + " was removed from the contacts list!");
            System.out.println(asus.toString());
        } else {
            System.out.println('\n' + nameToBeMoved + " is not included in the list");
        }
    }
}
