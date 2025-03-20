package condicionales;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad=Integer.parseInt(sc.nextLine());
		System.out.println("Hola. ");
		if(edad>18)
			System.out.println(" Es mayor ");
		else
			System.out.println(" Es menor ");
		System.out.println(" de edad ");
		
		
		
	}

}
