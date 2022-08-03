package OOPConcepts.II;

public interface Interface {
   void addContact(int item, String phoneNumber, String firstName, String lastName);
    void listContacts();
    void sendMessage(String phoneNumber, String messageContent);

    void listMessages (String receiverNumber);
    void call(String phoneNumber);
    void viewHistory();
}

