package src.boletin3;
import java.util.Scanner;
public class ejer3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		double x1 = 0.0;
		double x2 = 0.0;
		double raiz = 0;
		System.out.println("Dame tres numeros \na: ");
		a=scanner.nextInt();
		System.out.println("\nb: ");
		b=scanner.nextInt();
		System.out.println("\nc: ");
		c=scanner.nextInt();
		raiz = ((Math.pow(b, 2)) - (4*a*c));
		if (raiz >= 0) {
			x1 = (-b + Math.sqrt(raiz))/(2*a);
			x2 = (-b - Math.sqrt(raiz))/(2*a);
			System.out.println("\nLos resltados son : " +x1+ " y "+x2);
		}
		else {
			System.out.println("La raiz no es positiva asi que no puedo calcularlo");
		}
		
	}

}
