package guerra.cap1.generator;

import java.util.List;

import guerra.cap1.event.IEvent;
import guerra.cap1.manager.Dispatcher;

public abstract class AbstractGenerator implements IGenerator {

	private Dispatcher dispacther;

	public Dispatcher getDispacther() {
		return dispacther;
	}

	public void setDispacther(Dispatcher dispacther) {
		this.dispacther = dispacther;
	}

	public IEvent dispatch(IEvent event){
		if (dispacther != null)
			dispacther.dispatch(event);
		return event;
	}
	
	public List<IEvent> dispatch(List<IEvent> events){
		if (dispacther != null)
			dispacther.dispatch(events);
		return events;
	}
}
