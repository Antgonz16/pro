/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Calcula precios de una autoescula
 * 
 * Fecha: 23-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_3;

import java.util.Scanner;

public class ejer1 {
	
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		String carnet;
		int practica;
		
		//Lectura de datos
		System.out.println("Dime que clase de que carnet quieres saber la informacion");
		carnet=scanner.nextLine();
		carnet=carnet.toLowerCase();
		System.out.println("Dime la cantidad de practicas");
		practica = scanner.nextInt();
		
		//Escritura de datos
		switch (carnet) {
		case "a":
			System.out.println("Precio de la matricula 150 euros");	
			System.out.println("El precio de las practicas es "+(practica*15)+" euros");
			break;
		case "b":
			System.out.println("Precio de la matricula 325 euros");	
			System.out.println("El precio de las practicas es "+(practica*21)+" euros");
			break;
		case "c":
			System.out.println("Precio de la matricula 520 euros");	
			System.out.println("El precio de las practicas es "+(practica*36)+" euros");
			break;
		case "d":
			System.out.println("Precio de la matricula 610 euros");	
			System.out.println("El precio de las practicas es "+(practica*50)+" euros");
			break;
		default:
			System.out.println("La opcion no es valida");
			break;
		}
	}

}
