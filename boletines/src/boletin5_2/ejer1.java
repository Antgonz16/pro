package src.boletin5_2;

import java.util.*;

public class ejer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int filas,columnas;
		
		System.out.println("Dame las filas de una matriz:");
		filas = scanner.nextInt();
		System.out.println("Dame las columnas de una matriz:");
		columnas = scanner.nextInt();
		int[][] matriz;
		matriz=creacion_matriz(filas, columnas);
		lectura_matriz(matriz);
		suma_matriz(matriz);	
	}
	public static int[][] creacion_matriz(int x,int y){
		Scanner scanner = new Scanner(System.in);
		int[][] matriz= new int [x][y];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Posicion["+(i+1)+"]["+(j+1)+"]:");
				(matriz[i][j])=scanner.nextInt();
			}
			System.out.print("\n");
		}
		return matriz;
	}
	public static void lectura_matriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void suma_matriz(int[][] matriz) {
		int suma=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				suma = suma+matriz[i][j];
			}
		}
		System.out.println("La suma es: " +suma);
	}

}
