package ejercicio4;

import java.util.*;

public class ejer4 {
	
	static Scanner teclado=new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("Introduce el número de preguntas:");
		int numPreguntas=teclado.nextInt();
		System.out.println("Introduce las que has acertado:");
		int preguntasCorrectas=teclado.nextInt();
		
		int porcentaje=preguntasCorrectas*100/numPreguntas;
		
		if(porcentaje>=90) {
			System.out.println("¡¡¡Eres una crack!!!");
		}else if(porcentaje<90&&porcentaje>75) {
			System.out.println("Na, te quedas en mediocre.");
		}else if(porcentaje>=50&&porcentaje<75) {
			System.out.println("Casiii, regulin.");
		}else {
			System.out.println("Estas FUERA.");
		}
		
				
	}
}
