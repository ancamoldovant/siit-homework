package OOPConcepts.II;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Phone implements Interface {
    protected int batteryLife;
    protected String color;
    protected String material;
    protected int imei;

    public Phone(String color, String material, int imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;
        this.batteryLife=batteryLife;
    }

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    @Override
    public void addContact(int item, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(item, phoneNumber, firstName, lastName);
        contacts.add(contact);
    }

    @Override
    public void listContacts() {
        System.out.println("Contacts: " + contacts);
    }

    private ArrayList<Message> messages = new ArrayList<>();
    Message message = new Message();
    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        Message message = new Message(phoneNumber,messageContent);
        messages.add(message);
        int chars = 100;
        if ( messageContent.length() > chars) {
            throw new
                    IllegalArgumentException("A message can have maximum 100 chars");
        }
        batteryLife=batteryLife-1;
        System.out.println("BatteryLife after send message: " + batteryLife);
    }
    @Override
    public void listMessages(String receiverNumber) {
        for (Message message : messages) ;
        if (contacts.equals(message.getReceiverNumber())) ;
        System.out.println(message.messageContent);

    }

    private ArrayList<Call> calls = new ArrayList<>();
@Override
    public void call(String callPhoneNumber){
        Call call= new Call(callPhoneNumber);
        calls.add(call);
       batteryLife=batteryLife-2;
     System.out.println("BatteryLife after call: " + batteryLife);
}

    @Override
    public void viewHistory() {
        for (Call call : calls) ;
        System.out.println("call list:"+ calls);;
    }
}


