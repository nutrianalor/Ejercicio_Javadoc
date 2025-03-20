package Bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//WHILE
		//Menú de opciones
		//********MENÚ**********
		//1.Imprimir el cuadrado de los primeros 10 números(1-10)
		//2.Generar diez números aleatorios entre 5 y 100
		//3."Pintar" un cuadrado de 5 filas y 5 columnas
		//4. Salir
		
		//No terminamos el prigrama hasta pulsar la opción 4
		
		System.out.println("*******MENÚ*********");
		System.out.println("1.Imprimir cuadrados");
		System.out.println("2.Generar aleatorios");
		System.out.println("3.Pintar Figura");
		System.out.println("4.Salir");
		System.out.println("Introduce una opción: ");
		int opcion=Integer.parseInt(sc.nextLine());
		
		while(opcion!=4) {
			if(opcion==1) {
				imprimirCuadrados();
			}
			else if(opcion==2) {
				generarAleatorios();
			}
			else if(opcion==3) {
				pintarFigura();
			}
			else
				System.out.println("Opción no correcta");
			System.out.println("*******MENÚ*********");
			System.out.println("1.Imprimir cuadrados");
			System.out.println("2.Generar aleatorios");
			System.out.println("3.Pintar Figura");
			System.out.println("4.Salir");
			System.out.println("Introduce una opción: ");
			opcion=Integer.parseInt(sc.nextLine());
			
		}
		
		
	}

	
	private static void pintarFigura() {
		for(int fila=1;fila<=5;fila++) {
			for(int col=1;col<=5;col++)
				System.out.print("* ");
			System.out.println();
		}
		
	}
	
	
	private static void generarAleatorios() {
		Random r=new Random();
		for(int i=1;i<=10;i++)
			System.out.println(r.nextInt(5, 101)+" ");
		
	}
	
	private static void imprimirCuadrados() {
		int num=1;
		while(num<=10) {
			System.out.println(num*num+" ");
			num++;
		}
		

	}

}
