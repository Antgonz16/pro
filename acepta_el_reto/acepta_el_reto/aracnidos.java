package acepta_el_reto;

import java.util.*;

import javax.smartcardio.ATR;

public class aracnidos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int artropodo,anillos;
		int caso;
		int patas;
		
		caso = scanner.nextInt();
		
		for (int i = 0; i < caso; i++) {
			artropodo=scanner.nextInt();
			patas=artropodo*6;
			artropodo=scanner.nextInt();
			patas=patas+artropodo*8;
			artropodo=scanner.nextInt();
			patas=patas+artropodo*10;
			artropodo=scanner.nextInt();
			anillos=scanner.nextInt();
			patas=patas+artropodo*anillos*2;
			
			System.out.println(patas);
		}
		
	}

}
