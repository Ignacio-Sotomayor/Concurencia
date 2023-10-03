package modelo2;

import java.awt.Toolkit;

public class Parlante extends Thread {

	public void run(){
		for(int i=0; i < 20; i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Toolkit.getDefaultToolkit().beep();
		}
	}
	
}
