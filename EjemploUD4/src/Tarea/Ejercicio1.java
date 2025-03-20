package Tarea;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		int edad=Integer.parseInt(sc.nextLine());
		if(edad>=18)
			System.out.println("Eres mayor de edad");
		else
			System.out.println("Eres menor de edad");
	}

}
