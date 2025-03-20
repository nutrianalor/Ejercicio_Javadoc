package Bucles;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num=Integer.parseInt(sc.nextLine());
		//Primero, vamos a proceder con una estructura condicional
		//(if-else) que me diga si el número es demasiado grande,
		//es decir, superior a 10
		
		/*
		if(num>10)
			System.out.println("El número es demasiado grande!");

		else
			System.out.println("Número correcto");
		*/
		
		//Ahora, queremos pedir un número hasta que sea inferior
		//a 11 (While)
		
		while(num>10) {
			System.out.println("Número demasiado grande!");
			System.out.println("Introduce un número: ");
			num=Integer.parseInt(sc.nextLine());
		}
		System.out.println("Número correcto!!");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
