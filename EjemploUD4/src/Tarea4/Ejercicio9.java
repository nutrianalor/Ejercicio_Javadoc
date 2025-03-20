package Tarea4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduzca un número entre el 1 y el 10: ");
		int num = Integer.parseInt(sc.nextLine());

		while (num > 10 || num < 1) {
			System.out.println("Por favor, introduzca un número entre el 1 y el 10: ");
			num = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("La tabla de multiplicar del " + num + " es:");
		mostrarTabla(num);

	}

	private static void mostrarTabla(int num) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}
	
	
	}

}
