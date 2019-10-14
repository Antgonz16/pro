package src.boletin3;
import java.util.Scanner;
public class ejer3 {

	public static void main(String[] args) {
		//Calcula una equacion de segundo grado
		Scanner scanner = new Scanner(System.in);
		int a = 0;//Numero 1
		int b = 0;//Numero 2
		int c = 0;//Numero 3
		double x1 = 0.0;//Resultado 1
		double x2 = 0.0;//Resultado 2
		double raiz = 0;//Raiz de dentro de la formula de la equacion de segundo grado
		
		//Lectura de datos
		System.out.println("Dame tres numeros \na: ");
		a=scanner.nextInt();
		System.out.println("\nb: ");
		b=scanner.nextInt();
		System.out.println("\nc: ");
		c=scanner.nextInt();
		
		//Calculo de resultados
		raiz = ((Math.pow(b, 2)) - (4*a*c));
		if (raiz >= 0) {
			x1 = (-b + Math.sqrt(raiz))/(2*a);
			x2 = (-b - Math.sqrt(raiz))/(2*a);
		//Muestra los dos resutados
			System.out.println("\nLos resltados son : " +x1+ " y "+x2);
		}
		else {
			System.out.println("La raiz no es positiva asi que no puedo calcularlo");//La raiz negativa no se puede calcularr
		}
		
	}

}
