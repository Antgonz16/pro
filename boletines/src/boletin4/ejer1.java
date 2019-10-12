package src.boletin4;
import java.util.Scanner;
public class ejer1 {

	public static void main(String[] args) {
		//Cuestionario sobre si tu pareja es infiel
		Scanner scanner = new Scanner(System.in);
		String respuesta = null;
		int puntuacion = 0;
		
		//Lectura de datos
		System.out.println("Dame una respuesta de si o no");
		for (int i = 1; i <= 10; i++) {
			switch (i) {
			case 1:
				System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
				respuesta = scanner.nextLine();	
				break;
			case 2:
				System.out.println("2. Ha aumentado sus gastos de vestuario");
				respuesta = scanner.nextLine();
				break;
			case 3:
				System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
				respuesta = scanner.nextLine();
				break;
			case 4:
				System.out.println("4. Ahora se asea con más frecuencia.");
				respuesta = scanner.nextLine();
				break;
			case 5:
				System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
				respuesta = scanner.nextLine();
				break;	
			case 6:
				System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
				respuesta = scanner.nextLine();
				break;
			case 7:
				System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
				respuesta = scanner.nextLine();
				break;
			case 8:
				System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
				respuesta = scanner.nextLine();
				break;
			case 9:
				System.out.println("9. Has notado que últimamente se perfuma más.");
				respuesta = scanner.nextLine();
				break;
			case 10:
				System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
				respuesta = scanner.nextLine();
				break;
			}
			while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false){
				System.out.println("Tienes que darme una respuesta de si/no");
				respuesta = scanner.nextLine();
			}
			if (respuesta.contentEquals("si")){
				puntuacion += 3;
			}
		}
		
		//Escritura de datos
		if(puntuacion >= 0 && puntuacion <=10) {
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		}
		else if(puntuacion >= 11 && puntuacion <22) {
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
		}
		else if(puntuacion >= 22 && puntuacion <=30) {
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}
	}
}
