package guerra.cap1.generator;


import java.util.List;

import guerra.cap1.event.IEvent;
import guerra.cap1.manager.Dispatcher;

public interface IGenerator {
	//public List<IEvent> generate(); 
	public void setDispacther(Dispatcher dispacther);
}
