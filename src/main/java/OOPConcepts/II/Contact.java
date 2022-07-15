package OOPConcepts.II;

public class Contact {
    private   int item;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact( int item, String phoneNumber, String firstName, String lastName) {
        this.item = item;
        this.phoneNumber = phoneNumber;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getItem() {
        return item;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return (phoneNumber+ ";"+ firstName +" "+ lastName);
    }}




