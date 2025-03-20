package Tarea3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el primer número: ");
		int num=Integer.parseInt(sc.nextLine());
		
		
		if(num==sumaDivisores(num))
			System.out.println("Los números son amigos");
		else
			System.out.println("Los números no son amigos");
		
		
	}

	private static int sumaDivisores(int x) {
		int suma=0;
		for(int i=1;i<=x/2;i++)
			if(x%i==0)
				suma+=i;
		return suma;
		
		
		
	}

}
