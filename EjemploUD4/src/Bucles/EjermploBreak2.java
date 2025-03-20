package Bucles;

import java.util.Scanner;

public class EjermploBreak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Un menú con las siguientes opciones:
		 * 1.Imprimir suma de divisores de un número que pedimos por teclado
		 * 2.Imprimir si el número es perfecto o no(leemos or teclado)
		 * 3.Salir
		 * 
		 * 
		 * 
		 * El menú se ejecuta de manera indefinida hasta que el usuario
		 * especifique la opción 3
		 */
		
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.println("****MENÚ*****");
			System.out.println("1. Imprimir suma de divisores");
			System.out.println("2. El número es perfecto?");
			System.out.println("3. Salir");
			System.out.println("Introduce la opción:");
			int opcion=Integer.parseInt(sc.nextLine());
			if(opcion==1)
			{
				System.out.println("Introduce c");
				int num=Integer.parseInt(sc.nextLine());
				if(num==sumaDivisores(num))
					System.out.println("Número perfecto");
				else
					System.out.println("Número no perfecto");
			}
			else if(opcion==2)
			{
				System.out.println("Introduce un número: ");
				int num=Integer.parseInt(sc.nextLine());
				if(num==sumaDivisores(num))
					System.out.println("Número perfecto");
				else
					System.out.println("Número no perfecto");
			}
			else if(opcion==3)
				break;
			else
				System.out.println("No existe esa opción");
			
		}while(true);
		System.out.println("FINALIZANDO...");
		
		
		
	}



	private static int sumaDivisores(int x) {
		int suma=0;
		for(int i=1;i<=x/2;i++)
			if(x%i==0)
				suma+=i;
		return suma;}
}
