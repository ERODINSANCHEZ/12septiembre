package metodoBurbuja;

import java.util.*;

public class metodoBurbuja {
	
	static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {

/*		//saber el mayor de 3 numeros
		
		int num1=1,num2=2,num3=3;
		int mayor;
		
		if (num1>num2 && num1>num3) {
			mayor=num1;
		} */
		
/*		System.out.println("Introduce un número:");
		int num1=teclado.nextInt();
		System.out.println("Otro:");
		int num2=teclado.nextInt();
		System.out.println("Otro más:");
		int num3=teclado.nextInt();
		
		int reserva;
		
		if(num1<num2 && num1<num3 && num2<num3) {
			System.out.println(num1 +"-"+ num2 +"-"+ num3);
		}else if(num1>num2 && num1<num3 && num2<num3){
			reserva=num2;
			System.out.println(reserva +"-"+ num1 +"-"+ num3);
		}else {
			...
		} */
		
/*		int num1=teclado.nextInt();
		int num2=teclado.nextInt();
		int num3=teclado.nextInt();
		
		int temp;
		
		int x=0;
		while(x<90) {
			if (num1>num2) {
		           temp=num1;
		           num1=num2;
		           num2=temp;	
			}
		    if (num2>num3) {
		           temp=num2;
		           num2=num3;
		           num3=temp;
		    }

		    x++;
		}
		
		System.out.println(num1 + "-" +num2+"-"+num3); */
	
		
		int[]sueldos=new int[9];
		
		System.out.println("Introduce el valor 1:");
		sueldos[0]=teclado.nextInt();
		System.out.println("Introduce el valor 2:");
		sueldos[1]=teclado.nextInt();
		System.out.println("Introduce el valor 3:");
		sueldos[2]=teclado.nextInt();
		
		int x=0;
		
		while(x<3) {
			System.out.println("Introduce la posición "+ x +" del array");
			sueldos[x]=teclado.nextInt();
			x++;
		}
		
		int i=0;
		while(i<3) {
			System.out.println("El sueldo de la posición "+ i +" es de ");
			System.out.println(sueldos[i]);
			i++;
		}
		
		if(sueldos[x]<sueldos[x+1]) {
			
		}
	}
}
