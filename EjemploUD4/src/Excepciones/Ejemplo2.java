package Excepciones;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Introduce dividendo: ");
		String dividendo=sc.nextLine();
		System.out.println("Introduce divisor: ");
		String divisor=sc.nextLine();
		dividir(dividendo, divisor);
	}

	private static void dividir(String dividendo, String divisor) {
		try{
			int n1=Integer.parseInt(dividendo);
			int n2=Integer.parseInt(divisor);
			float resultado=n1/n2;
			System.out.println(resultado);
		}catch(ArithmeticException ex) {
			System.out.println("No se puede dividir por cero");
		}catch(NumberFormatException e) {
			System.out.println("Hay que introducir números enteros");
		}
		
		System.out.println("FIN DE NUESTRO PROGRAMA");
	}
	
}
