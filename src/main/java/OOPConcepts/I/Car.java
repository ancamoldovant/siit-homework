package OOPConcepts.I;

public  abstract class Car implements Vehicle {
   protected double fuelTankSize;
   protected String fuelType;
   protected int gears;
   protected double consumptionPer100Km;
   protected double availableFuel;
   protected int tireSize;
   protected int chassisNumber;
   public double totalDistanceTraveled;

   public Car(double availableFuel, int tireSize, int chassisNumber) {
      this.availableFuel = availableFuel;
      this.tireSize = tireSize;
      this.chassisNumber = chassisNumber;
      this.totalDistanceTraveled=0;
   }

   public double getConsumptionPer100Km() {
      return consumptionPer100Km;
   }
   public int getGears() {
      return gears;
   }
   public double getAvailableFuel() {
      return availableFuel;
   }

   public void start() {
      boolean isStarted = false;
      boolean isDriving = false;
      boolean isStopped = true;
      if (isStarted) {
         isStopped = false;
         isStarted = true;
      } else {
         System.out.println("You can't start a car which is already started.");
      }
   }

   public int shiftGear(int gear) {

      if (gear > gears) {
         throw new
                 IllegalArgumentException("This car has maximum 6 gears");
      } else {
      int currentGear;
      System.out.println("Gear:" + gear);
      return currentGear = gear;}
   }

   @Override
   public double drive(double drives) {
      boolean isStarted = true;
      boolean isDriving = false;
      if (isStarted) {
         isDriving = true;
         totalDistanceTraveled +=drives;
      } else {
         System.out.println("You can't drive a car which is not started.");
      }
      return drives;
   }

   @Override
   public double AverageFuelConsumption() {
      return (availableFuel/totalDistanceTraveled)/100;
   }
   @Override
   public double AvailableFuelMethod() {
      return getAvailableFuel()-AverageFuelConsumption();
   }

   @Override
   public void stop() {
      boolean isStarted = false;
      boolean isDriving = false;
      boolean isStopped = true;
      if (isStarted) {
         isStarted = false;
         isDriving = false;
         isStopped = true;
      } else
         System.out.println("You can't stop a car which is not started.");}
}




