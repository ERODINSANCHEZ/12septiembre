package practicasAleatorias2;

public class practicasAleatorias2 {

	public static void main(String[] args) {
/*		pg: 95
		4. Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)
*/		
		int numero=11;
		int multiplo=1;
		
		while(multiplo<=25) {
			System.out.println(numero*multiplo);
			multiplo++;
		}
	}
}
