package Tarea;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el valor de a: ");
		int a=Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el valor de b(debe estar entre -2 y 2): ");
		int b=Integer.parseInt(sc.nextLine());
		
		if(b<=-2 || b>=2)
			System.out.println("El valor de b debe estar entre -2 y 2");
		else {
			double resultado=calcularPotencia(a,b);
			System.out.println(a+" elevado a "+b+" es: "+resultado);
		}
		
	}

	private static double calcularPotencia(int a, int b) {
		if(b==-2) 
			return 1.0/(a*a); //a^-2 = 1/(a^2)
		else if (b == -1) 
            return 1.0 / a; // a^-1 = 1/a
         else if (b == 0) 
            return 1; // a^0 = 1
         else if (b == 1) 
            return a; // a^1 = a
         else  // b == 2
            return a * a; // a^2 = a*a
			
			
			
			
			
			
			
			
			
	}

}
