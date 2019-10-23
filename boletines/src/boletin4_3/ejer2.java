/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Calcula los minutos restantes hasta el viernes a las 14
 * 
 * Fecha: 23-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_3;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		String dia;
		int horas,minutos,num_semana, horas_restantes, minutos_restantes;
		
		//Lectura de datos
		System.out.println("Dime que dia es, la hora y los minutos y te calculare cuanto falta para el fin de semana");
		do {
			System.out.println("Dime el dia: ");
			dia = scanner.nextLine();
			dia = dia.toLowerCase();
		} while ((dia.contentEquals("lunes") == false)&&(dia.contentEquals("martes") == false)&&(dia.contentEquals("miercoles") == false)&&(dia.contentEquals("jueves") == false)&&(dia.contentEquals("viernes") == false));
		do {
			System.out.println("Dime las horas: ");
			horas = scanner.nextInt();
		} while ((horas>23));
		do {
			System.out.println("Dime los minutos: ");
			minutos = scanner.nextInt();
		} while ((minutos>59));
		
		//Escritura de datos
		switch (dia) {
		case "lunes":
			horas_restantes= 24-horas;//Horas que quedan
			minutos_restantes= (horas_restantes*60)-minutos;//Minutos que quedan de dia
			minutos_restantes = (((24*60)*3)+(14*60))+minutos_restantes;//Minutos hasta el viernes
			System.out.println("Queda "+minutos_restantes+" minutos para el Viernes a las 14:00");
			break;
		case "martes":
			horas_restantes= 24-horas;
			minutos_restantes= (horas_restantes*60)-minutos;
			minutos_restantes = (((24*60)*2)+(14*60))+minutos_restantes;
			System.out.println("Queda "+minutos_restantes+" minutos para el Viernes a las 14:00");
			break;
		case "miercoles":
			horas_restantes= 24-horas;
			minutos_restantes= (horas_restantes*60)-minutos;
			minutos_restantes = (((24*60)+(14*60)))+minutos_restantes;
			System.out.println("Queda "+minutos_restantes+" minutos para el Viernes a las 14:00");
			break;
		case "jueves":
			horas_restantes= 24-horas;
			minutos_restantes= (horas_restantes*60)-minutos;
			minutos_restantes = ((14*60)+minutos_restantes);
			System.out.println("Queda "+minutos_restantes+" minutos para el Viernes a las 14:00");
			break;
		case "viernes":
			if (horas >14) {
				System.out.println("Las horas hasta las 14, por favor");
				do {
					System.out.println("Dime las horas: ");
					horas = scanner.nextInt();
				} while ((horas>14));
				do {
					System.out.println("Dime los minutos: ");
					minutos = scanner.nextInt();
				} while ((minutos>59));
			}
			horas_restantes= 14-horas;
			minutos_restantes= (horas_restantes*60)+minutos;
			System.out.println("Queda "+minutos_restantes+" minutos para el Viernes a las 14:00");
			break;
		} 
			
		
		

	}

}
