package src.acepta_el_reto;

import java.util.Scanner;

public class entrando_al_cine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int casos,num_personas,butaca;
		int contador_par =0;
		String respuesta = null ;
		int contador_impar =0;
		
		casos = scanner.nextInt();
		while (scanner.hasNext()) {
			for (int i = 0; i < casos; i++) {
				num_personas = scanner.nextInt();
				for (int j = 0; j < num_personas; j++) {					
						butaca=scanner.nextInt();
						if(butaca%2==0) {
							contador_par++;
							if (contador_impar>=1) {
								respuesta ="NO";
							}
							else {
								respuesta="SI";
							}
						}
						else {
							contador_impar++;
						}			
				}
				if (respuesta.contains("NO")==true) {
					System.out.println(respuesta);
				}
				else {
					System.out.println(respuesta+ " " +contador_par);
				}	
				contador_impar = 0;
				contador_par = 0;
			}
		}
	}

}
