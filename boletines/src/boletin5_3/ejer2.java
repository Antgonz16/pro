/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Comprobacion de si esta bien un email
 * 
 * Fecha: 6-11-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin5_3;

import java.util.*;

public class ejer2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Declaracion de variables
		String email;
		int arroba,identificador1,detras_arroba,identificador2;
		
		//Lectura de datos
		System.out.println("Introduce tu email:");
		email = scanner.nextLine();
		email= email+" ";
		System.out.println(email);
		//Busqueda del @
		arroba = email.indexOf("@");
		
		//Escritura de resultados
		if(arroba==-1) {
			System.out.println("ERROR 1: No existe un @");
		}
		else if (arroba==0) {
			System.out.println("ERROR 2: La direcion empieza por un @");
		}
		else {
			//Separacion de la cadena por el @
			String[]separada_arroba=email.split("@");
			identificador1=separada_arroba[0].length();
			//Busqueda del punto
			detras_arroba= separada_arroba[1].indexOf(".");
			if (identificador1<4) {
				System.out.println("ERROR 3: El identificador1 no llega a 4 caracteres");
			}
			else if (detras_arroba==-1) {
				System.out.println("ERROR 4: Despues de la @ no hay punto");
			}
			else {
				//Separacion de la 2 cadena separada por el @ ahora por el punto
				String[]separada_punto=separada_arroba[1].split("\\.");
				identificador2=separada_punto[0].length();	
				if (identificador2<3) {
					System.out.println("ERROR 5: El identificador2 no llega a 3 caracteres");
				}
				else if (separada_punto[1].contentEquals("com ")==false&&separada_punto[1].contentEquals("org ")==false&&separada_punto[1].contentEquals("es ")==false&&separada_punto[1].contentEquals("gov ")==false) {
					System.out.println("ERROR 6: Dominio distinto a .com .es .org .gov");
				}
				else {
					System.out.println("Enhorabuena! E-mail correcto!");
				}
			}		
		}
	}

}
