package Tarea;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el valor de a: ");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el valor de b: ");
		int b=Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el valor de c (a+b): ");
		int c=Integer.parseInt(sc.nextLine());
		if (a+b==c)
		System.out.println("Correcto!!");
		else
		System.out.println("Has fallado");
		
		
		
		
		
		
		
	}

}
