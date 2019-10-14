package src.boletin3;
import java.util.Scanner;
public class ejer2 {

	public static void main(String[] args) {
		//Pide datos y muestra una ficha
		Scanner scanner = new Scanner(System.in);
		String nom;
		String nif;
		String direccion;
		double salario_bruto;
		double retencion;
		int dia;
		int mes;
		int anyo;
		
		//Lectura de datos
		System.out.println("Introduce fecha de nacimiento en formato AAAA MM DD: ");
		anyo = scanner.nextInt();
		mes = scanner.nextInt();
		dia = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Introduce NIF: ");
		nif = scanner.nextLine();
		System.out.println("Introduce nombre: ");
		nom = scanner.nextLine();
		System.out.println("Introduce direccion: ");
		direccion = scanner.nextLine();
		System.out.println("Introduce salario: ");
		salario_bruto = scanner.nextInt();
		System.out.println("Introduce retencion: ");
		retencion = scanner.nextInt();
		
		//Escritura de datos
		System.out.println("\n\tINFORME DEL TRABAJADOR");
		System.out.println("\n\t-------------------------------------------------------");
		System.out.println("\n\tNombre.............: " + nom);
		System.out.println("\n\tDireccion.............: " +  direccion);
		System.out.println("\n\n\tNIF.............: " + nif);
		System.out.println("\n\tFecha de nacimiento.............: " +  dia + " del mes " + mes + " del año " + anyo);
		System.out.println("\n\n\tSalario bruto.............: " + salario_bruto);
		System.out.println("\n\tRetencion.............: " + retencion + "%");
		System.out.println("\n\tSalario neto.............: " + (salario_bruto -(retencion /100)));
		System.out.println("\n\t-------------------------------------------------------");
	}

}
