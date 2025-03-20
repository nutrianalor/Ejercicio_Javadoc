package condicionales;

import java.util.Scanner;

public class EjemploCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		int nota=Integer.parseInt(sc.nextLine());
		switch(nota) {
		case 0,1,2,3,4 -> System.out.println("Suspenso");
		case 5 -> System.out.println("Aprobado");
		case 6 -> System.out.println("Bien");
		case 7,8 -> System.out.println("Notable");
		case 9,10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Nota incorrecta");
		
		}
		*/
		
		//Transformar al witch case con yield
		
		String mensaje=switch(nota) {
		case 0,1,2,3,4 -> {yield "Suspenso";}
		case 5 -> {yield "Aprobado";}
		case 6 -> {yield "Bien";}
		case 7,8 -> {yield "Notable";}
		case 9,10 -> {yield "Sobresaliente";}
		default -> {yield "Nota incorrecta";}
		
		};
		
		
		
		
		
	}

}
