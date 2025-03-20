package Tarea3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//voy a obligar a que A siempre sea menor que B
		Scanner sc=new Scanner(System.in);	
		int A,B;
		do {
			System.out.println("Introduce 'A': ");
			A=Integer.parseInt(sc.nextLine());
			System.out.println("Introduce 'B': ");
			B=Integer.parseInt(sc.nextLine());
		}while(A>=B);
		
		int sumaPares=0,sumaImpares=0;
		for(int num=A;num<=B;num++) {
			if(num%2==0)
				sumaPares+=num;
			else
				sumaImpares+=num;
		}
		
		System.out.println("Suma de pares --> "+sumaPares);
		System.out.println("Suma de impares --> "+sumaImpares);
		
	}

}
