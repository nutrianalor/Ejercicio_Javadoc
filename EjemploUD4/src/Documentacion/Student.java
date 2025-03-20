package Documentacion;

// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */
public class Student {

	/** The nombre. */
	private String nombre;

	/** The edad. */
	private int edad;

	/**
	 * Instantiates a new student.
	 */
	public Student() {
		super();
	}

	/**
	 * Instantiates a new student.
	 *
	 * @param nombre the nombre
	 * @param edad   the edad
	 */
	public Student(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Método que según la edad del alumno muestre si es niño,
	// adolescente o adulto con if-else
	// Cuando la edad es menor que 15 es niño, cuando es menor
	// que 20 adolescente, y sino adulto

	/**
	 * Mostrar edad.
	 */
	public void mostrarEdad() {
		if (edad < 15)
			System.out.println("Es un niño");
		else if (edad < 20)
			System.out.println("Es un adolescente");
		else
			System.out.println("Es un adulto");

	}

	// Método que recibe una nota de 1 a 10 con un parámetro de
	// tipo String convierte esa nota a int (cuidado con
	// excepciones) y devuelve una cadena indicando el nombre del
	// alumno y si ha aprobado o suspendido (itilizar para ello
	// switch-case)

	/**
	 * Mostrar nota.
	 *
	 * @param nota the nota
	 * @exception Exception type data
	 * @return the string
	 */
	public String mostrarNota(String nota) throws Exception {

		int n = Integer.parseInt(nota);
		String result = nombre + " ";
		switch (n) {
		case 1, 2, 3, 4:
			result += " Error";
			break;
		default:
			result += " No es válido";
			break;
		}
		return result;

	}

}
