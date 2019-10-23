/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Calcula cantidad de numeros positivos y negativos 
 * 
 * Fecha: 23-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_3;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int num;
		int contador_positivos=0;
		int contador_negativos=0;
		
		//Lectura de datos
		System.out.println("Dame una lista de diez numeros y calculare cuantos son positivos y cuantos negativos");
		for (int i = 0; i < 9; i++) {
			num=scanner.nextInt();
			if(num>0) {
				contador_positivos++;
			}
			else if(num<0){
				contador_negativos++;
			}
		}
		
		//Escritura de datos
		System.out.println("He contado " +contador_positivos+ " numeros positivos y " +contador_negativos+ " negativos");
	}

}
