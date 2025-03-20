package Tarea4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		int num=Integer.parseInt(sc.nextLine());
		
		System.out.println("La cuenta atrás de dos en dos de "+num+" es: ");
		for(int i=num;i>=0;i-=2) {
			System.out.println(i);
		}

	}

}
