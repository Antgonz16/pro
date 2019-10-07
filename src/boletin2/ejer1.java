package boletin2;
import java.util.Scanner;
public class ejer1 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int suma = 0, resta = 0, multi = 0, div = 0;
		System.out.println("Introduce x:\n");
		int num1 = scanner.nextInt();
		scanner.hasNextLine();
		System.out.println("Introduce y:\n");
		int num2 = scanner.nextInt();
		
		
		while (num2 == 0) {
			System.out.println("Introduce y distinto de 0:\n");
			num2 = scanner.nextInt();
			scanner.hasNextLine();
			
		}
		
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
			
		System.out.print("Los valores introducidos son: " + num1 + " y " + num2);
		System.out.print("\n           SUMA    RESTA   PRODUCTO    COCIENTE");
		System.out.print("\n------------------------------------------------");
		System.out.print("\n  x=" + num1 + " y=" + num2 + "      " + suma + "       " + resta + "        " + multi + "         " + div);
		System.out.print("\n------------------------------------------------");
	}

}
