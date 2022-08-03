package OOPConcepts.I;

public class Main {
    public static void main(String[] args) {
        Car car=new CKlasse(30, 12, 78965);
       // Car car1=new SKlasse(20, 17, 6789);
        car.start();
        car.shiftGear(1);
        car.drive(0.01);
        car.shiftGear(2);
        car.drive(0.02);
        car.shiftGear(3);
        car.drive(0.5);
        car.shiftGear(4);
        car.drive(0.5);
        car.shiftGear(4);
        car.drive(0.5);
        car.shiftGear(5);
        car.drive(10);
        car.shiftGear(4);
        car.drive(0.5);
        car.shiftGear(3);
        car.drive(0.1);
        car.stop();
       double finalAvailableFuel= car.AvailableFuelMethod();
       System.out.println("AvailableFuel " + finalAvailableFuel + " l");
       double fuelConsumedPer100Km = car.AverageFuelConsumption();
       System.out.println("ConsumedPer100Km:" + fuelConsumedPer100Km + " l");

       Vehicle vehicle=new SKlasse(20, 17, 45678);
       vehicle.start();
       vehicle.drive(1);
       vehicle.stop();
       double car1AvailableFuel = vehicle
               .AvailableFuelMethod();
       System.out.println("AvailableFuel " + car1AvailableFuel + " l");
        //float fuleConsumedPer100Km = car.AverageFuelConsumption();
        System.out.println("ConsumedPer100Km:" + fuelConsumedPer100Km + " l");


    }
}
