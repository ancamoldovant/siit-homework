package Concurrency;

import java.util.Random;

public enum RandomEnumTicketType {
    full,
    fullVip,
    freePass,
    oneDay,
    oneDayVip;


    private static final Random RandomEnumTicketType = new Random();
    public static RandomEnumTicketType randomEnumTicketType()  {
        RandomEnumTicketType[] ticketTypes = values();
        return ticketTypes[RandomEnumTicketType.nextInt(ticketTypes.length)];
    }

}

