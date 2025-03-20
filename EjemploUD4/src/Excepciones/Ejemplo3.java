package Excepciones;

import java.util.Scanner;

public class Ejemplo3 {
	public static void main(String[] args) {
	//Pedir números hasta que sean correctos y se pueda realizar
	//la división
	Scanner sc=new Scanner(System.in);
	boolean exit=false;
	do {
		try {
			System.out.println("Introduce dividendo: ");
			int dividendo=Integer.parseInt(sc.nextLine());
			System.out.println("Introduce divisor: ");
			int divisor=Integer.parseInt(sc.nextLine());
			dividir(dividendo,divisor);
			exit=true;
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}while(!exit);
	
	}

	private static void dividir(int dividendo, int divisor)
		throws Exception{
		int resultado=dividendo/divisor;
		System.out.println(resultado);
		
	}

}
