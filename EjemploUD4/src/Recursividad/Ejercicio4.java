package Recursividad;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial: ");
		int num = Integer.parseInt(sc.nextLine());
		int factorial = 1;
		// el factorial de 5 -> 5*4*3*2*1=120
		// bucle

		for (int i = num; i >= 1; i--)
			factorial *= i;
		System.out.println("Bucle " + factorial);

		// recursividad
		int fact = factorialRecursividad(num);
		System.out.println("Recursividad " + fact);

	}

	private static int factorialRecursividad(int n) {
		if (n == 1)
			return n;
		else
			return n * factorialRecursividad(n - 1);
	}

}
