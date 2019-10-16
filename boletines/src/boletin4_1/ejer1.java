package src.boletin4_1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1,num2;
		
		
		System.out.println("Dame dos cordenados para el centro de una circunferencia\na:");
		num1= scanner.nextInt();
		System.out.println("b:");
		num2= scanner.nextInt();
		
		if (num1>0 && num2>0) {
			System.out.println("Primer cuadrante");
		}
		else if (num1<0 && num2>0) {
			System.out.println("Segundo cuadrante");
		}		
		else if (num1<0 && num2<0) {
			System.out.println("Tercer cuadrante");
		}
		else if (num1>0 && num2<0) {
			System.out.println("Cuarto cuadrante");
		}
		else if (num1!=0 && num2==0) {
			System.out.println("Eje de abscisas");
		}
		else if (num1==0 && num2!=0) {
			System.out.println("Eje de ordenadas");
		}
		else if (num1==0 && num2==0) {
			System.out.println("Origen de coordenadas");
		}
	}

}
