package src.boletin3_1;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int num_c = 0;
		int primero = 0;
		int segundo = 0;
		int tercero = 0;
		
		System.out.println("Introduza valor de N de tres cifras: ");
		do {
			num = scanner.nextInt();
		} 
		while (num>999 && num<100); {	
		}
		
		num_c = num;
		tercero = num_c%10;
		num_c = num_c/10;
		segundo = num_c%10;
		num_c = num_c/10;
		primero = num_c%10;
		
		
		System.out.println("Primera cifra de " + num + " -> " + primero);
		System.out.println("Segunda cifra de " + num + " -> " + segundo);
		System.out.println("Tercera cifra de " + num + " -> " + tercero);
	}

}
