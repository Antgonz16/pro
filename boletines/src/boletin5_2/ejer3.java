package src.boletin5_2;

import java.util.*;

public class ejer3 {

	public static void main(String[] args) {
		Random random = new Random();
		int nota, compas, num;
		
		
		
		do {
			num = (int)(random.nextDouble()*24+4);
		} while (num%4!=0);
	
		compas = num;
		String [] melodia = new String [compas];
		
		for (int i = 0; i < melodia.length; i++) {
			nota = random.nextInt(7)+1;
			switch (nota) {
			case 1:
				melodia[i]="do";
				break;
			case 2:
				melodia[i]="re";
				break;
			case 3:
				melodia[i]="mi";		
				break;
			case 4:
				melodia[i]="fa";
				break;
			case 5:
				melodia[i]="sol";
				break;
			case 6:
				melodia[i]="la";
				break;
			case 7:
				melodia[i]="si";
				break;
			}
			if (i==melodia.length-1) {
				melodia[i]=melodia[0];
			}
		}
		for (int i = 0; i < melodia.length; i++) {
			System.out.print(melodia[i]+" ");
			if ((i>0)&&((i+1)%4==0)) {
				System.out.print("|");
				if (i==melodia.length-1) {
					System.out.print("|");
				}
			}
		}
	}
}
