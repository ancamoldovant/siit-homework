package Concurrency;

public class FestivalAttendeeThread extends Thread {

    private FestivalGate run;

    public FestivalAttendeeThread(FestivalGate run) {
        this.run = run;
    }

    @Override
    public void run() {run.run(RandomEnumTicketType.randomEnumTicketType(), "gate");
    }
}

