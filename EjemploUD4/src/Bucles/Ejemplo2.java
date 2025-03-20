package Bucles;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Imprime por pantalla los números pares entre el 1 
		//y el 20 (while)
		//Imprimimos todos los números en la misma linea
		//2 4 6 8...20
		
		//pedimos por teclado hasta que numero queremos comprobar
		//los pares y tiene que ser un número mayor que 10
		
		int cont=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num=Integer.parseInt(sc.nextLine());
		while(num<10) {
			System.out.println("Introduzca un número mayor que 10: ");
			int numer=Integer.parseInt(sc.nextLine());
		}
			
		while(cont<=num) {
			if(cont%2==0)
				System.out.println(cont+" ");
			cont++;
		}
			
		
		
		
	}

}
