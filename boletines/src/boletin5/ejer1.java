package src.boletin5;


public class ejer1 {

	public static void main(String[] args) {
		int[]v=new int[100];
		int suma =0;
		int media;
		
		for (int i = 0; i < v.length; i++) {
			v[i]=i+1;
		}
		for (int j = 0; j < v.length; j++) {
			suma= suma+v[j];
		}
		media = suma /v.length;
		System.out.println("La suma "+suma+" la media "+media);

	}

}
