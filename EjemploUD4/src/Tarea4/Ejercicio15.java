package Tarea4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		do {
		System.out.println("Introduce un número de términos: ");
		num=Integer.parseInt(sc.nextLine());
		}while(num<=2);
		System.out.println("1 1 ");
		int a=1, b=1;
		for(int i=2;i<num;i++) {
			int nuevo=a+b;
			System.out.println(nuevo+" ");
			a=b;
			b=nuevo;
		}
		
		
		
		
	}

}
