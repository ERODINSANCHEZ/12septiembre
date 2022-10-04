package ejercicio3;

import java.util.*;

public class ejer3 {

	public static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a=teclado.nextInt();
		int b=teclado.nextInt();
		int c=teclado.nextInt();
		
		if(a==b&&b==c&&a==c){
			System.out.println((a+b)*c);
		}else {
			System.out.println("ERROR");
		}
		
		
		
		int dia=teclado.nextInt();
		String mes=teclado.next();
		
		System.out.println("Introduce el día del mes: ");
		System.out.println("Introduce el mes: ");
		
		if(dia==25&&mes.equalsIgnoreCase("diciembre")){
			System.out.println("¡¡¡FELIZ NAVIDAD!!!");
		}else {
			System.out.println("Si no es Navidad no mola.");
		}
		
		//      MAS COMPLETO
		//      if(mesString.equalsIgnoreCase("diciembre")||mesString.equals{
		//           if(dia==25){
		//               System.out.println("¡¡¡FELIZ NAVIDAD!!!");
		//               }
		//       }
		
		
	}
}
