package condicionales;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leemos por teclado la nota del alumno en la asignatura
		//de programación
		
		//Imprimiremos si el alumno ha aprobado o no
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce su nota: ");
		int nota=Integer.parseInt(sc.nextLine()); //double nota=Double,parseDouble
		System.out.println("Usted esta ");
		if(nota>=5)
			System.out.print("aprobado");
		else
			System.out.print("suspenso");
	}

}
