package src.boletin2;
import java.util.Scanner;
public class ejer5 {

	public static void main(String[] args) {
		//Calcula la factura de una persona
		Scanner scanner = new Scanner(System.in);
		String nom; //Nombre del usuario
		String nif; //DNI del usuario
		String domicilio; //Domicilio del usuario
		double p_descuento = 0.0; //Porcentaje de descuento
		double total = 0.0;
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
		
		System.out.println("Cantidad: ");
		cantidad1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto1 = scanner.nextLine();
		System.out.println("Precio: ");
		precio1 = scanner.nextDouble();
		
		System.out.println("Cantidad: ");
		cantidad2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto2 = scanner.nextLine();
		System.out.println("Precio: ");
		precio2 = scanner.nextDouble();
		
		System.out.println("Cantidad: ");
		cantidad3 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto3 = scanner.nextLine();
		System.out.println("Precio: ");
		precio3 = scanner.nextDouble();

		System.out.println("Cantidad: ");
		cantidad4 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Concepto: ");
		concepto4 = scanner.nextLine();
		System.out.println("Precio: ");
		precio4 = scanner.nextDouble();
		
		System.out.println("Porcentaje del descuento: ");
		p_descuento  = scanner.nextDouble();
		
		
		
		System.out.println("\n\tCliente: " + nom + "\t N.I.F: " + nif);
		System.out.println("\n\tDomicilio: " + domicilio); 
		System.out.println("\n\tCantidad " +cantidad+ "\tConcepto-Referencia " +concepto+ "\tPrecio " +precio+ "\tImporte " +(importe = precio*cantidad));
		System.out.println("\n\tCantidad " +cantidad1+ "\tConcepto-Referencia " +concepto1+ "\tPrecio " +precio1+ "\tImporte " +(importe1 = precio1*cantidad1));
		System.out.println("\n\tCantidad " +cantidad2+ "\tConcepto-Referencia " +concepto2+ "\tPrecio " +precio2+ "\tImporte " +(importe2 = precio2*cantidad2));
		System.out.println("\n\tCantidad " +cantidad3+ "\tConcepto-Referencia " +concepto3+ "\tPrecio " +precio3+ "\tImporte " +(importe3 = precio3*cantidad3));
		System.out.println("\n\tCantidad " +cantidad4+ "\tConcepto-Referencia " +concepto4+ "\tPrecio " +precio4+ "\tImporte " +(importe4 = precio4*cantidad4));
		total = importe + importe1 + importe2 + importe3 + importe4;
		System.out.println("\n\tTotal bruto " + total + "\tDescuento " + p_descuento + "\tTotal" + (total - (total * (p_descuento/100))));
		
	}
	

}
