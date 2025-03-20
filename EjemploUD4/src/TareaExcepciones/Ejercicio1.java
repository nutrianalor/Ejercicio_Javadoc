package TareaExcepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		try {
			metodo2();
		}catch(Exception e) {
			String mensaje=e.getMessage();
			System.out.println(mensaje);
		}

	}

	private static void metodo2() throws Exception {
		metodo3();
		
	}

	private static void metodo3() throws Exception{
		try {
			int=cuenta=10/0;
		}catch(ArithmeticException e)
		{
			String mensaje="Error: dividir por cero";
			System.out.println(mesaje);
		}
	}

}
