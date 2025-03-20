package Tarea;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el valor de a: ");
		int a=Integer.parseInt(sc.nextLine());
		if (a<=0)
			System.out.println("Introduzca un número positivo! ");
			
		System.out.println("Introduzca el valor de b: ");
		int b=Integer.parseInt(sc.nextLine());
		if (a<=0 || b==a )
			System.out.println("Introduzca un número positivo o distinto de a ");
		System.out.println("Introduzca el valor de c: ");
		int c=Integer.parseInt(sc.nextLine());
		if (a<=0 || c==a || c==b)
			System.out.println("Introduzca un número positivo o distinto del resto");
			
			
			
			int mayor;
            if (a > b && a > c) {
                mayor = a;
            } else if (b > a && b > c) {
                mayor = b;
            } else {
                mayor = c;
            }
            System.out.println("El número más grande es: "+mayor);
	
	}

}
