package src.boletin3_1;
import java.util.Scanner;
public class ejer5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1 = 0.0;
		double nota2 = 0.0;
		double media = 0.0;
		
		System.out.println("Introduce la nota del primer examen: ");
		nota1 = scanner.nextDouble();
		System.out.println("Que nota quieres sacar en el trimestre?");
		media = scanner.nextDouble();
		
		nota2 = (media - (nota1*0.4))/0.6;
		nota2 = Math.rint(nota2*100)/100;
		
		
		System.out.println("Para tener un "+media+" en el trimestre necesitas sacar un "+nota2+"en el segundo examen");
	}
}
