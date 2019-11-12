package src.boletin5_4;

import java.util.*;

public class ejer2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int filas,columna;
		int [][]matriz;
		do {
			System.out.println("Dame la fila de una matriz cuadrada:");
			filas= scanner.nextInt();
			System.out.println("Dame la columna de una matriz cuadrada:");
			columna= scanner.nextInt();
		} while (filas!=columna);
		matriz=creacion_matriz(filas, columna);
		cuadrado_magico(matriz);
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
	public static void cuadrado_magico(int[][]m) {
		int suma=0;
		int suma_compar;
		for (int i = 0; i < m.length; i++) {
			suma_compar=suma;
			suma=0;
			for (int j = 0; j < m[0].length; j++) {
					suma+=m[i][j];
			}
			if (i>0&&suma!=suma_compar) {
				System.out.println("No es un cuadrado magico");
				System.exit(0);	
			}
		}
		for (int j = 0; j < m.length; j++) {
			suma_compar=suma;
			suma=0;
			for (int i = 0; i < m[0].length; i++) {
					suma+=m[i][j];
			}
			if (j>0&&suma!=suma_compar) {
				System.out.println("No es un cuadrado magico");
				System.exit(0);	
			}
		}
		suma_compar=suma;
		suma=0;
		for (int i = 0; i < m.length; i++) {
			for (int j = i; j <= i; j++) {
				suma+=m[i][j];
			}
		}
		if (suma!=suma_compar) {
			System.out.println("No es un cuadrado magico");
			System.exit(0);	
		}
		suma_compar=suma;
		suma=0;
		for (int i = 0; i < m.length; i++) {
			for (int j = m.length; j >= 0; j--) {
				if((j+i)==m.length-1) {
					suma=suma+m[i][j];
				}
			}
		}
		if (suma!=suma_compar) {
			System.out.println("No es un cuadrado magico");
			System.exit(0);	
		}
		
	}
}
