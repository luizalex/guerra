package guerra.cap1.manager;

import java.util.ArrayList;
import java.util.List;

import guerra.cap1.event.IEvent;
import guerra.cap1.generator.IGenerator;
import guerra.cap1.receiver.IReceiver;
import guerra.cap1.receiver.IReceiverGenerator;

public class Dispatcher {

	private List<IReceiver> receivers = new ArrayList<IReceiver>();

	public void add(IReceiver receiver) {
		receivers.add(receiver);
	};
	
	public void add(IGenerator generator) {
		generator.setDispacther(this);
	};

	public void add(IReceiverGenerator receiverGenerator) {
		add((IReceiver)receiverGenerator);
		receiverGenerator.setDispacther(this);
	};
	
	public IEvent dispatch(IEvent event) {
		for (IReceiver r : receivers) {
			r.receive(event);
		}
		return event;
	}

	public List<IEvent> dispatch(List<IEvent> events) {
		for (IEvent event : events) {
			dispatch(event);
		}
		return events;
	}
}
