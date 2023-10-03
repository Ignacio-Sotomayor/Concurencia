package modelo2;

public class Test {

	public static void main(String[] args) {
		
		Contador c1 = new Contador();
		Listador l1 = new Listador("Juan","Ximena","Pedro","Cacho","Brenda");
		Parlante p1 = new Parlante();
		
		c1.start();
		l1.start();
		p1.start();

	}

}
