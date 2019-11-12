package src.boletin5_4;

import java.util.*;

public class ejer1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int []vector,vector_ordenado;
		System.out.println("Dime el tamaño del vector");
		n = scanner.nextInt();
		vector=creacion_vector(n);
		escritura_vector(vector);
		vector_ordenado=ordenacion_vector(vector);
		comparacion_vectores(vector, vector_ordenado);
	}
	public static int[] creacion_vector(int n){
		Random random = new Random();
		int[]v=new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i]=(int)(random.nextDouble()*(100+1));
		}
		return v;
	}
	public static void escritura_vector(int []v){
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	public static int[] ordenacion_vector(int []v){
		int[]v_ordenado= Arrays.copyOfRange(v, 0, v.length);
		Arrays.sort(v_ordenado);

		return v_ordenado;
	}
	public static void comparacion_vectores(int []v, int[]v1){
		if (Arrays.equals(v, v1)) {
			System.out.println("El vector esta ordenado");
		}
		else {
			System.out.println("El vector no esta ordenado");
		}
	}
}
