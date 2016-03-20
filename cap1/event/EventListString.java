package guerra.cap1.event;

import java.util.List;

public class EventListString implements IEvent {

	public List<String> list;

	public EventListString(List<String> list) {
		this.list = list;
	}

	/**
	 * Getter of list
	 */
	public List<String> getList() {
		return list;
	}

	/**
	 * Setter of list
	 */
	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public void print() {
		if (list != null) {
			int i = 1;
			synchronized (list) {
				for (String str : list) {
					System.out.println(i++ + ") " + str);
				}
			}
		}
	}
}
