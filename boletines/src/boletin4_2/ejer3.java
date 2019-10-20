package src.boletin4_2;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int b;
		int n;
		int r = 1;
		int i = 0;
		
		System.out.println("Dame la base de una potencia");
		b = scanner.nextInt();
		System.out.println("Dame el exponente de una potencia");
		n = scanner.nextInt();
		
		while (i < n) {
			r = r * b;
			i++;
		}
		
		System.out.println("El resultado es:");
		System.out.println(r);

	}

}
