/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Calcula una lista de numero con paso de 7
 * 
 * Fecha: 23-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_3;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int num1, num2, contador;
		
		//Lectura de datos
		System.out.println("Voy a calcular una lista con paso de 7 en 7 enrte dos numeros que me des:/nNumero 1:");
		num1 = scanner.nextInt();
		System.out.println("Numero 2:");
		num2 = scanner.nextInt();
		
		//Escritura de datos
		for (contador=num1; contador <= num2; contador=contador+7) {
			System.out.println(contador);
		}

	}

}
