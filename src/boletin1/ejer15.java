package boletin1;

public class ejer15 {

	public static void main(String[] args) {
		double x = 20.0;
		final double IVA = 21;
		final double IVA_R = 10;
		final double IVA_SR = 4;
		System.out.println("El importe de tu producto es de " + x + " euros");
		System.out.println("Si tu producto tuviera un IVA General, su importe descontando el IVA sería :" + (x - (x *(IVA /100))));
		System.out.println("Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería :" + (x - (x *(IVA_R /100))));
		System.out.println("Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería :" + (x - (x *(IVA_SR /100))));
	}
}
