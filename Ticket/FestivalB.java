package Ticket;

//implements a TicketBehavior class which is an interface class
public class FestivalB implements TicketBehavior {

    /**
    * Override that works to reuse method ticketDescription
    * Display information about Festival B ticket
    */
    @Override
    public void ticketDescription() {
        System.out.println("\n[FESTIVAL B]");
        System.out.println("The ticket for Festival B is a ticket that can be used\nfor 2 days of the festival.");
        System.out.println("The price for Festival A ticket --> Rp. 900.000");
    }
}