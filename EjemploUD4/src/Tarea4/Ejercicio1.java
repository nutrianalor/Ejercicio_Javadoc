package Tarea4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int numeroSecreto = r.nextInt(0, 101);
		int cont = 1;
		
		System.out.println("He pensado un número aleatorio "
		+ "del 1 al 100, ¿podrás adivinarlo?");

		System.out.println("Introduzca un número: ");
		int num = Integer.parseInt(sc.nextLine());

		while (num != numeroSecreto) {
			System.out.println("Número incorrecto!!");
			if (num < numeroSecreto)
				System.out.println("Sube un poco...");
			else
				System.out.println("Te has pasado! Baja");
			System.out.println("Introduce otro número: ");
			num = Integer.parseInt(sc.nextLine());
			cont++;
		}

		System.out.println("Has acertado en " + cont + " intentos");

	}

}
