package Bucles;

import java.util.Random;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//genera tres números aleatorios entre 1 y 10 e imprímelos
		//por pantalla (sin bucles)
		
		Random r=new Random();
		int num1=r.nextInt(1,11);
		int num2=r.nextInt(1,11);
		int num3=r.nextInt(1,11);
		System.out.println(num1+" "+num2+" "+num3+" ");
		
		//¿Y si fuesen 100 números?
		for(int i=1;i<=100;i++)
			System.out.println(r.nextInt(1,11)+" ");
		
	}

}
