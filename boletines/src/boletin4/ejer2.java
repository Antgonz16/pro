package src.boletin4;
import java.util.Scanner;
public class ejer2 {
	
	public static void main(String[] args) {
		//Programa que te saca tu salario segun tu puesto
		Scanner scanner = new Scanner(System.in);
		int puesto = 0;
		double dias_viaje = 0.0;
		int estado_civil = 0;
		double sueldo_base = 0.0;
		double retencion = 0.0;
		double dietas = 0.0;
		double sueldo_bruto = 0.0;
		double sueldo_retencion = 0.0;
		double sueldo_neto = 0.0;
		
		//Lectura de datos
		System.out.println("1 - Progrador junior \n2 - Programador senior \n3 - Jefe de proyecto");
		System.out.println("Introduce el cargo del empleado (1 - 3): ");
		puesto = scanner.nextInt();
		while (puesto > 3) {
			System.out.println("Ha de ser un numero del 1 al 3");
			System.out.println("1 - Progrador junior \n2 - Programador senior \n3 - Jefe de proyecto");
			System.out.println("Introduce el cargo del empleado (1 - 3): ");
			puesto = scanner.nextInt();
		}
		System.out.println("¿Cuantos dias has estado de viaje visitando clientes? ");
		dias_viaje = scanner.nextInt();
		System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		estado_civil = scanner.nextInt();
		while (estado_civil>2) {
			System.out.println("Ha de ser un numero del 1 al 2");
			System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
			estado_civil = scanner.nextInt();
		}
		
		//Calculo de las operaciones
		switch (puesto) {
		case 1:
			sueldo_base = 950;
			break;
		case 2: 
			sueldo_base = 1200;
			break;
		case 3: 
			sueldo_base = 1600;
			break;
		}
		switch (estado_civil) {
		case 1:
			retencion = 25.0;
			break;
		case 2: 
			retencion = 20.0;
			break;	
		}
		
		//Formulas
		dietas = 30 * dias_viaje;
		sueldo_bruto = sueldo_base+dietas;
		sueldo_retencion = sueldo_bruto*(retencion/100);
		sueldo_neto = sueldo_bruto - sueldo_retencion;
		
		//Escritura de datos
		System.out.println("[][][][][][][][][][][][][][][][]\n");
		System.out.println("[]Sueldo base     "+sueldo_base+"[]\n");
		System.out.println("[]Dietas ("+dias_viaje+" viajes)    "+dietas+"[]\n");
		System.out.println("[][][][][][][][][][][][][][][][]\n");
		System.out.println("[]Sueldo bruto     "+sueldo_bruto+"[]\n");
		System.out.println("[]Retencion IRPF ("+retencion+"%)    "+sueldo_retencion+"[]\n");
		System.out.println("[][][][][][][][][][][][][][][][]\n");
		System.out.println("[]Sueldo neto      "+sueldo_neto+"[]\n");
	}
}
