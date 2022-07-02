package OOPConcepts.I;

public class SKlasse extends Mercedes{
    public SKlasse(double availableFuel, int tireSize, int chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelTankSize=20;
        this.fuelType="PETROL";
        this.gears=6;
        this.consumptionPer100Km=7.4;
    }

    @Override
    public void start() {
        System.out.println("Start SKlasse");;
    }
    @Override
    public int shiftGear(int gear) {
        System.out.println("Gear:" + gear);
        return super.shiftGear(gear);
    }
    @Override
    public double drive(double drives) {
        System.out.println("Drives:" + drives);
        return super.drive(drives);
    }

    @Override
    public double AverageFuelConsumption() {
        return (this.availableFuel/totalDistanceTraveled)/100;
    }
    @Override
    public double AvailableFuelMethod() {
        return getAvailableFuel()-AverageFuelConsumption();
    }
    @Override
    public void stop() {
        System.out.println("Stop SKlasse");
    }
}
