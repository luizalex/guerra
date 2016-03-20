package guerra.cap1.generator;

import java.util.ArrayList;
import java.util.List;

import guerra.cap1.event.IEvent;

public class GeneratorDuplo extends AbstractGenerator implements Runnable {
	private String message;

	public GeneratorDuplo(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		//dispatch(generate());
		Generator5s 	g1 = new Generator5s(message);
		Generator1to10s g2 = new Generator1to10s(message);

		g1.setDispacther(getDispacther());
		g2.setDispacther(getDispacther());
		
		new Thread(g1).start();
		new Thread(g2).start();
	}

}
