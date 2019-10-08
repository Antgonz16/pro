package src.boletin3;
import java.util.Scanner;
public class ejer4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		System.out.println("Dame dos catetos de un triangulo rectangulo \na: ");
		a = scanner.nextDouble();
		System.out.println("\nb: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
		System.out.println("Tu resultado es: "+c);
	}

}
