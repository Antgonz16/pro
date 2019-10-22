/******************************************************************\
 * Author: Javier Ros Roig 1ºDAM IES Serpis
 * 
 * Descripcion: Escribe una x en funcion de la altura que introduzcas
 * 
 * Fecha: 22-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_2;

import java.util.Scanner;

public class ejer6 {
	
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int altura; //Altura de la x
		int i;//Contador 1
		int j;//Contador 2
		
		//Lectura de datos
		System.out.println("Dame la altura de la X que quieres que dibuje");
		altura = scanner.nextInt();
		
		//Calculo de resultados
		if(altura%2!=0)
		{
			for (i = 1; i <= altura ; i++) {
				for (j = 1; j <= altura; j++) {
					//Escritura de datos
					if ((i==j)||((i+j) ==(altura+1))) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}
		else {
			System.out.println("El numero no es impar");
		}
	}
}
