package OOPConcepts.I;

public class VWPassat extends Volkswagen{
    public VWPassat(double availableFuel, int tireSize, int chassisNumber) {
    super(availableFuel, tireSize, chassisNumber);
    this.fuelTankSize = 25;
    this.fuelType = "Petrol";
    this.gears = 6;
    this.consumptionPer100Km = 8.9;
}
    @Override
    public void start() {
        System.out.println("Start VWPassat");
    }

    @Override
    public int shiftGear(int gear) {
        return super.shiftGear(gear);
    }

    @Override
    public double drive(double drives) {
        System.out.println("Drives:" + drives + " KMs");
        return super.drive(drives);
    }
    @Override
    public double AverageFuelConsumption() {
        return (getAvailableFuel()/totalDistanceTraveled)/100;
    }
    @Override
    public double AvailableFuelMethod() {
        return getAvailableFuel()-AverageFuelConsumption();
    }
    @Override
    public void stop() {
        System.out.println("Stop VWPassat");
    }
}
