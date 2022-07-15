package OOPConcepts.II;

public abstract class Samsung extends Phone{


    public Samsung(String color, String material, int imei) {
        super(color, material, imei);
        this.getReciverNumber();
        this.getMessageContent();
    }

    public abstract void listMessages(String reciverNumber);
}

