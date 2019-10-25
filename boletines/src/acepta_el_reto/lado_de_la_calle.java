package src.acepta_el_reto;

import java.util.Scanner;

public class lado_de_la_calle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		do {
			num = scanner.nextInt();
			if (num%2==0&&num!=0) {
				System.out.println("DERECHA");
			}
			else if (num%2!=0) {
				System.out.println("IZQUIERDA");
			}
		} while (num!=0);
	

	}

}
