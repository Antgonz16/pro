package src.boletin3_1;
import java.util.Scanner;
public class ejer3 {

	public static void main(String[] args) { 
		//Calcula la longitud, area y volumen mediante el radio y lo muestra con 3 decimales
		Scanner scanner = new Scanner(System.in);
		double radio = 0.0;
		double longitud = 0.0;
		int longitud1 = 0;
		double area = 0.0;
		double volumen = 0.0;
		final double PI = Math.PI;
		
		//Lectura de datos
		System.out.println("Bienvenido al programa donde sale todo redondo!\n");
		System.out.println("-----------------------------------------------\n");
		System.out.println("Introduzca el valor del radio: ");
		radio = scanner.nextDouble();
		
		//Calculo de los datos
		longitud = 2*radio*PI;
		area = PI*(Math.pow(radio, 2));
		volumen =(4*PI*(Math.pow(radio, 3)))/3;
		longitud = Math.rint(longitud*1000)/1000;
		area = Math.rint(area*1000)/1000;
		volumen = Math.rint(volumen*1000)/1000;
		
		//Escritura de datos
		System.out.println("La longitud de la circunferencia es: "+longitud);
		System.out.println("El area de la circunferia es: "+area);
		System.out.println("si fuera una esfera, su volumen seria: "+volumen);

	}

}
