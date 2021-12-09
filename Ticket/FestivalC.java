package Ticket;

//implements a TicketBehavior class which is an interface class
public class FestivalC implements TicketBehavior {

    /**
    * Override that works to reuse method ticketDescription
    * Display information about Festival C ticket
    */
    @Override
    public void ticketDescription() {
        System.out.println("\n[FESTIVAL C]");
        System.out.println("The ticket for Festival C is a ticket that can be used\nfor only one day of the festival.");
        System.out.println("The price for Festival A ticket --> Rp. 500.000");
    }
}