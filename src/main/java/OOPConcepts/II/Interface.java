package OOPConcepts.II;

public interface Interface {
   void addContact(int item, int phoneNumber, String firstName, String lastName);
   void listContacts(Phone phone);

   void sendMessage(int phoneNumber, String messageContent);
   void listMessages(int phoneNumber);
   void call(int phoneNumber);
   void viewHistory();

}

