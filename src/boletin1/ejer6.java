package boletin1;

public class ejer6 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		double x2 = 0.0;
		double x1 = 0.0;
		x1 = (-b+(b^2-(4*a*c))^(1/2))/(2*a);
		x2 = (-b-(b^2-(4*a*c))^(1/2))/(2*a);
		System.out.println("El valor de x siendo a = " + a + " b = " + b + " y c = " + c + " es igual a" + x1 + x2);
	}

}

