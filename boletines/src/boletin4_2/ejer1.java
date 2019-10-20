/******************************************************************\
 * Author: Javier Ros Roig 1ºDAM IES Serpis
 * 
 * Descripcion: Juego de piedra papel tijeras con una sola partida
 * 
 * Fecha: 18-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_2;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		String usuario;
		String maquina = null;
		int num_rand;
		
		//Elije piedra papel o tijeras
		num_rand = (int) (Math.random()*3)+1;//Crea un numero aleatorio del 1 al 3
		switch (num_rand) {
		case 1:
			maquina = "piedra";
			break;

		case 2:
			maquina = "papel";
			break;
		case 3:
			maquina = "tijeras";
			break;
		}
		
		//Entrada de la eleccion del usuario
		System.out.println("Vamos a jugar a piedra, papel o tijeras.\n1\n2\n3");
		usuario = scanner.nextLine();
		usuario = usuario.toLowerCase();//Pasa a minuscula
		
		//Comprueba el resultado final y lo muestra
		if(usuario.contentEquals("piedra") == false && usuario.contentEquals("tijeras") == false && usuario.contentEquals("papel") == false ) {
			System.out.println("Lo que has introducido no es una opcion");
		}
		else {
			System.out.println("Eleji "+maquina);
			if (maquina.contentEquals(usuario)) {
				System.out.println("Vaya empatamos");
			}
			else if ((maquina.contains("piedra") && usuario.contains("papel")) || (maquina.contains("tijeras") && usuario.contains("piedra")) || (maquina.contains("papel") && usuario.contains("tijeras"))) {
				System.out.println("Vaya ganaste");
			}
			else {
				System.out.println("Vaya gane");
			}
				
		}
		

	}

}
