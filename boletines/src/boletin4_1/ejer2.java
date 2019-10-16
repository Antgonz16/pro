package src.boletin4_1;

import java.util.Scanner;

public class ejer2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Dame dos numero y te dire si su producto es positivo o negativo\nNumero 1:");
		num1= scanner.nextInt();
		System.out.println("Numero 2:");
		num2= scanner.nextInt();
		
		if((num1>=0 && num2>=0)||(num1<=0 && num2<=0)) {
			System.out.println("El producto es positivo o nulo");
		}
		else if ((num1<0 && num2>0) ||(num1>0 && num2<0)) {
			System.out.println("El producto es negativo");
		}
	}
	
}
