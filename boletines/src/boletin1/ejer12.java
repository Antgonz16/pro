package src.boletin1;

public class ejer12 {

	public static void main(String[] args) {
		int v_podemos = 69;
		int v_psoe = 78;
		int v_pp = 35;
		int v_ciudadanos = 49;
		int v_vox = 1;
		int total_izquierda, total_facha;
		total_izquierda = v_podemos + v_psoe;
		total_facha = v_pp + v_ciudadanos + v_vox;
		System.out.println("Los votos de la izquierda son  " + total_izquierda + " que constituyen el " + ((total_izquierda *100) / (total_facha+total_izquierda)) + " % del total y los votos de la derecha son " + total_facha + " que constituyen el " + ((total_facha *100) / (total_facha+total_izquierda)) + " % del total");
		
	}

}

