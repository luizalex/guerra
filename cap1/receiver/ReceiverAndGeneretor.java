package guerra.cap1.receiver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import guerra.cap1.event.EventListString;
import guerra.cap1.event.EventString;
import guerra.cap1.event.IEvent;
import guerra.cap1.generator.IGenerator;
import guerra.cap1.manager.Dispatcher;

public class ReceiverAndGeneretor implements IReceiverGenerator {

	private List<String> messages =  Collections.synchronizedList(new ArrayList());
	private Dispatcher dispatcher;
	
	public void receive(IEvent event) { 
		if(event instanceof EventString){
			messages.add(((EventString) event).getMessage());
			EventListString e = new EventListString(messages);
			if(dispatcher != null)
				dispatcher.dispatch(e);
		}
	 }

	@Override
	public void setDispacther(Dispatcher dispacther) {
		this.dispatcher = dispacther;
	} 

}
