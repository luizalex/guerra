package guerra.cap1.receiver;

import guerra.cap1.event.IEvent;
import guerra.cap1.receiver.IReceiver;

public class ReceiverCounter implements IReceiver {

	private int counter = 0;
	public void receive(IEvent event) { 
		counter++;
		System.out.println("Received events: "+counter);
	 } 

}
