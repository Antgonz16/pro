package src.boletin4;
import java.util.Scanner;
public class ejer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String respuesta;
		int puntuacion = 0;
		
		System.out.println("Dame una respuesta de si o no");
		do {
			System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("2. Ha aumentado sus gastos de vestuario");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("4. Ahora se asea con más frecuencia.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("9. Has notado que últimamente se perfuma más.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
		do {
			System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
			respuesta = scanner.nextLine();
			if (respuesta.contentEquals("si"))
			{
				puntuacion += 3;
			}
		}
		while(respuesta.contentEquals("si")== false && respuesta.contentEquals("no")== false); {
		}
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
