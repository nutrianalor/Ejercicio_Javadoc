package Tarea4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num=Integer.parseInt(sc.nextLine());
		
		while(num>0) {
			num-=2;
			System.out.println(num);
			
		}
		
		
		
		
	}

}
