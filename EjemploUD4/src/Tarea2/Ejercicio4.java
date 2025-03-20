package Tarea2;

import java.util.Scanner;

public class Ejercicio4 {

	
	public static double calcularMedia(double nota1, double nota2, double nota3) {
		if (nota1>=3 && nota2 >=3 && nota3 >=3) {
			return (nota1 + nota2 + nota3) / 3;
        } else {
            double media = (nota1 + nota2 + nota3) / 3;
            return Math.min(media, 4);
        }
    }
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el valor del primer número: ");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el valor del segundo número: ");
		int num2=Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el valor del tercer número: ");
		int num3=Integer.parseInt(sc.nextLine());
		
		
		
		}
		
		
		
	}

}
