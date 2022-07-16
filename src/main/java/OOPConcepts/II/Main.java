package OOPConcepts.II;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
       operatePhone();
    }
    public static void operatePhone() {
       Phone phone= new SamsungGalaxyS8("blue", "glass", 3455);
       phone.addContact(1,  "0749816870", "Molodvan", "Anca");
       phone.addContact(2, "0741908300", "Tomolea", "Maria");
       phone.listContacts();
       phone.sendMessage("0749816870", "Hello Anca");
       phone.sendMessage("0741908300", "Hello Adi");
       phone.listMessages("0749816870", "0749816870");
       phone.call("0741908300");
       phone.viewHistory();
}}

