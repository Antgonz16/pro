package acepta_el_reto;

import java.util.*;

public class cociendo_huevos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int huevos, cazo;
		
			do {
				huevos = scanner.nextInt();
				cazo = scanner.nextInt();
				if (huevos!=0&&cazo!=0) {
					if (huevos%cazo>0) {
						System.out.println(10*((huevos/cazo)+1));
					}
					else {
						System.out.println(10*((huevos/cazo)));
					}
				}
			} while (huevos!=0&&cazo!=0);

	}

}
