package Documentacion;

import java.util.Scanner;

public class Depuracion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el número: ");
		int num=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<num;i++)
			System.out.println(i);
			
	}

}
