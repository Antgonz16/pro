package boletin1;

enum dias {
	lunes, martes, miercoles, jueves, viernes, sabado, domingo;
}
public class ejer5 {
	
	public static void main(String[] args) {
		System.out.println("Odio los " + dias.lunes);
		System.out.println("Los " + dias.martes + " paso de la fase de negación a la fase de aceptación");
		System.out.println("Cuando es " + dias.miercoles + " pienso que ya vamos por la mitad de la semana");
		System.out.println("El previo del Viernes, el " + dias.jueves + ", es mi día favorito de la semana");
		System.out.println("El " + dias.viernes + " suelo quedar con mis amigos para cenar");
		System.out.println("Los " + dias.sabado + " me levanto tarde y siempre desayuno tortitas.");
		System.out.println("Me deprimen los "+ dias.domingo+ " porque pienso que mañana es " + dias.lunes);
	}

}
