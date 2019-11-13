/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Comprobacion de si esta bien una contraseña
 * 
 * Fecha: 13-11-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin5_5;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Declaracion de variables
		String contrasenya;
		boolean contrasenya_correcta=false;
		boolean arroba=false;
		int minusculas,mayusculas,numeros,tamanyo,contador;
		
		//Informe de errores
		System.out.println("El password ha de tener las siguientes restricciones: "+ 
				"1- Ha de tener, al menos, 8 caracteres.\n" + 
				"2- Al menos la mitad del password ha de estar en minúsculas.\n" + 
				"3- El password ha de tener, al menos, 2 mayúsculas.\n" + 
				"4- El password ha de tener, al menos, 3 números.\n" + 
				"5- El password NO ha de incluir el carácter ‘@’.\n");
		
		do {
			minusculas=0;
			mayusculas=0;
			numeros=0;
			contador=0;
			arroba=false;
			//Lectura de datos
			System.out.println("------------------");
			System.out.print("Introduzca su password: ");
			contrasenya=scanner.nextLine();
			tamanyo=contrasenya.length();
			
			//Busqueda de numero de minusculas
			for (int i = 0; i < tamanyo; i++) {
				if (Character.isLowerCase(contrasenya.charAt(i))) {
					minusculas++;
				}
			}
			//Busqueda de numero de mayusculas
			for (int i = 0; i < tamanyo; i++) {
				if (Character.isUpperCase(contrasenya.charAt(i))) {
					mayusculas++;
				}
			}
			//Busqueda de numero de numeros
			for (int i = 0; i < tamanyo; i++) {
				if (Character.isDigit(contrasenya.charAt(i))) {
					numeros++;
				}
			}
			//Busqueda de @
			for (int i = 0; i < tamanyo; i++) {
				if (contrasenya.charAt(i)=='@') {
					arroba=true;
				}
			}
			//Errores
			if (tamanyo<8) {
				System.out.println("El tamaño del pasword ha de ser de, al menos 8, el tuyo es de "+tamanyo);
				
				contador++;
			}
			if (minusculas<(tamanyo/2)) {
				System.out.println("La mitad del password no está en minusculas. Deberia contener "+tamanyo/2+" y solo contiene "+minusculas);
				contador++;
			}
			if (mayusculas<2) {
				System.out.println("Debem existir, al menos, 2 mayuscuñas y solo tienes "+mayusculas);
				contador++;
			}
			if (numeros<3) {
				System.out.println("Deben existir, al menos, 3 números y solo tienes "+numeros);
				contador++;
			}
			if (arroba) {
				System.out.println("El password no puede contener el carácter '@'" );
				contador++;
			}
			if (contador==0) {
				contrasenya_correcta=true;
			}
		} while (contrasenya_correcta==false);
		//Contraseña correcta
		System.out.println("El password cumple todas las restricciones. Enhorabuena!");
	}

}
