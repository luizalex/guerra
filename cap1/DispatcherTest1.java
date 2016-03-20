package guerra.cap1;

import guerra.cap1.generator.Generator1to10s;
import guerra.cap1.generator.Generator5s;
import guerra.cap1.generator.GeneratorDuplo;
import guerra.cap1.generator.IGenerator;
import guerra.cap1.manager.Dispatcher;
import guerra.cap1.receiver.IReceiver;
import guerra.cap1.receiver.IReceiverGenerator;
import guerra.cap1.receiver.ReceiverAndGeneretor;
import guerra.cap1.receiver.ReceiverCounter;
import guerra.cap1.receiver.ReceiverString;

public class DispatcherTest1 {

	public static void main(String[] args) {
		IReceiver	 		 r1 = new ReceiverString();
		IReceiver 	 		 r2 = new ReceiverCounter();
		IReceiverGenerator	 r3 = new ReceiverAndGeneretor();

		IGenerator	 		 g1 = new Generator5s("g5");
		IGenerator 			 g2 = new Generator1to10s("g1_10");
		IGenerator  		 g3 = new GeneratorDuplo("gduplo");
		
		Dispatcher			 d  = new Dispatcher();
		d.add(g1);
		d.add(g2);
		d.add(g3);
		d.add(r1);
		d.add(r2);
		d.add(r3);
		
		new Thread((Runnable)g1).start();
		new Thread((Runnable)g2).start();
		new Thread((Runnable)g3).start();
	}

}
