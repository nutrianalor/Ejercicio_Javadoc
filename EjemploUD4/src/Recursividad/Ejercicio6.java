package Recursividad;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = Integer.parseInt(sc.nextLine());
		int invertido = 0;
		invertido = invertirNumero(num, invertido);
		// Bucle

		
		for (int i = num; i >= 0; i /= 10) {
			invertido += (i % 10);
			invertido *= 10;
		}
		invertido /= 10;
		System.out.println(invertido);
		
	}
	

	private static int invertirNumero(int num, int invertido) {
		if (num < 10)
			return invertido + num;
		else {
			invertido += (num % 10);
			return invertirNumero(num / 10, invertido * 10);
		}
	}
	
}
