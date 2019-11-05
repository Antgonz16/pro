package src.boletin5_2;

import java.util.*;

public class ejer2 {

	public static void main(String[] args) {
		int valorDado1=0;
		int valorDado2=0;
		System.out.println("Vamos a tirar los dados...");
		tirar_dados(valorDado1, valorDado2);
		System.out.println("Al fin han salido iguales!");
	}
	public static void tirar_dados(int x, int y) {
		Random random = new Random();
		do {
			x = random.nextInt(6)+1;
			y = random.nextInt(6)+1;
			System.out.println("Ha salido "+x+" y "+y);
		} while (x!=y);
	}

}
