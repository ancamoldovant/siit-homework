package OOPConcepts.I;

public class VWGolf extends Volkswagen{

    public VWGolf(double availableFuel, int tireSize, int chassisNumber) {
        super(availableFuel, tireSize, chassisNumber);
        this.fuelTankSize = 15;
        this.fuelType = "DIESEL";
        this.gears = 6;
        this.consumptionPer100Km = 7.9;
    }
    @Override
    public void start() {
        System.out.println("Start VWGolf");
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
        System.out.println("Stop VWGolf");
    }
}


