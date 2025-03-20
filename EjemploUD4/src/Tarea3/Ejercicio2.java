package Tarea3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num=Integer.parseInt(sc.nextLine());
		
		int suma=0;
		for(int i=num;i<=num+100;i++)
			suma+=i;
		
		System.out.println("La suma es: "+suma);
		
	}

}
