package Recursividad;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dividendo: ");
		int dividendo = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce divisor: ");
		int divisor = Integer.parseInt(sc.nextLine());
		int cont = 0;
		int resultado = divisionRecursiva(dividendo, divisor);
		// con bucle
		for (int i = dividendo; i >= divisor; i -= divisor)
			cont++;
		System.out.println(cont);

	}

	private static int divisionRecursiva(int dividendo, int divisor) {
		if (dividendo < divisor)
			return 0;
		else
			return 1 + divisionRecursiva(dividendo - divisor, divisor);
	}

}
