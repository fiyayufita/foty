/**
 * FESTIVAL OF THE YEAR (FOTY)
 * @author Fiya Yufita
 * NPM 1908107010017
 * @version 2021
 * 
*/
 
import Ticket.*;
import Events.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Foty {
    //scanner declaration for input
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //name input 
        System.out.println("Enter ur name:");
        String name = in.next();

        System.out.println("+-------------------------------------------+");
        System.out.println("|             *WELCOME TO FOTY*             |");
        System.out.println("|          (FESTIVAL OF THE YEAR)           |");
        System.out.println("|                                           |");
        System.out.println("|    [1] Ticket       [2] Series of Events  |");
        System.out.println("+-------------------------------------------+");
        // chooses input
        System.out.println("Choose ur view:  ");
        int input = Foty.in.nextInt();

        switch(input) {
            //call method startTicketDescription
            case 1:
                new Foty().startTicketDescription();
                break;
            //call method startSeriesOfEvents
            case 2:
                new Foty().startSeriesOfEvents();
                break;
            default:
                System.out.println("\nThank You For Visiting!!");
        } 
    }

    void startTicketDescription() {
        //TicketType object
        TicketType ticketType = new TicketType();

        String repeat = "y";
        while (repeat.equalsIgnoreCase("y")) {
            
            System.out.println("---------------------------------------------");
            System.out.println("[FESTIVAL TICKET]");
            System.out.println("\n1. FESTIVAL A");
            System.out.println("2. FESTIVAL B");
            System.out.println("3. FESTIVAL C");
            System.out.println("Choose ur ticket:  ");
            int choose = in.nextInt();

            switch(choose) {
                //call the method to display a description of type A
                case 1:
                    ticketType.setTicketDescription(new FestivalA());
                    ticketType.ticketDescription();
                    break;
                //call the method to display a description of type B
                case 2:
                    ticketType.setTicketDescription(new FestivalB());
                    ticketType.ticketDescription();
                    break;
                //call the method to display a description of type C
                case 3:
                    ticketType.setTicketDescription(new FestivalC());
                    ticketType.ticketDescription();
                    break;
                default:
                    System.out.println("\nDon't forget to check out some of the events that will be held!!");
                    System.out.println("Thank You For Visiting!!");
                    System.exit(0);
            }
            //back to see another ticket or not
            System.out.println("\nChoose another ticket? (y/n)");
            System.out.println("Press (k) if u want the ticket to be kept!");
            repeat = in.next();

            if (repeat.equalsIgnoreCase("k")) {
                System.out.println("\nThe ticket has been kept!!");
            }
        }
        System.out.println("\nDon't forget to check out some of the events that will be held!!");
        System.out.println("Thank You For Visiting!!");
    }

    void startSeriesOfEvents() {
        //object for list series of events
        ArrayList<String> list = new  ArrayList<String>();
        EventsInterface series = new EventsAdapter();

        System.out.println("---------------------------------------------");
        System.out.println("\nHere are some of the series of festival events:\n");

        list.add("1. Opening Ceremony");
        list.add("2. Expo");
        list.add("3. Theater Festival");
        list.add("4. Art Festival");
        list.add("5. Exhibition");
        list.add("6. Competition");
        list.add("7. Opera Festival");
        list.add("8. Shadow Puppet Show");
        list.add("9. Traditional Dance");
        list.add("10. Stand Up Comedy");
        list.add("11. Music Concert");
        list.add("12. Guest Star");
        list.add("13. Closing Ceremony");
		series.listEvents(list);

        System.out.println("\nSo, don't miss the excitement of the festival!!");
        System.out.println("See you there!!!");
    }
}