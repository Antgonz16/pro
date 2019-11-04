package programas;

import java.util.*;

public class laberinto2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y;
		int posicion_i_x;
		int posicion_i_y;
		int posicion_f_x;
		int posicion_f_y;
		int posicion_x;
		int posicion_y;
		

		System.out.println("Dame el tamanyo del laberinto\nX:");
		x=scanner.nextInt();
		System.out.println("\nY:");
		y=scanner.nextInt();
	
		System.out.println("Dame la posicion de inicio\nY:");
		posicion_i_y=scanner.nextInt();
		posicion_i_x=x-1;
		System.out.println("Dame la posicion final\nY:");
		posicion_f_y=scanner.nextInt();
		posicion_f_x=0;

		String [][] contorno=creacion_cuadrado(x, y, posicion_f_x, posicion_f_y, posicion_i_x, posicion_i_y);

		String [][] laberinto=creacion_laberinto(contorno);

		posicion_x=posicion_i_x;
		posicion_y=posicion_i_y-1;
		while (laberinto[posicion_f_x][posicion_f_y-1].contains(" ")) {
			if (laberinto[posicion_x-1][posicion_y]==" ") {
				laberinto[posicion_x][posicion_y]=" ";
				posicion_x--;
				laberinto[posicion_x][posicion_y]="O";
				for (int i = 0; i < laberinto.length; i++) {
					for (int j = 0; j < laberinto[0].length; j++) {
						System.out.print(laberinto[i][j]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
			else if (laberinto[posicion_x][posicion_y-1]==" ") {
				laberinto[posicion_x][posicion_y]=" ";
				posicion_y--;
				laberinto[posicion_x][posicion_y]="O";
				for (int i = 0; i < laberinto.length; i++) {
					for (int j = 0; j < laberinto[0].length; j++) {
						System.out.print(laberinto[i][j]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
			else if (laberinto[posicion_x][posicion_y+1]==" "){
				laberinto[posicion_x][posicion_y]=" ";
				posicion_y++;
				laberinto[posicion_x][posicion_y]="O";
				for (int i = 0; i < laberinto.length; i++) {
					for (int j = 0; j < laberinto[0].length; j++) {
						System.out.print(laberinto[i][j]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
			
			
			
			
		}
		System.out.println("Sali del laberinto");
			

	}
	public static String[][] creacion_cuadrado(int x,int y,int posicion_f_x,int posicion_f_y,int posicion_i_x,int posicion_i_y) {
		String [][] laberinto= new String [x][y];
		
		for (int i = 0; i < laberinto.length; i++) {
			for (int j = 0; j < laberinto[0].length; j++) {
				if(i==0||i==(x-1)||j==0||j==(y-1)){
					laberinto[i][j]="X";
				}
				else{
					laberinto[i][j]=" ";
				}
			}
		}
		for (int i = 0; i < laberinto.length; i++) {
			for (int j = 0; j < laberinto[0].length; j++) {
				laberinto[posicion_f_x][posicion_f_y-1]=" ";
				laberinto[posicion_i_x][posicion_i_y-1]="O";
				System.out.print(laberinto[i][j]);
			}
			System.out.print("\n");
		}
		return laberinto;
	}
	public static String[][] creacion_laberinto(String[][]laberinto){
		Scanner scanner = new Scanner(System.in);
		String salida="no";
		int dibujo_x,dibujo_y;

		System.out.println("Dibuja el laberinto");

		while(salida.contains("si")==false){
			System.out.println("Posicion X:");
			dibujo_x=scanner.nextInt();
			System.out.println("Posicion Y:");
			dibujo_y=scanner.nextInt();
			scanner.nextLine();
			laberinto[dibujo_x-1][dibujo_y-1]="X";
			for (int i = 0; i < laberinto.length; i++) {
				for (int j = 0; j < laberinto[0].length; j++) {
					System.out.print(laberinto[i][j]);
				}
				System.out.print("\n");
			}
			System.out.println("Quieres salir?");
			salida=scanner.nextLine();

		}

		return laberinto;
	}


}

