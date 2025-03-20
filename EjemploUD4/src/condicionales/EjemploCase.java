package condicionales;

import java.util.Scanner;

public class EjemploCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pedimos por teclado en numero de mes e imprimimos por
		//pantalla el número de días que tiene ese mes (no años
		//bisiestos). Hacer con Switch Case
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número de mes: ");
		int numMes=Integer.parseInt(sc.nextLine());
		switch(numMes) {
		case 1,3,5,7,8,10,12:System.out.println("31 días");break;
		case 2: System.out.println("28 días"); break;
		case 4,6,9,11:System.out.println("30 días"); break;
		default: System.out.println("Mes no válido");
		
		}
		
	}

}
