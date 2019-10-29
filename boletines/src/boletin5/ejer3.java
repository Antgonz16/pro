package src.boletin5;

import java.util.Random;
import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int x;
		int inicio = 0;
		int acaba = 0;
		int suma=0;
		System.out.println("Introduzca tamaño array:");
		x = scanner.nextInt();
		int[]v=new int[x];
		System.out.println("Introduzca limites inferior y superior para generar numeros aleatorios: :");
		while (scanner.hasNext()) {
			inicio=scanner.nextInt();
			acaba = scanner.nextInt();
			for (int i = 0; i < v.length; i++) {
				v[i]=(int)(random.nextDouble()*acaba+inicio);
				System.out.print("["+v[i]+"] ");
			}
			for (int i = 0; i < v.length; i++) {
				suma=v[i]+suma;
			}
			System.out.println(suma);
		}
		
		
		
	}

}
