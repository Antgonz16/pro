/******************************************************************\
 * Author: Javier Ros Roig 1ºDAM IES Serpis
 * 
 * Descripcion: Calculo de tu salario
 * 
 * Fecha: 18-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin4_2;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		double salario_semanal;
		double horas;
		double pago_horas;
		double horas_extra;
		double extra = 0.5;
		
		//Lectura de datos
		System.out.println("Cuantas horas has trabajado esta sema?");
		horas=scanner.nextDouble();
		System.out.println("A cuanto se paga las horas?");
		pago_horas=scanner.nextDouble();
		
		//Calculo de resultados
		horas_extra = horas - 40;
		
		//Escritura de datos
		if (horas_extra > 0) {
			salario_semanal = ((horas-horas_extra) * pago_horas) + (horas_extra * (pago_horas +(pago_horas*extra)));
			System.out.println(salario_semanal);
		}
		else {
			salario_semanal = horas * pago_horas;
			System.out.println(salario_semanal);
		}
	}

}

