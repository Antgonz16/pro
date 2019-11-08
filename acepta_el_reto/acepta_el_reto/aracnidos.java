package acepta_el_reto;

import java.util.*;

public class aracnidos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int insectos,aracnidos,crustraceos,escalopendra,anillos;
		int caso;
		int patas;
		
		caso = scanner.nextInt();
		
		for (int i = 0; i < caso; i++) {
			insectos=scanner.nextInt();
			aracnidos=scanner.nextInt();
			crustraceos=scanner.nextInt();
			escalopendra=scanner.nextInt();
			anillos=scanner.nextInt();
			patas=insectos*6+aracnidos*8+crustraceos*10+escalopendra*anillos*2;
			System.out.println(patas);
		}
		
	}

}
