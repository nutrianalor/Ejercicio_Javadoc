package Tarea;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el primer número: ");
		int numero1=Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el segundo número: ");
		int numero2=Integer.parseInt(sc.nextLine());
		 
		String operacion="+";
		switch(operacion) {
		case "+":System.out.println(numero1+numero2);
		case "-":System.out.println(numero1-numero2);
		case "*":System.out.println(numero1*numero2);
		case "/":System.out.println(numero1/numero2);
		default: System.out.println("Error");
		}
		
		
		
	}

}
