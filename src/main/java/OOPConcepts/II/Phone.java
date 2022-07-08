package OOPConcepts.II;

public abstract class Phone implements Interface {
    protected int batteryLife;
    protected String color;
    protected String material;
    protected int imei;

    protected int item;
    protected int phoneNumber;
    protected String firstName;
    protected String lastName;

    public String getMessageContent() {
        return messageContent;
    }
    protected String messageContent;

    public Phone(String color, String material, int imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;
    }
@Override
    public void addContact(int item, int phoneNumber, String firstName, String lastNam) {
    }
    @Override
    public void listContacts(Phone phone) {
        System.out.println(phone);
    }
    @Override
    public void sendMessage(int phoneNumber, String messageContent){
        int chars = 100;
        if ( messageContent.length() > chars) {
            throw new
                    IllegalArgumentException("A message can have maximum 100 chars");
        }
    }
    @Override
    public void listMessages(int phoneNumber){
        if(phoneNumber==this.phoneNumber)
        System.out.println(getMessageContent());}


    @Override
    public void call(int phoneNumber) {
    }
    @Override
    public void viewHistory() {

    }

    public int getItem() {
        return item;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}


