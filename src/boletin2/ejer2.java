package boletin2;
import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double equivalencia = 1024.0; //equivalencia entre bytes el resto
		double b = 0.0; //byte
		double kb = 0.0; //kilobyte
		double mb = 0.0; //meabytes
		double gb = 0.0; //megabyte
		double tb = 0.0; //terabyte
		System.out.print("Dame un valor de MB y te calculo sus equivalentes de KB, GB y TB: ");
		mb = scanner.nextDouble();
		
		//Calcula las equivalencias
		kb = mb / equivalencia;
		b = kb / equivalencia;
		gb = mb * equivalencia;
		tb = gb * equivalencia;
		
		//Muestra por pantalla las equivalencias
		System.out.print("\t BYTE    KILOBYTE   MEGABYTE    GIGABYTE   TERABYTE");
		System.out.print("\n-----------------------------------------------------------");
		System.out.print("\n"+b+ "  " + kb+ "  " + mb + "  " + gb + "  " + tb);
		System.out.print("\n-----------------------------------------------------------");

	}

}
