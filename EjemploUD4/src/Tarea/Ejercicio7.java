package Tarea;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un número mayor que 0: ");
		int numero=sc.nextInt();	//int numero=Integer.parseInt(sc.nextLine());
		
		if (numero%2==0)
			System.out.println(numero+" es un número par");
		else
			System.out.println(numero+" es un número impar");
		
		}
	

}
