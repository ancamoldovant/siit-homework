package OOPConcepts.II;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Phone implements Interface  {
    protected int batteryLife;
    protected String color;
    protected String material;
    protected int imei;

    public Phone(String color, String material, int imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    private ArrayList<Contact> contacts = new ArrayList<Contact>();
   @Override
    public void addContact(int item, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(item, phoneNumber, firstName, lastName);
        contacts.add(contact);
    }
    @Override
    public void listContacts() {
        System.out.println(contacts);
    }
    private ArrayList<Message> messages = new ArrayList<Message>();
    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        Message message = new Message(phoneNumber, messageContent);
        messages.add(message);

    }
    @Override
    public void listMessages(String receiverNumber, String phoneNumber) {
        for (Message message : messages) ;
        if(receiverNumber.equals(phoneNumber));
        System.out.println(messages);

    }
}



