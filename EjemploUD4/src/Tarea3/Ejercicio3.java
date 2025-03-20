package Tarea3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el valor de 'N': ");
		int num=Integer.parseInt(sc.nextLine());
		
		double suma=0;
		for(int i=1;i<=num;i++)
			suma+=1/(double)i;
		
		System.out.printf("\nLa suma es: %.2f",suma);
		
	}

}
