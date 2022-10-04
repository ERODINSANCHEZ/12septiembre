package ejercicio1;

import java.util.*;

public class ejer1 {

static	Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Pon un numero:");		
		int num1=teclado.nextInt();
		
		System.out.println("Pon otro numero:");
		int num2=teclado.nextInt();
		
		System.out.println("El resultado es: ");
		int suma=num1+num2;
		System.out.println(suma);
		
		//SI FUERA STRING: Guardamos en una variable lo que yo introduzca por teclado
		//String textoIntroducido=teclado.next();
		
		System.out.println("Introduce el numero por el que deseas empezar:");
		int x=teclado.nextInt()-1;
	
		System.out.println("Introduce hasta donde quieres que llegue:");
		int fin=teclado.nextInt();
		
		while(x<fin) {
			System.out.println(x+1);
			x=x+1; //es lo mismo que x++
		}
	}
}
