package guerra.cap1.receiver;

import guerra.cap1.event.IEvent;

public interface IReceiver {

	/**
	 * 
	 * @param event 
	 */
	public void receive(IEvent event); 

}
