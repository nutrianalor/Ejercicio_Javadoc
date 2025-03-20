package Recursividad;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce N: ");
		int n=Integer.parseInt(sc.nextLine());
		int resultado=recursividad(n);
		System.out.println(resultado);
		
}

	private static int recursividad(int n) {
		if(n==2)
			return 2;
		else
			return n+recursividad(n-2);
	}
}

