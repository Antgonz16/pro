/******************************************************************\
 * Author: Javier Ros Roig 1�DAM IES Serpis
 * 
 * Descripcion: Menu de opciones para fechas
 * 
 * Fecha: 30-10-2019
 * 
 * Version: 1.0
 \*******************************************************************/
package src.boletin5_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class ejer1 {

	public static void main(String[] args) throws ParseException {
		//Declaracion de variables
		Scanner scanner = new Scanner(System.in);
		Date ahora = new Date();
		int opcion;
		
		//Menu
		do {
			System.out.println("1.- Obtener fecha actual\n" + 
					"2.- Obtener hora actual\n" + 
					"3.- Sumar días\n" + 
					"4.- Diferencia en días\n" + 
					"5.- Anterior o Posterior\n" + 
					"9.- Salir");
			System.out.println("Dame una opcion del menu: ");
			opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1:
				opcion1(ahora);
				break;
			case 2:
				opcion2(ahora);
				break;
			case 3:
				opcion3(ahora);
				break;
			case 4:
				opcion4();
				break;
			case 5:
				opcion5(ahora);
			case 9:
				break;
			default:
				System.out.println("Esa opcion no es correcta");
				break;
			}
		
		} while (opcion !=9);
		System.out.println("Programa finalizado");
		
		
	}
	public static void opcion1(Date ahora ) {
		//Muestra fecha actual
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Fecha actual: "+formatoDelTexto.format(ahora));
	}
	public static void opcion2(Date ahora ) {
		//Nuestra hora actual
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		formatoDelTexto = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Hora actual: "+formatoDelTexto.format(ahora));
	}
	public static void opcion3(Date ahora) {
		//Suma dias
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Scanner scanner = new Scanner(System.in);
		int dias;
		
		System.out.println("Dime los dias que vamos a sumar: ");
		dias = scanner.nextInt();
		
		Calendar cal = new GregorianCalendar();
		cal.setTimeInMillis(ahora.getTime());
		cal.add(Calendar.DATE, dias);
		
		Date fecha_suma = new Date(cal.getTimeInMillis());
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Hoy + "+dias+" dias: "+formatoDelTexto.format(fecha_suma));
	}
	public static void opcion4() throws ParseException{
		//Resta dos fechas
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Scanner scanner = new Scanner(System.in);
		int dia, mes, ano;
		long diferencia;
		
		System.out.println("Introduzca la primera fecha con formato dd/mm/yyyy");
		System.out.println("Dias: ");
		dia = scanner.nextInt();
		System.out.println("Mes: ");
		mes = scanner.nextInt();
		System.out.println("Año: ");
		ano = scanner.nextInt();
		String fechaString1 = dia+"-"+mes+"-"+ano;
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha1 = null;
		fecha1= formatoDelTexto.parse(fechaString1);
		
		System.out.println("Introduzca la segunda fecha con formato dd/mm/yyyy");
		System.out.println("Dias: ");
		dia = scanner.nextInt();
		System.out.println("Mes: ");
		mes = scanner.nextInt();
		System.out.println("Año: ");
		ano = scanner.nextInt();
		String fechaString2 = dia+"-"+mes+"-"+ano;
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha2 = null;
		
		fecha2= formatoDelTexto.parse(fechaString2);
		diferencia= fecha1.getTime() -fecha2.getTime();
		diferencia=diferencia/(1000 * 60 * 60 * 24);
		
		
		System.out.println("fecha1   fecha2   diferencia");
		System.out.println(formatoDelTexto.format(fecha1)+"  "+formatoDelTexto.format(fecha2)+"  "+diferencia);
	}
	public static void opcion5(Date ahora) throws ParseException {
		//Mira si la fecha es posterios o anterior
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Scanner scanner = new Scanner(System.in);
		int dia, mes, ano;
		
		System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
		System.out.println("Dias: ");
		dia = scanner.nextInt();
		System.out.println("Mes: ");
		mes = scanner.nextInt();
		System.out.println("Año: ");
		ano = scanner.nextInt();
		String fechaString = dia+"-"+mes+"-"+ano;
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		Date fechaUsuario = null;
		fechaUsuario= formatoDelTexto.parse(fechaString);
		
		if (fechaUsuario.after(ahora)) {
			System.out.println("La fecha introducida es posterior");
		}
		else {
			System.out.println("La fecha introducida es anterior");
		}
        
	}

}
