package Tarea3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el valor de 'N': ");
		int num=Integer.parseInt(sc.nextLine());
		
		int cont=0;
		while(num>0) {
			num=num/10;
			cont++;
			
		}
		System.out.println("Número de cifras: "+cont);
	}

}
