package guerra.cap1.event;


public class EventString implements IEvent {

	public EventString(String message){
		this.message = message;
	}
	/**
	 * 
	 */
	public String message;

	/**
	 * Getter of message
	 */
	public String getMessage() {
	 	 return message; 
	}

	/**
	 * Setter of message
	 */
	public void setMessage(String message) { 
		 this.message = message; 
	}

	@Override
	public void print() {
		System.out.println("message: "+message);
		
	} 

}
