/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Escribe un 8 con M a partir de una altura
 * 
 * Fecha: 23-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_3;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int altura; //Altura de la x
		int i;//Contador 1
		int j;//Contador 2
		int division;
		
		//Lectura de datos
		System.out.println("Dame la altura del 8 que quieres que dibuje");
		altura = scanner.nextInt();
		division= altura/2;
		//Calculo de resultados
		if(altura%2!=0 && altura>=5)
		{
			for (i = 1; i <= altura ; i++) {
				for (j = 1; j <= 6; j++) {
					//Escritura de datos
					if (i==1||i==division+1||i==altura||j==1||j==6) {
						System.out.print("M");
							
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}
		else {
			System.out.println("El numero no es impar o mayor que 5");
		}
	}
}
