package OOPConcepts.II;

public class iPhone13 extends iPhone{

    public iPhone13(String color, String material, int imei) {
        super(color, material, imei);
        this.batteryLife=24;
        this.color=color;
        this.material=material;
        this.imei=imei;
    }
    @Override
    public void addContact(int item, int phoneNumber, String firstName, String lastName) {
        super.addContact(item, phoneNumber, firstName, lastName);
        this.item=item;
        this.phoneNumber=phoneNumber;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    @Override
    public void listContacts(Phone phone){
        System.out.println(getItem()+"; "+getPhoneNumber()+"; "+getFirstName()+"; "+getLastName());
    }

    @Override
    public void sendMessage(int phoneNumber, String messageContent) {
        batteryLife=batteryLife-1;
        System.out.println("batteryLife:" + batteryLife + "h");
        this.messageContent=messageContent;
        super.sendMessage(phoneNumber, messageContent);
    }
    @Override
    public void listMessages(int phoneNumber) {
        System.out.println(getMessageContent());
    }

    @Override
    public void call(int phoneNumber) {
        batteryLife=batteryLife-2;
        System.out.println("batteryLife:" + batteryLife + "h");
        this.phoneNumber=phoneNumber;
        super.call(phoneNumber);
    }
    @Override
    public void viewHistory(){
        System.out.println(getPhoneNumber() + "," + getFirstName());
    }
}
