package src.boletin4;
import java.util.Scanner;
public class ejer4 {

	public static void main(String[] args) {
		//Programa que calcula la media de un alumno
		Scanner scanner = new Scanner(System.in);
		double nota1 = 0.0;
		double nota2 = 0.0;
		double media = 0.0;
		String recuperacion;
		
		//Lectura de datos
		System.out.println("Nota del primer control: ");
		nota1 = scanner.nextDouble();
		System.out.println("Nota del segundo control: ");
		nota2 = scanner.nextDouble();
		scanner.nextLine();
		media = (nota1 + nota2) / 2; //Calculo de la media
		if (media < 5) {
			System.out.println("¿Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
			do {
				recuperacion = scanner.nextLine();
			} while (recuperacion.contentEquals("apto")== false && recuperacion.contentEquals("no apto")== false);
		
		//Escritura de resultados	
			if (recuperacion.contentEquals("apto")) {
				System.out.println("Tu nota de programacion es un 5");
			}
			else {
				System.out.println("Tu nota de programacion es un " + media);
			}
		}
		else {
			System.out.println("Tu nota de programacion es un " + media);
		}

	}

}
