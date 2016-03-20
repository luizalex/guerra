package guerra.cap1.receiver;

import guerra.cap1.event.IEvent;
import guerra.cap1.receiver.IReceiver;

public class ReceiverString implements IReceiver {

	public void receive(IEvent event) {
		event.print();
	}

}
