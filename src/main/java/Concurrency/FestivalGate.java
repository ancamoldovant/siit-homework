package Concurrency;

import java.util.*;

import static java.lang.String.valueOf;

public class FestivalGate {
    private RandomEnumTicketType ticketType;
    private String gate;

    Queue<RandomEnumTicketType> festivalAttendee = new LinkedList<>();

    public FestivalGate() {
        this.ticketType = RandomEnumTicketType.randomEnumTicketType();
        this.gate = gate;
    }

    public void run(RandomEnumTicketType ticketType, String gate) {
        if (validateTicket()) {
            arrivingAttendee();
        }
        countTickets();
    }

    public boolean validateTicket() {
        Queue<RandomEnumTicketType> festivalAttendee = new LinkedList<>();
        for (int i = 0; i < 2; i++) {
            festivalAttendee.add(RandomEnumTicketType.randomEnumTicketType());
            Iterator iterator = festivalAttendee.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            int countTickets = 0;
            if (ticketType == RandomEnumTicketType.oneDayVip) {
                countTickets++;
                System.out.println(countTickets + " " + "people have oneDayVip tickets");
                //System.out.println(festivalAttendee.size() + " people entered");
            }
        }
        return false;
    }

    public void countTickets() {
        for (int i = 0; i < festivalAttendee.size(); i++) {
        int countTickets = 0;
        if (ticketType == RandomEnumTicketType.oneDayVip) {
            countTickets++;
            System.out.println(countTickets + " " + "people have oneDayVip tickets");
        } else if (ticketType == RandomEnumTicketType.freePass) {
            countTickets++;
            System.out.println(countTickets + " " + "people have freePass tickets");
        } else if (ticketType == RandomEnumTicketType.full) {
            countTickets++;
            System.out.println(countTickets + "" + "full");
        }
    }}
     private void arrivingAttendee() {
    try {
        System.out.println("Arriving");
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}}
