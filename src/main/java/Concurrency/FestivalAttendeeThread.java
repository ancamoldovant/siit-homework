package Concurrency;

public class FestivalAttendeeThread extends Thread {

    private FestivalGate festivalGate;

    public FestivalAttendeeThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        festivalGate.validateTicket(RandomEnumTicketType.randomEnumTicketType(), "gate");
    }

}
