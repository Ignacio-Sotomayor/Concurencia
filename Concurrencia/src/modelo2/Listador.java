package modelo2;

import java.util.ArrayList;

public class Listador extends Thread {
	
	private ArrayList<String> li = new ArrayList<String>(5);
	
	public Listador(String palabra1,String palabra2,String palabra3,String palabra4,String palabra5) {
		li.add(palabra1);
		li.add(palabra2);
		li.add(palabra3);
		li.add(palabra4);
		li.add(palabra5);
	}
	
	@Override
	public void run(){
		double palabra;
		for(int i = 0; i < 30; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			palabra=(int)((Math.random()*10)/2);
			System.out.println(li.get((int) palabra));
		}	
	}
}
