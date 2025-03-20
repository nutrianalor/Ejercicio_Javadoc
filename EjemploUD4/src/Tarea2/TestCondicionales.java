package Tarea2;

public class TestCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println(Condicionales.aprobado(7.5f));  // Debería imprimir "APROBADO"
	        System.out.println(Condicionales.aprobado(4.5f));  // Debería imprimir "SUSPENSO"

	        // Probar el método saldo
	        System.out.println(Condicionales.saldo(1000, 800));  // Debería imprimir "¡Enhorabuena!, te sobran 200.0€"
	        System.out.println(Condicionales.saldo(1000, 1200)); // Debería imprimir "¡Lo siento!, estás en números rojos"

	        // Probar el método parOimpar
	        System.out.println(Condicionales.parOimpar(4));  // Debería imprimir "PAR"
	        System.out.println(Condicionales.parOimpar(5));  // Debería imprimir "IMPAR"

	        // Probar el método mayor
	        Condicionales.mayor(10, 20);  // Debería imprimir "El mayor es: 20"
	        Condicionales.mayor(30, 30);  // Debería imprimir "Ambos son iguales"

	        // Probar el método dividir
	        System.out.println(Condicionales.dividir(10, 2));  // Debería devolver 5.0
	        System.out.println(Condicionales.dividir(10, 0));  // Debería imprimir "Error: No se puede dividir entre cero." y devolver 0
		
		
		
	}

}
