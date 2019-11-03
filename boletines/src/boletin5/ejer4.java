package src.boletin5;

import java.util.*;

import javax.print.DocFlavor.CHAR_ARRAY;

public class ejer4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni, resto;
        char [] letra= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Voy a calcular la letra de tu DNI\nDame tu DNI:");
        dni = scanner.nextInt();
        resto = dni%23;
        System.out.println("Tu letra es "+letra[resto]);
    }
}