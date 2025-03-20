package Recursividad;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números de la " + "serie Fibonacci que deseas ver: ");
		int num = Integer.parseInt(sc.nextLine());
		int a = 0, b = 1, c = a + b;

		// Serie Fibonacci -> 0,1,1,2,3,5,8,13,21,34,...

		// Bucles

		for (int i = num; i >= 1; i--)
			System.out.println(a + " ");
		a = b;
		b = c;
		c = a + b;

		// Recursividad
		fibonacciRecursivo(a, b, num);

	}

	private static void fibonacciRecursivo(int a, int b, int num) {
		if (num == 0)
			return;
		else {
			System.out.println(a + " ");
			fibonacciRecursivo(b, a + b, num - 1);
		}

	}

}
