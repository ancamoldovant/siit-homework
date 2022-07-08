package OOPConcepts.II;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
       operatePhone();
    }
    public static void operatePhone() {
        Phone phone=new SamsungGalaxyS6("blue", "metal", 1234567);
        phone.addContact(1, 749816870, "Moldovan", "Anca");
        phone.addContact(2, 741908300, "Tomolea", "Maria");
        phone.listContacts(phone);
        phone.sendMessage(741908300, "Hello! I text you to tell about the tomorrow meeting.");
        phone.listMessages(741908300);
        phone.sendMessage(741908300, "Message to verify sendMessage method");
        phone.call(741908300);
        phone.viewHistory();

        System.out.println("operateIPhone");
        Phone phone1=new iPhone12("black", "glass", 43221);
        phone1.addContact(1, 78965437,"Popescu", "Maria");
        phone1.addContact(2, 78654897, "Pop", "Ioan");
        phone1.addContact(3, 79854321, "Grama", "Mihai");
        phone1.sendMessage(78965437, "Good morning! are you come yet?");
        phone1.sendMessage(79854321, "Hello!");
        phone1.listMessages(78965437);
        phone1.call(79854321);
        phone1.call(78965437);
        phone1.viewHistory();

    }
}
