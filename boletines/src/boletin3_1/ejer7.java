package src.boletin3_1;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double velocidad_km = 0.0;
		double velocidad_m = 0.0;
		
		System.out.println("Dame una velocidad en km/h: ");
		velocidad_km = scanner.nextDouble();
		velocidad_m = (velocidad_km*1000)/360;
		System.out.println("La velocidad em m/s: " + velocidad_m);

	}

}
