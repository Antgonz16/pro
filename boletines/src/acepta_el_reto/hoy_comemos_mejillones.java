package src.acepta_el_reto;

import java.util.Scanner;

public class hoy_comemos_mejillones {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n_mejillones,medida;
        int contador=0;
        int[] montones;
        

        while(scanner.hasNext()){
            n_mejillones = scanner.nextInt();
            montones= new int[n_mejillones];
            contador=1;
            for(int i=0; i<n_mejillones; i++){
                medida = scanner.nextInt();
                montones[i]=medida;
            }
            for(int i=0; i<n_mejillones; i++){
                for(int j=0; j<i; j++){
                    if(i>0&&montones[i]<montones[j]){
                        contador++;
                        j=i;
                    }
                }
            }

            System.out.println(contador);
        }
    }
}