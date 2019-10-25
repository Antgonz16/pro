package src.acepta_el_reto;

import java.util.Scanner;

public class san_fermines {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String toros;
		int vel_max=0;
		String velocidad;
		int vel;
		int i ;
		int bucle;
	
		toros = scanner.next();
		bucle = Integer.parseInt (toros);
		if(bucle>=1) {
			for (i = 0; i < bucle; i++) {
				velocidad= scanner.next();
				vel = Integer.parseInt (velocidad);
				if(vel>=0) {
					if (vel>vel_max) {
						vel_max=vel;
					}
				}
			}
			System.out.print(vel_max);
		}
	}
}
