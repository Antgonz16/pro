package src.boletin3;
import java.util.Scanner;
public class ejer4 {

	public static void main(String[] args) {
		//Caclula el area de un triangulo rectangulo
		Scanner scanner = new Scanner(System.in);
		double a = 0.0;//Cateto1
		double b = 0.0;//Cateto2
		double c = 0.0;//Hipotenusa
		
		//Lectura de datos
		System.out.println("Dame dos catetos de un triangulo rectangulo \na: ");
		a = scanner.nextDouble();
		System.out.println("\nb: ");
		b = scanner.nextDouble();
		
		//Calculo del area
		c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
		
		//Escritura de datos
		System.out.println("Tu resultado es: "+c);
	}

}
