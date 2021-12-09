package Events;
import java.util.ArrayList;
 
 //implements a EventsInterface class which is an interface class
public class EventsAdapter implements EventsInterface{

	public void listEvents(ArrayList<String> list) {
	
		//Converting ArrayList<String> to String so that we can pass String to SeriesOfEvents class
		String listString = "";

		for (String series : list) {
		    listString += series + "\n";
		}
		
		//instantiating SeriesOfEvents class
		SeriesOfEvents seriesOfEvents = new SeriesOfEvents();
		seriesOfEvents.events(listString);
	}
}