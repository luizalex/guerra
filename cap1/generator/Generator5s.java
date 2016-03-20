package guerra.cap1.generator;

import java.util.ArrayList;
import java.util.List;

import guerra.cap1.event.EventString;
import guerra.cap1.event.IEvent;

public class Generator5s extends AbstractGenerator implements Runnable {
	private String message;

	public Generator5s(String message) {
		this.message = message;
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		try {
			while (true) {
				dispatch(generate());
				Thread.currentThread().sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	//@Override
	public List<IEvent> generate() {
		IEvent event 		= new EventString(message);
		List<IEvent> events = new ArrayList<IEvent>();
		events.add(event);
		return events;
	}


}
