package guerra.cap1.generator;

import java.util.ArrayList;
import java.util.List;

import guerra.cap1.event.EventListString;
import guerra.cap1.event.IEvent;

public class GeneratorListString extends AbstractGenerator implements Runnable {
	private List<String> list;

	public GeneratorListString(List<String> message) {
		this.list = message;
	}

	@Override
	public void run() {
		dispatch(generate());

	}

	//@Override
	public List<IEvent> generate() {
		IEvent event 			= new EventListString(list);
		List<IEvent> events 	= new ArrayList<IEvent>();
		events.add(event);
		return events;
	}
	

}
