package Tarea3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el valor de N: ");
		int num=Integer.parseInt(sc.nextLine());
		
		if (num<=0)
			System.out.println("El número debe ser positivo");
		else
			System.out.println("Los divisores de "+num+" son: ");
		
		for(int i=1;i<=num; i++) {
			if(num%i==0) 
				System.out.print(i+" ");
		}
		
	}

}
