package Tarea4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de columnas: ");
		int col = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el número de filas: ");
		int fil = Integer.parseInt(sc.nextLine());

		dibujaRectangulo(fil, col);

	}

	private static void dibujaRectangulo(int fil, int col) {
		if (col > 10)
			col = 10;
		if (fil > 10)
			fil = 10;
		for (int i = 1; i <= fil; i++) {
			for (int j = 1; j <= col; j++)
				System.out.print("* ");
			System.out.println();
		}

	}

}
