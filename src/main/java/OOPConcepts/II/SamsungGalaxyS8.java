package OOPConcepts.II;

public class SamsungGalaxyS8 extends Samsung implements Interface{
    public SamsungGalaxyS8(String color, String material, int imei) {
        super(color, material, imei);
        this.batteryLife=12;
        this.color=color;
        this.material=material;
        this.imei=7654321;
    }
    @Override
    public void addContact(int item, int phoneNumber, String firstName, String lastName) {
    }

    @Override
    public void listMessages(int phoneNumber) {

    }
}

