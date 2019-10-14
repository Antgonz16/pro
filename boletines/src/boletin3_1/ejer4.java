package src.boletin3_1;
import java.util.Scanner;
public class ejer4 {

	public static void main(String[] args) {
		//Transforma una frase en minusculas a mayusculas
		Scanner scanner = new Scanner(System.in);
		String frase_min;
		String frase_mayus;
		
		//Lectura de datos
		System.out.println("Introduzca una frase para pasarla a mayusculas:");
		frase_min = scanner.nextLine();
		
		//Paso de minusculas a mayusculas
		frase_mayus = frase_min.toUpperCase();
		
		//Escritura de datos
		System.out.println("\tTu frase en minuscula es: " + frase_min);
		System.out.println("\tTu frase en mayuscula es: " + frase_mayus);
	}

}
