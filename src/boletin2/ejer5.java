package boletin2;
import java.util.Scanner;
public class ejer5 {

	public static void main(String[] args) {
		//Calcula la factura de una persona
		Scanner scanner = new Scanner(System.in);
		String nom; //Nombre del usuario
		String nif; //DNI del usuario
		String domicilio; //Domicilio del usuario
		double p_descuento = 0.0; //Porcentaje de descuento
		String concepto; //Matame primer aviso
		int cantidad =0;
		double precio=0.0;
		double importe=0.0;
		String concepto1; //Matame segundo aviso
		int cantidad1 =0;
		double precio1 =0.0;
		double importe1 =0.0;
		String concepto2;//Matame tercer aviso
		int cantidad2=0;
		double precio2 =0.0;
		double importe2 =0.0;
		String concepto3;//Matame cuarto aviso
		int cantidad3=0;
		double precio3 =0.0;
		double importe3 =0.0;
		String concepto4;//Matame quinto aviso
		int cantidad4=0;
		double precio4 =0.0;
		double importe4 =0.0;
		
		System.out.println("\nCliente: ");
		nom = scanner.nextLine();
		System.out.println("N.I.F: ");
		nif = scanner.nextLine();
		System.out.println("Domicilio: ");
		domicilio = scanner.nextLine();
		
		System.out.println("Cantidad: ");
		cantidad = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto = scanner.nextLine();
		System.out.println("Precio: ");
		precio = scanner.nextDouble();
		System.out.println("Importe: ");
		importe = scanner.nextDouble();
		
		System.out.println("Cantidad: ");
		cantidad1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto1 = scanner.nextLine();
		System.out.println("Precio: ");
		precio1 = scanner.nextDouble();
		System.out.println("Importe: ");
		importe1 = scanner.nextDouble();
		
		System.out.println("Cantidad: ");
		cantidad2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto2 = scanner.nextLine();
		System.out.println("Precio: ");
		precio2 = scanner.nextDouble();
		System.out.println("Importe: ");
		importe2 = scanner.nextDouble();
		
		System.out.println("Cantidad: ");
		cantidad3 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto3 = scanner.nextLine();
		System.out.println("Precio: ");
		precio3 = scanner.nextDouble();
		System.out.println("Importe: ");
		importe3 = scanner.nextDouble();

		System.out.println("Cantidad: ");
		cantidad4 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto4 = scanner.nextLine();
		System.out.println("Precio: ");
		precio4 = scanner.nextDouble();
		System.out.println("Importe: ");
		importe4 = scanner.nextDouble();
		
		System.out.println("Porcentaje del descuento: ");
		p_descuento  = scanner.nextDouble();
		
		
		
	}

}
