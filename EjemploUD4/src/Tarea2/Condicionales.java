package Tarea2;

public class Condicionales {

	public static int aprobado(float nota) {
	if (nota>=5) {
		System.out.println("Aprobado");
		return 1;
	}else {
		System.out.println("Suspenso");
	    return 0;
	}
			
	}

		static int saldo(float ingresos, float gastos) {
		float saldo=ingresos-gastos;
		if(saldo>=0) {System.out.println("Te sobran "+saldo+"$");
		
		}else {
			System.out.println("Estás en números rojos");
		}
		return saldo;
		
		 public static String parOimpar(int numero) {
		        return (numero % 2 == 0) ? "PAR" : "IMPAR";
		    }

	public static void mayor(int a, int b) {
	    if (a > b) {
		 System.out.println("El mayor es: " + a);
		} else if (b > a) {
		 System.out.println("El mayor es: " + b);
		} else {
		 System.out.println("Ambos son iguales");
		 }
		    }

	public static float dividir(float dividendo, float divisor) {
	    if (divisor == 0) {
		  System.out.println("Error: No se puede dividir entre cero.");
		  return 0;
		}
		        return dividendo / divisor;
		
		
	}
		
}


