package src.boletin4_2;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int n, a;
		
		System.out.println("Ingres un numero y hallare su factortial");
		n = scanner.nextInt();
		
		if (n==0) {
			System.out.println("1");
		}
		else {
			a=n-1;
			while (a>1) {
				n=n*a;
				a--;
			}
			System.out.println(n);
		}
		

	}

}
