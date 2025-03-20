package Tarea4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		int num = Integer.parseInt(sc.nextLine());

		if (num < 0) {
			System.out.println("Por favor, ingrese un número no negativo.");
		} else {
			int mostrarFactorial = calcularFactorial(num);
			System.out.println("El factorial de " + num + " es " + mostrarFactorial);
		}

	}

	private static int calcularFactorial(int num) {
		int resultado = 1;
		for (int i = 1; i <= num; i++)
			resultado *= 1;

		return resultado;
	}

}
