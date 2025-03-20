package Bucles;

import java.util.Scanner;

public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mediante do-while, introducir un número menor que 10
		
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduce un número: ");
			n=Integer.parseInt(sc.nextLine());
		}while(n>10);
		
	}

}
