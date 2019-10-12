package src.boletin4;
import java.util.Scanner;
public class ejer3 {

	public static void main(String[] args) {
		//Programa que calcula el precio de una hacer una bandera
		Scanner scanner = new Scanner(System.in);
		double ancho = 0.0;
		double altura = 0.0;
		double area = 0.0;
		String bordado;
		double precio_bordado = 0.0; 
		double precio = 0.0;
		
		//Lectura de datos
		System.out.println("Introduzca la altura de la bandera en cm: ");
		altura = scanner.nextDouble();
		System.out.println("Ahora introduzca la: ");
		ancho = scanner.nextDouble();
		scanner.nextLine();
		do {
			System.out.println("¿Quieres escudo bordado? (s/n): ");
			bordado = scanner.nextLine();
		} while (bordado.contentEquals("s")== false && bordado.contentEquals("n")== false);
		
		//Calculo de operaciones
		area = ancho * altura;
		precio = area/100;
		
		//Escritura de resulatados
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.println("Bandera de "+area+" cm2:  \t" +precio+ " €");
		if(bordado.contentEquals("s")) {
			precio_bordado = 2.50;
			System.out.println("Con escudo:           \t" +precio_bordado+ " €");
		}
		else {
			System.out.println("Sin escudo:          \t" +precio_bordado+ " €");
		}
		System.out.println("Gastos de envio:      \t3.25 €");
		System.out.println("Total:             \t" +(precio+precio_bordado+3.25)+ " €");
	}

}
