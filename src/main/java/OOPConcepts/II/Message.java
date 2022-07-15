package OOPConcepts.II;

public class Message {
   protected String reciverNumber;

    protected String messageContent;

    public Message(String reciverNumber, String messageContent) {
        this.reciverNumber = reciverNumber;
        this.messageContent = messageContent;
    }

    public Message(String color, String material, int imei) {
    }

    public String getMessageContent() {
        return messageContent;
    }
    public String getReciverNumber() {
        return reciverNumber;
    }

    @Override
    public String toString() {
        return (reciverNumber+ "," + messageContent);
    }
}
