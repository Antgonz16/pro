/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Calcula la media de unas notas 
 * 
 * Fecha: 23-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_3;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		double media, nota1;
		double nota2=0;
		int contador=0;
		
		//Lectura de datos
		System.out.println("Dame notas para una media");
		nota1=scanner.nextDouble();
		while (nota1>0) {
			nota2 = nota1+ nota2;
			nota1=scanner.nextDouble();
			contador++;
		}
		
		//Calculo de resultados
		media = nota2/contador;
		
		//Escritura de datos
		System.out.println("Tu media es "+media);
	}

}
