package programas;

public class laberinto {

	public static void main(String[] args) {
		String [][] laberinto= {{"X"," ","X","X","X"},{"X"," ","X","X","X"},{"X"," "," "," ","X"},{"X","X","X"," ","X"},{"X","X","X","O","X"}};
		int posicion_i_x=4;
		int posicion_i_y=3;
		int posicion_f_x=0;
		int posicion_f_y=1;
		int posicion_x;
		int posicion_y;
		
		for (int i = 0; i < laberinto.length; i++) {
			for (int j = 0; j < laberinto[0].length; j++) {
				System.out.print(laberinto[i][j]);
			}
			System.out.print("\n");
		}
		posicion_x=posicion_i_x;
		posicion_y=posicion_i_y;
		while (laberinto[posicion_f_x][posicion_f_y].contains(" ")) {
			if (laberinto[posicion_x-1][posicion_y]==" ") {
				laberinto[posicion_x][posicion_y]=" ";
				posicion_x--;
				laberinto[posicion_x][posicion_y]="O";
				for (int i = 0; i < laberinto.length; i++) {
					for (int j = 0; j < laberinto[0].length; j++) {
						System.out.print(laberinto[i][j]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
			else if (laberinto[posicion_x][posicion_y-1]==" ") {
				laberinto[posicion_x][posicion_y]=" ";
				posicion_y--;
				laberinto[posicion_x][posicion_y]="O";
				for (int i = 0; i < laberinto.length; i++) {
					for (int j = 0; j < laberinto[0].length; j++) {
						System.out.print(laberinto[i][j]);
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
			
		}
		System.out.println("Sali del laberinto");
			

	}

}