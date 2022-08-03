package OOPConcepts.II;

public class Message {

    public String receiverNumber;;
   public String messageContent;;

    public Message(String receiverNumber, String messageContent) {
        this.receiverNumber = receiverNumber;
        this.messageContent = messageContent;
    }
    public Message() {

    }
    public String getMessageContent() {
        return messageContent;
    }
    public String getReceiverNumber() {
        return receiverNumber;
    }

    @Override
    public String toString() {
        return (receiverNumber + "," + messageContent);
    }
}
