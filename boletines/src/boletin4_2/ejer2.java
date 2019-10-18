/******************************************************************\
 * Author: Javier Ros Roig 1ºDAM IES Serpis
 * 
 * Descripcion: Calcula los pares enteros tal que 1<= i <= n y 1<= j <= n
 * 
 * Fecha: 18-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_2;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int num;
		int i;
		int j;
		int contador = 0;
		int resultado;
		
		//Lectura de datos
		System.out.println("Dame un numero y te calculare los pares enteros tal que 1<= i <= n y 1<= j <= n");
		num = scanner.nextInt();
		
		//Calculo de resultados
		for (i = 1;  i <= num; i++) {
			contador ++;
			for (j = contador;  j <= num; j++) {
				resultado = i + j + 2 * i *j;
				//Escritura de datos
				System.out.println("Par "+i+","+j+": "+i+"+"+j+"2*"+i+"*"+j+" vale "+resultado );
			}
		}
	}

}
