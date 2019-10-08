package src.boletin3;
import java.util.Scanner;
public class ejer1 {

	public static void main(String[] args) {
		//Calcula la nota media de un alumno introduciendo sus notas por teclado
		Scanner scanner = new Scanner(System.in);
		int num_alu = 0; //Numero del alumno en clase
		String alu; //Nombre completo del alumno
		//Notas alumno
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		int media = 0;
		
		//Lectura de datos
		System.out.println("Introduce numero de estudiante: ");
		num_alu = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Introduce nombre del alumno: ");
		alu = scanner.nextLine();
		System.out.println("Introduzca nota 1: ");
		nota1 = scanner.nextInt();
		System.out.println("Introduzca nota 2: ");
		nota2 = scanner.nextInt();
		System.out.println("Introduzca nota 3: ");
		nota3 = scanner.nextInt();
		media = ((nota1 + nota2 + nota3)/3);
		
		//Escritura de datos
		System.out.println("Alumno" + num_alu + " - " + alu + "\tex.1  \tex.2  \tex.3  media");
		System.out.println("Notas 1era evaluacion: \t" + nota1 + "\t" + nota2 + "\t" + nota3 + "\t" + media);
		
	}

}
