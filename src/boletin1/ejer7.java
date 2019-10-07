package boletin1;

public class ejer7 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int cambio = 0;
		System.out.println("Al principio del programa, el valor de a es " + a + " y el valor de b es " + b);
		cambio = a;
		a = b;
		b = cambio;
		System.out.println("Después del intercambio, el valor de a es " + a +" y el valor de b es "+ b);
	}

}
