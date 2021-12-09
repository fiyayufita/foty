package Ticket;

public class TicketType {
    /**
    * Acces modifier used is private
    * Meaning that it can only be accessed by TicketType
    */
    private TicketBehavior ticket;

    /**
     * setTicket method -> method with parameter ticket
     * Set for the ticket description
     */
    public void setTicketDescription(TicketBehavior ticket) {
        this.ticket = ticket;
    }

    /**
     * getTicket method-> return ticket description information
     * Using the return function
     */
    public TicketBehavior getTicketDescription() {
        return ticket;
    }

    //ticketDescription method -> provide information on each type of ticket
    public void ticketDescription() {
        ticket.ticketDescription();
    }
}