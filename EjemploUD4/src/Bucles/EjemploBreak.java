package Bucles;

import java.util.Scanner;

public class EjemploBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vamos a leer por teclado un número y vamos a imprimir
		//por pantalla los tres primeros números perfectos hasta
		//llegar a ese número que hemos leído
		
		//Sileemos por ejemplo el 350, me va a buscar desde el 
		//número 1 hasta el 350, los tres primeros números 
		//perfectos, los va a imprimir y terminamos la ejecución
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num=Integer.parseInt(sc.nextLine());
		
		int cont=0;
		for(int i=1;i<=num;i++)
			if(sumaDivisores(i)==i) {
				System.out.println(i);
				cont++;
				if(cont==3)
					break;
			}
			
	}

	private static int sumaDivisores(int x) {
		int suma=0;
		for(int i=1;i<=x/2;i++)
			if(x%i==0)
				suma+=i;
		return suma;
	}

}
