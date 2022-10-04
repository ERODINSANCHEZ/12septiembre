package ejercicio2;

import java.util.*;

public class ejer2 {

	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Escribe un número:");
		int primerNumero=teclado.nextInt();
		
		System.out.println("Escribe otro número:");
		int segundoNumero=teclado.nextInt();
		
		int resultadoSuma=primerNumero + segundoNumero;
		int resultadoResta=primerNumero - segundoNumero;
		int resultadoProducto=primerNumero * segundoNumero;
		int resultadoDivision=primerNumero / segundoNumero;
		
		if(primerNumero>segundoNumero) {
			System.out.println("El resutado de su suma es: " + resultadoSuma);
			System.out.println("El resultado de su resta es: " + resultadoResta);
		}else {
			System.out.println("El resultado de su producto es: "+ resultadoProducto);
			System.out.println("El resultado de su división es: "+ resultadoDivision);
		}
		
		
		
		System.out.println("Escribe la nota de tu primer examen: ");
		int nota1=teclado.nextInt();
		System.out.println("Del segundo: ");
		int nota2=teclado.nextInt();
		System.out.println("Del tercero: ");
		int nota3=teclado.nextInt();
		
		int media=(nota1+nota2+nota3)/3;
		
		if(media>=5){
			System.out.println("¡¡¡OLE!!! Has pasado de curso!");
		}else {
			System.out.println("GAME OVER");
		}
		
		
		
		System.out.println("Introduce un número de uno o dos dígitos: ");
		int numeroIntroducido=teclado.nextInt();
		if(numeroIntroducido >=10){
			System.out.println("Tu número tiene 2 dígitos.");
		} else {
			System.out.println("Tu número sólo tiene 1 dígito.");
		}
		
		
		
		int x=teclado.nextInt();
		int y=teclado.nextInt();
		int z=teclado.nextInt();
		
		if(x>y&&x>z){
			System.out.println("El número mayor es "+x);
		}else if(y>z&&y>x){
			System.out.println("El número mayor es "+y);
		}else {
			System.out.println("El número mayor es "+z);
		}
		
		
		
	}
}
