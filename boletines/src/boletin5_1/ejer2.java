/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Menu de opciones cadenas
 * 
 * Fecha: 30-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin5_1;

import java.util.Scanner;


public class ejer2 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		String usuario, usuario2;
		int opcion;
		int num1, num2;
		
		//Menu
		System.out.println("Dame la cadena");
		usuario = scanner.nextLine();
		do {
			System.out.println("1.- Longitud de una cadena\n" + 
					"2.- Comparación de dos cadenas\n" + 
					"3.- Concatenación de dos cadenas\n" + 
					"4.- Obtener subcadenas\n" + 
					"5.- Invertir cadenas\n" + 
					"6.- Es palíndromo\n" + 
					"9.- Salir");
			System.out.println("Dame una opcion del menu: ");
			opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1:
				opcion1(usuario);
				break;
			case 2:
				scanner.nextLine();
				System.out.println("Dame la segunda cadena");
				usuario2 = scanner.nextLine();
				opcion2(usuario,usuario2);
				break;
			case 3:
				scanner.nextLine();
				System.out.println("Dame la segunda cadena");
				usuario2 = scanner.nextLine();
				opcion3(usuario,usuario2);
				break;
			case 4:
				System.out.println("Dime la primera posicion");
				num1 = scanner.nextInt();
				System.out.println("Dime la ultima posicion");
				num2 = scanner.nextInt();
				opcion4(usuario, num1, num2);
				break;
			case 5:
				opcion5(usuario);
				break;
			case 6:
				opcion6(usuario);
				break;
			case 9:
				break;
			default:
				System.out.println("Esa opcion no es correcta");
				break;
			}
		} while (opcion !=9);
		System.out.println("Programa finalizado");
	}
	public static void opcion1(String usuario) {
		//Tamaño cadena
		System.out.println("Tamaño de la cadena: " + usuario.length() + " caracteres");
	}
	public static void opcion2(String usuario, String usuario2) {
		//Compara cadenas
		int i = usuario.compareTo(usuario2);
		if (i>0) {
			System.out.println("La primera es mayor");
		}
		else if (i<0) {
			System.out.println("La segunda es mayor");
		}
	}
	public static void opcion3(String usuario, String usuario2) {
		//Concatena cadenas
		System.out.println(usuario+usuario2);
	}
	public static void opcion4(String usuario, int num1, int num2) {
		//Muestra cadena entre limites
		String sub = usuario.substring(num1, num2);
		System.out.println(sub);
		
	}
	public static void opcion5(String usuario) {
		//Iniverte cadena
		String usuarioInvertida = "";
		for (int x=usuario.length()-1;x>=0;x--)
			usuarioInvertida = usuarioInvertida + usuario.charAt(x);
		System.out.println(usuarioInvertida);
	}
	public static void opcion6(String usuario) {
		//Comprueba palindromos
	    int inc = 0;
	    int des = usuario.length()-1;
	    boolean palindromo = false;
	    while ((inc<des) && (!palindromo)){
	        
	    	if (usuario.charAt(inc)==usuario.charAt(des)){				
	    		inc++;
	    		des--;
	    	} else {
	    		palindromo = true;
	    	}
	    }
	    if (!palindromo)
	    	System.out.println(usuario + " es un PALINDROMO");
	    else
	    	System.out.println(usuario + " NO es un palindromo");
	}

}
