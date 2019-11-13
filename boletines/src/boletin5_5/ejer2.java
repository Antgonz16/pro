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

import java.util.*;

public class ejer2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Declaracion de variables
		int[][]matriz;
		int rang1,rang2, x,y;
		String numero;
		//Lectura de datos
		System.out.println("Introduzca num de filas de la matriz:");
		x=scanner.nextInt();
		System.out.println("Introduzca num de columnas de la matriz:");
		y=scanner.nextInt();
		System.out.println("Introduzca num inferior del rango:");
		rang1=scanner.nextInt();
		System.out.println("Introduzca num superior del rango:");
		rang2=scanner.nextInt();
		
		//Creacion matriz
		matriz=creacion_matriz(x,y,rang1,rang2);
		
		//Escritura matriz
		escritura_matriz(matriz);
		
		//Busqueda numero
		do {
			System.out.println("¿Que numero quieres buscar en la matriz?");
			scanner.hasNext();
			numero=scanner.next();
			if (numero.contentEquals("salir")==false) {
				busqueda_numero(matriz,numero,rang1,rang2);
			}
		} while (numero.contentEquals("salir")==false);
		
		//Finalizacion
		System.out.println("Gracias por utilizar el programa de la matriz");
		
	}
	public static int[][] creacion_matriz(int x, int y,int rang1,int rang2){
		//Creacion matriz
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[][] matriz= new int [x][y];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				
				matriz[i][j]=(random.nextInt((rang2 - rang1) + 1) + rang1);
			}
		}
		return matriz;
	}
	public static void escritura_matriz(int[][] matriz) {
		//Escritura matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public static void busqueda_numero(int[][] matriz,String numero,int rang1,int rang2) {
		//Busqueda numero
		int num,contador=0;
		num = Integer.parseInt(numero);
		if ((num>=rang1)&&(num<=rang2)) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					if (matriz[i][j]==num) {
						contador++;
					}
				}
			}
			if (contador>0) {
				System.out.println("El valor "+num+" esta en la matriz y aparece "+contador+" veces:");
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[0].length; j++) {
						if (matriz[i][j]==num) {
							System.out.println("Lo encuentro en la posicion ["+i+","+j+"]");
						}
					}
				}
			}
			else if(contador==0){
				System.out.println("El valor "+num+" no esta en la matriz");
			}
		}
		else {
			System.out.println("El valor "+num+" esta fuera de rango ["+rang1+","+rang2+"]");
		}
		
	}
		
}
