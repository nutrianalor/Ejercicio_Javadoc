package Tarea3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce 'x': ");
		int x=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce 'n': ");
		int n=Integer.parseInt(sc.nextLine());
		int res=1;
		for(int i=1;i<=n;i++)
			res*=x;
		System.out.println("Potencia es "+res);
			
		
	}

}
