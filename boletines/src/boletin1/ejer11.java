package src.boletin1;

public class ejer11 {
	
	public static void main(String[] args) {
		double peso = 80.0;
		double altura = 1.79;
		double imc = 0.0;
		imc = peso /Math.pow(altura, 2);
		System.out.println("El IMC calculado es " + imc);
		if(imc < 18.5) {
			System.out.println("Tu peso es inferior al normal");
		}
		else if (imc >= 18.5 && imc <= 24.999999999) {
			System.out.println("Tu peso es normal");
		}
		else if(imc >= 25 && imc <= 29.999999999) {
			System.out.println("Tu peso es superior normal");
		}
		else {
			System.out.println("Tu peso está por encima de lo normal");
		}
	}

}
