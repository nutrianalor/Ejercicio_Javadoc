package condicionales;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leemos por teclado una nota numérica e imprimimos
		//aprobado o suspenso pero con operador ternario
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu nota: ");
		double nota=Double.parseDouble(sc.nextLine());
		String res=nota >=5? "Aprobado" : "Suspenso";
		
		System.out.println(res);
		
	}

}
