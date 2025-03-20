package Bucles;

import java.util.Scanner;

public class EjemploReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Imprimimos en el rango de 1 a 100, los tres primeros números
		//que son divisibles por un número que pedimos por teclado.
		//Es decir, si yo por teclado introduzco el número 6, vamos a 
		//imprimir 6,12 y 18
		
		//Llamamos desde el main a un método imprimirNúmeros que tiene
		//el comportamiento anterior descrito
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num=Integer.parseInt(sc.nextLine());
		imprimirNumeros(num);
		System.out.println("FINALIZANDO EL EJERCICIO...");
		
		
	}

	private static void imprimirNumeros(int num) {
		int cont = 0;
		for(int i=1;i<=100;i++)
			if(i%num==0) {
				cont++;
				System.out.println(i);
				if(cont==3)
					return;
			}
		
	}

}
