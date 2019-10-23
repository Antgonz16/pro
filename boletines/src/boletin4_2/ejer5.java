/******************************************************************\
 * Author: Javier Ros Roig 1ºDAM IES Serpis
 * 
 * Descripcion: Calcula el factorial
 * 
 * Fecha: 18-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_2;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int n, a;
		
		//Lectura de datos
		System.out.println("Ingres un numero y hallare su factortial");
		n = scanner.nextInt();
		
		//Calculo de resultados
		if (n==0) {
			System.out.println("1");
		}
		else {
			a=n-1;
			while (a>1) {
				n=n*a;
				a--;
			}
			//Escritura de datos
			System.out.println(n);
		}
		

	}

}
