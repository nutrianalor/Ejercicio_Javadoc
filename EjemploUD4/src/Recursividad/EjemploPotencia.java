package Recursividad;

import java.util.Scanner;

public class EjemploPotencia {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la base: ");
		int base=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el exponente: ");
		int expo=Integer.parseInt(sc.nextLine());
		int resultado=potencia(base,expo);
		System.out.println("Resultado--> "+resultado);
		
		
	}

	private static int potencia(int base, int expo) {
		//caso base
		if(expo==0)
			return 1;
		else
			return base*potencia(base,expo-1);
		//caso generalizado que se vaya simplificando (llamada al propio método)
	}

}
