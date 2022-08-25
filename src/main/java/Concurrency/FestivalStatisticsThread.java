package Concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class FestivalStatisticsThread extends Thread{
    private FestivalGate festivalGate;
    public FestivalStatisticsThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }
    public void run() {
        festivalGate.countTickets(festivalGate.festivalAttendee);
    }
    }

