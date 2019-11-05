package acepta_el_reto;

import java.util.Scanner;

public class hoy_comemos_mejillones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n_mejillones, medida, medio, fin, ini, contador;
        int[] montones;

        while (scanner.hasNext()) {
            n_mejillones = scanner.nextInt();
            montones = new int[n_mejillones];
            montones[0] = scanner.nextInt();
            contador = 1;
            for (int i = 1; i < n_mejillones; i++) {
                medida = scanner.nextInt();
                if (medida >= montones[contador - 1]) {
                    montones[contador++] = medida;
                } else {
                    fin = contador;
                    ini = 0;
                    while (ini < fin) {
                        medio = (fin + ini) / 2;
                        if (montones[medio] > medida) {
                            fin = medio;
                        } else {
                            ini = medio + 1;
                        }
                    }
                    montones[fin] = medida;
                }
            }

            System.out.println(contador);
        }
    }
}
