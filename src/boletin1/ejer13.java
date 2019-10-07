package boletin1;

public class ejer13 {

	public static void main(String[] args) {
		double d_patricia = 0, d_elena = 0, d_orcar = 0;
		double d_entradas = 9.0;
		double d_palomitas = 6.0;
		double d_refresco = d_palomitas/2;
		double d_dulces = Math.pow(d_refresco, 3);
		
		d_patricia = d_entradas + d_palomitas + d_refresco + d_dulces;
		d_elena = d_patricia;
		d_orcar = d_refresco + d_entradas;
		
		System.out.println("Patricia ha gastado " + d_patricia + " euros\nElena ha gastado " + d_elena + " euros\nOscar ha gastado " + d_orcar + " euros\nEn total la broma les ha salido por " + (d_patricia  + d_elena +  d_patricia) + " euros" );

	}

}
