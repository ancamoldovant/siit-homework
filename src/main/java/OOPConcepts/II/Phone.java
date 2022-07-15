package OOPConcepts.II;

import java.util.ArrayList;

public abstract class Phone extends Message implements Interface  {
    protected int batteryLife;
    protected String color;
    protected String material;
    protected int imei;

    public Phone(String color, String material, int imei, String reciverNumber, String messageContent) {
        super(reciverNumber,messageContent);
        this.messageContent=messageContent;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }
    public Phone(String color, String material, int imei) {
        super(color, material, imei);
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
    public void listMessages(String reciverNumber, String phoneNumber) {
        for (Message message : messages) ;
        if (reciverNumber == phoneNumber){ ;
        System.out.println(getMessageContent());
    }else{
            System.out.println("nu este mesaj");
        }
}}



