package src.acepta_el_reto;

import java.util.Scanner;

public class san_fermines {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vel_max;
		int vel=0;
		int bucle;
		
		while(scanner.hasNext()) {
			vel_max=0;
			bucle = scanner.nextInt();

			if(bucle >= 1){

				for(int i=0; i<bucle; i++){

					vel = scanner.nextInt();
					
					if(vel > vel_max){
						vel_max = vel;
					}

				}
				 	
				System.out.println(vel_max);
			
			}
		}
	}
}
