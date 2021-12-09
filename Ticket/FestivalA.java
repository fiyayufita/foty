package Ticket;

//implements a TicketBehavior class which is an interface class
public class FestivalA implements TicketBehavior {
 
    /**
    * Override that works to reuse method ticketDescription
    * Display information about Festival A ticket
    */
    @Override
    public void ticketDescription() {
        System.out.println("\n[FESTIVAL A]");
        System.out.println("The ticket for Festival A is a ticket that can be used\nfor 3 days of the festival.");
        System.out.println("The price for Festival A ticket --> Rp. 1.300.000");
    }
}