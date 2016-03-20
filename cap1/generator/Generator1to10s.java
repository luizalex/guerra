package guerra.cap1.generator;

import java.util.ArrayList;
import java.util.List;

import guerra.cap1.event.EventTime;
import guerra.cap1.event.IEvent;

public class Generator1to10s extends AbstractGenerator implements Runnable {
	private String message;

	public Generator1to10s(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		try {
			while (true) {
				dispatch(generate());
				long time = Math.round(Math.random() * 10) * 1000;
				Thread.currentThread().sleep(time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	//@Override
	public List<IEvent> generate() {
		IEvent event 		= new EventTime(message, System.currentTimeMillis());
		List<IEvent> events = new ArrayList<IEvent>();
		events.add(event);
		return events;
	}
}
