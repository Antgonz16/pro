package src.boletin5;

import java.util.Random;
import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int numero;
		int aleatorio;
		int contador=0;
		
		aleatorio = random.nextInt(100)+1;
		System.out.println("El juego del número mágico");
		do {
			System.out.println("Introduce numero:");
			numero = scanner.nextInt();
			if (numero>aleatorio) {
				System.out.println("El numero magico es menor");
			}
			else if (numero<aleatorio) {
				System.out.println("El numero magico es mayor");
			}
			else {
				System.out.println("Acertaste");
			}
			contador++;
			
		} while (numero!=aleatorio);
		System.out.println("Lo has solucionado en "+contador+" intentos");

	}


}
