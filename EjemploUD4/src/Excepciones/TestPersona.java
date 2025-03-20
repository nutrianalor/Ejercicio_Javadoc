package Excepciones;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Persona persona = new Persona();
			persona.setEdad(-5);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
