package src.boletin3_1;
import java.util.Scanner;
public class ejer5 {

	public static void main(String[] args) {
		//Calcula la nota necesaria para la media que quieres
		Scanner scanner = new Scanner(System.in);
		double nota1 = 0.0;
		double nota2 = 0.0;
		double media = 0.0;
		
		//Lectura de datos
		System.out.println("Introduce la nota del primer examen: ");
		nota1 = scanner.nextDouble();
		System.out.println("Que nota quieres sacar en el trimestre?");
		media = scanner.nextDouble();
		
		//Calculo de los datos
		nota2 = (media - (nota1*0.4))/0.6;
		nota2 = Math.rint(nota2*100)/100;
		
		//Escritura de datos
		System.out.println("Para tener un "+media+" en el trimestre necesitas sacar un "+nota2+"en el segundo examen");
	}
}
