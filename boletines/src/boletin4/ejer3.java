package src.boletin4;
import java.util.Scanner;
public class ejer3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double ancho = 0.0;
		double altura = 0.0;
		double area = 0.0;
		String bordado;
		double precio = 0.0;
		
		System.out.println("Introduzca la altura de la bandera en cm: ");
		altura = scanner.nextDouble();
		System.out.println("Ahora introduzca la: ");
		ancho = scanner.nextDouble();
		scanner.nextLine();
		do {
			System.out.println("¿Quieres escudo bordado? (s/n): ");
			bordado = scanner.nextLine();
		} while (bordado.contentEquals("s")== false && bordado.contentEquals("n")== false);
		area = ancho * altura;
		precio = area/100;
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.println("Bandera de "+area+" cm2:  " +precio+ " €" );
		if(bordado.contentEquals("si")) {
		System.out.println("Con escudo: "+area+" cm2:  " +precio+ " €" );
		}
		else {
			
		}
	}

}
