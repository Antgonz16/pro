package acepta_el_reto;

import java.util.*;

public class perimetro_de_un_rectangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y;

			do {
				x=scanner.nextInt();
				y= scanner.nextInt();
				if (x>=0&&y>=0) {
					System.out.println((2*(x+y)));	
				}
			} while (x>=0&&y>=0);
	}

}
