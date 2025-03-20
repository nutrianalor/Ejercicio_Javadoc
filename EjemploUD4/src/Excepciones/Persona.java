package Excepciones;

public class Persona {

	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int e) throws Exception {
		// Lanzar excepción cuando la edad sea inferior o igual a 0
		if (e <= 0)
			throw new Exception("La edad debe ser positiva");
		edad = e;
	}

}
