package OOPConcepts.II;

public interface Interface {
   void addContact(int item, String phoneNumber, String firstName, String lastName);
    void listContacts();
    void sendMessage(String phoneNumber, String messageContent);

    void listMessages (String phoneNumber, String reciverNumber);
    void call(String phoneNumber);
    void viewHistory();
}

