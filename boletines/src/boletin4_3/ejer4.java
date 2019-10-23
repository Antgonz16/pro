package src.boletin4_3;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		double media, nota1;
		double nota2=0;
		int contador=0;
		
		System.out.println("Dame notas para una media");
		nota1=scanner.nextDouble();
		while (nota1>0) {
			nota2 = nota1+ nota2;
			nota1=scanner.nextDouble();
			contador++;
		}
		media = nota2/contador;
		System.out.println("Tu media es "+media);
	}

}
