package Recursividad;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce N: ");
		int n = Integer.parseInt(sc.nextLine());
		int resultado = suma(n);

	}

	private static int suma(int n) {
		if (n == 1)
			return 1;
		else {
			return n + suma(n - 1);
		}

	}

}
