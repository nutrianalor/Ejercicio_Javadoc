package Tarea3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int num1=Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el segundo número: ");
		int num2=Integer.parseInt(sc.nextLine());
		
		int r=0;
		
		for(int i=0;i<num2;i++) {
			r=r+num1;
		}
		
		System.out.println("El producto de "+num1+" y "+num2+" es: "+r);
		
		
		
	}

}
