package modelo;

public class Robot extends Thread {

	private int parlar;
	
	public Robot(String name, int parlar) {
		super(name);
		this.parlar = parlar;
	}
	
	public void run(){
		for(int i = 0; i < parlar; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(super.getName());
		}
	}

}
