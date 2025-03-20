package condicionales;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vais a leer por teclado un nombre de persona
		//y una letra (leerlo como un String)
		
		//Vais a imprimir por consola si el nombre que habeis
		//leído empieza por esa letra
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		String nombre=sc.nextLine();
		System.out.println("Introduce un caracter: ");
		String letra=sc.nextLine();
		if(nombre.startsWith(letra))
			System.out.println("El nombre empieza por la letra "+letra);
		else
			System.out.println("El nombre no empieza por la letra "+letra);
	}

}
