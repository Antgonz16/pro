package src.boletin3_1;
import java.util.Scanner;
public class ejer4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase_min;
		String frase_mayus;
		
		System.out.println("Introduzca una frase pra pasarla a mayusculas:");
		frase_min = scanner.nextLine();
		
		
		frase_mayus = frase_min.toUpperCase();
		
		System.out.println("\tTu frase en minuscula es: " + frase_min);
		System.out.println("\tTu frase en mayuscula es: " + frase_mayus);
	}

}
