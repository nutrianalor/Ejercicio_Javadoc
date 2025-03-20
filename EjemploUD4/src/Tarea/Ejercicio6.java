package Tarea;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		double numero=Double.parseDouble(sc.nextLine());
		
		double valorAbsoluto=Math.abs(numero);
		System.out.println("El valor absoluto de "+numero+" es: "+valorAbsoluto);
		
		if(numero<0)
			System.out.println(numero*-1);
		else
			System.out.println(numero);
	
	
	
	}

}
