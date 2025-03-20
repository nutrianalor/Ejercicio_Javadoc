package condicionales;

import java.util.Scanner;

public class Ejemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Leemos por teclado la nota de un alumno
		//Imprimimos is es matrícula de honor, sobresaliente,
		//notable, bien, aprobado, insuficiente, muy deficiente (<3)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu nota: ");
		Double nota=Double.parseDouble(sc.nextLine());
		
		if(nota==10)
			System.out.println("Tienes matrícula de honor");
		
		else if(nota>=9)
			System.out.println("Tienes un sobresaliente");
		else if(nota>=7)
			System.out.println("Tienes un notable");
		else if(nota>=6)
			System.out.println("Tienes un bien");
		else if(nota>=5)
			System.out.println("Estas aprobado");
		else if(nota>=3)
			System.out.println("Tienes un insuficiente");
		else
			System.out.println("Tu nota es muy deficiente");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
