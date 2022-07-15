package OOPConcepts.II;

public class SamsungGalaxyS8 extends Samsung {
    public SamsungGalaxyS8(String color, String material, int imei) {
       super(color, material, imei);
        this.getReciverNumber();
        this.getMessageContent();
        this.messageContent=getMessageContent();
        this.batteryLife = 12;
        this.color = color;
        this.material = material;
        this.imei = 7654321;
    }

    @Override
    public void addContact(int item, String phoneNumber, String firstName, String lastName) {
        super.addContact(item, phoneNumber, firstName, lastName);
    }
    @Override
    public void listContacts() {
        super.listContacts();
    }
    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        super.sendMessage(phoneNumber, messageContent);
      //  System.out.println(phoneNumber + ";" + messageContent);
    }
@Override
    public void listMessages(String reciverNumber) {
    System.out.println(getMessageContent());
}
}


