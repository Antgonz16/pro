package boletin2;
import java.util.Scanner;
public class ejer4 {

	public static void main(String[] args) {
		//Halla el area del triangulo
		Scanner scanner = new Scanner(System.in);
		double a = 0.0; //altura del triangulo
		double b = 0.0; //base del triangulo
		double area = 0.0; //Area del triangulo
		
		//Te pide los lados del triangulo
		System.out.println("Dame dos lados de un tringualo.\n Altura: ");
		a = scanner.nextInt();
		scanner.hasNextLine();
		System.out.println("Base: ");
		b = scanner.nextInt();
		while (a<=0 || b<=0) {
			System.out.println("Dame dos lados de un tringualo mayores de 00.\n Altura: ");
			a = scanner.nextInt();
			scanner.hasNextLine();
			System.out.println("Base: ");
			b = scanner.nextInt();
		}
		
		//Calcula el area
		area = (b * a) / 2;
		
		//Muestra el resultado
		System.out.println("El triángulo de base "+b+" y altura "+a+" tiene un área de "+area);
		
	}

}
