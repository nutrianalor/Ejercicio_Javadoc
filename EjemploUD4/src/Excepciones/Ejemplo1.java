package Excepciones;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("El doble de mi número es: "+(num*2));
	}

}
