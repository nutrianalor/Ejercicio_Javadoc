package Tarea4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (num > 10 || num < 1) {
			System.out.println("Introduzca un número del 1 al 10: ");
			num = Integer.parseInt(sc.nextLine());
		}
		System.out.println("La tabla de multiplicar de " + num + " es: ");
		for (int i = 1; i <= 10; i++)
			System.out.println(num + "x" + i + "=" + (num * i));

	}

}
