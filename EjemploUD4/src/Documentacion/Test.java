package Documentacion;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Juan",27);
		try {
			System.out.println(s.mostrarNota("h"));
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
