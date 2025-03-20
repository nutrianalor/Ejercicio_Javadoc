package Tarea4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vamos a dibujar un triángulo "
				+ "restángulo invertido");
		System.out.println("Introduce el tamaño");
		int num=Integer.parseInt(sc.nextLine());
		for (int i=num; i>=1;i--) {
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}

}
