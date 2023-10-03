package modelo;

public class Test {

	public static void main(String[] args) {
		
		Robot r1 = new Robot("Juan", 3);
		Robot r2 = new Robot("Pepe", 3);
		Robot d2 = new Robot("Ximena", 3);
		Robot c3 = new Robot("Joaquin", 3);
		Robot po = new Robot("Agostina", 3);
		
		r1.start();
		r2.start();
		d2.start();
		c3.start();
		po.start();

	}

}
