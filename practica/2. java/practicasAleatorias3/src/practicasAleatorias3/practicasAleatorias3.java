package practicasAleatorias3;

import java.util.*;

public class practicasAleatorias3 {

	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
/*	pg : 95
 	Desarrollar un programa que permita cargar n números enteros y luego nos informe 
	cuántos valores fueron pares y cuántos impares. Emplear el operador “%” en la condición de la estructura condicional: 
	if (valor%2==0) //Si el if da verdadero luego es par.
*/
		
		System.out.println("Introduce la cantidad de números que vas a introducir:");
		int cantidadNumeros=teclado.nextInt();
		
		System.out.println("Introduce los números que habias pensado:");
		
		while(cantidadNumeros>=0){
			
			int numIntroducido=teclado.nextInt();
			
			if(numIntroducido%2==0) {
				int numPar=numIntroducido;
				System.out.println("Los numeros pares son:"+ numPar);
			}else {
				int numImpar=numIntroducido;
				System.out.println("Los numeros impares son:"+ numImpar);
			}
		}
	}
}
