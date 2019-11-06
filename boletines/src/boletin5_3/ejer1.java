/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Menu de opciones de vectores
 * 
 * Fecha: 6-11-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin5_3;

import java.util.*;

public class ejer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Declaracion de variables
		int opcion, tamanyo;
		int [] vector;
		
		//Lectura de datos
		System.out.println("Dime el tamaño del vector");
		tamanyo = scanner.nextInt();
		vector=new int[tamanyo];
		
		do {
			System.out.println("---------------Pulse una opción del menú---------------\n"+ 
					"1.- Rellenar vector por teclado\n" + 
					"2.- Rellenar vector de forma aleatoria (nums de 1 a 100)\n" + 
					"3.- Modificar una posicion del vector\n" + 
					"4.- Consultar una posicion del vector\n" + 
					"5.- Mostrar todo el vector\n" + 
					"6.- Ordenar ascendentemente el vector\n" +
					"9.- Salir\n"+
					"------------------------------------------------------");
			System.out.println("Dame una opcion del menu: ");
			opcion = scanner.nextInt();
			
			//menu
			switch (opcion) {
			case 1:
				vector= opcion1(tamanyo);
				break;
			case 2:
				vector= opcion2(tamanyo);
				break;
			case 3:
				opcion3(vector,tamanyo);
				break;
			case 4:
				opcion4(vector,tamanyo);
				break;
			case 5:
				opcion5(vector);
				break;
			case 6:
				vector=opcion6(vector);
				break;
			case 9:
				break;
			default:
				System.out.println("Esa opcion no es correcta");
				break;
			}
		} while (opcion!=9);
		//Finalizacion del programa
		System.out.println("Programa finalizado");
	}
	public static int[] opcion1(int tamanyo ) {
		//Introduccion de datos del vector usuario
		Scanner scanner = new Scanner(System.in);
		int []vector= new int [tamanyo];
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduzca valor "+(i+1)+" de "+(vector.length)+":");
			vector[i] = scanner.nextInt();
		}
		return vector;
	}
	public static int[] opcion2(int tamanyo ) {
		//Introduccion de datos del vector random
		Random random = new Random();
		int []vector= new int [tamanyo];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(random.nextDouble()*(100+1));
		}
		return vector;
	}
	public static void opcion3(int [] vector, int tamanyo ) {
		//Modificacion de una posicion
		Scanner scanner = new Scanner(System.in);
		int posicion;
		do {
			System.out.println("Dime la poscion que quieres modificar (1..n):");
			posicion = scanner.nextInt();
		} while (posicion>tamanyo);
		System.out.println("Dime que numero quieres añadir en la posicion"+posicion);
		vector[posicion-1]=scanner.nextInt();
		
	}
	public static void opcion4(int [] vector, int tamanyo ) {
		//Muestra del valor de una posicion
		Scanner scanner = new Scanner(System.in);
		int posicion;
		do {
			System.out.println("Dime la poscion que quieres mostrar (1..n):");
			posicion = scanner.nextInt();
		} while (posicion>tamanyo);
		System.out.println("La posion "+posicion+" es: "+vector[posicion-1]);
		
	}
	public static void opcion5(int [] vector ) {
		//MUestra del vector entero
		for (int i = 0; i < vector.length; i++) {
			
			if (i==0) {
				System.out.print("["+vector[i]+", ");
			}
			else if (i<vector.length-1) {
				System.out.print(vector[i]+", ");
			}
			else {
				System.out.print(+vector[i]+"] \n");
			}
			
		}
	}
	public static int[] opcion6(int [] vector ) {
		//Ordenacion del vector
		Arrays.sort(vector);
		
		return vector;
	}

}
