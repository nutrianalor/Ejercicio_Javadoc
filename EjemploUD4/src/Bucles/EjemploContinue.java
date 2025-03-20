package Bucles;

import java.util.Scanner;

public class EjemploContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Leemos por teclado un número e imprimimos todos los números que hay 
		 * anteriores a él, excepto los perfectos
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num=Integer.parseInt(sc.nextLine());
		for(int i=1;i<num;i++) {
			if(sumaDivisores(i)==i)
				continue;
			System.out.println(i);
			
		}
		
		
	}

	private static int sumaDivisores(int num) {
		int suma=0;
		for(int i=1;i<=num/2;i++)
			if(num%i==0)
				suma+=i;
		return suma;
	}

	
	
	
	
}
