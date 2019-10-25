package src.acepta_el_reto;

import java.util.Scanner;


public class la_fiesta_aburrida {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String saludo;
		int bucle;
		bucle = scanner.nextInt();
		scanner.nextLine();
		
		while (bucle >0 ) {
			saludo = scanner.nextLine();
			String[] partes = saludo.split(" ");
			System.out.println("Hola, "+partes[1]+".");
			bucle--;
		}

	}
}
