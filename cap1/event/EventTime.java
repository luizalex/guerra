package guerra.cap1.event;


public class EventTime implements IEvent {

	/**
	 * 
	 */
	private long time;
	private String message;

	
	public EventTime(String message, long time){
		this.message = message;
		this.time    = time;
	}
	
	
	/**
	 * Getter of time
	 */
	public long getTime() {
	 	 return time; 
	}

	/**
	 * Setter of time
	 */
	public void setTime(long time) { 
		 this.time = time; 
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public void print() {
		System.out.println("message:"+message+", time:"+time);
		
	} 

}
