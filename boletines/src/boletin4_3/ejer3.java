package src.boletin4_3;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		int codigo_caja=6969;
		int codigo_prueba;
		
		System.out.println("Tengo una caja fuerte con una condicion de 4 numeros de 0 a 9, ¿prueba suerte?. Tienes 4 oportunidades betch");
		
		for (int i = 0; i < 4; i++) {
			codigo_prueba=scanner.nextInt();
			if (codigo_caja==codigo_prueba) {
				System.out.println("Puercoooo, no me robes");
			}
			else {
				System.out.println("Vaya no eres muy listo");
			}
		}
	}

}
