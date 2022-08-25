package Concurrency;

public class Main {
    public static void main(String[] args) {

    FestivalGate gate = new FestivalGate();
    TicketType ticketTypes=new TicketType(RandomEnumTicketType.randomEnumTicketType());
    FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(new FestivalGate());
    festivalAttendee.start();
    FestivalStatisticsThread festivalStatisticsThread=new FestivalStatisticsThread(new FestivalGate());
   // festivalStatisticsThread.start();
}}
