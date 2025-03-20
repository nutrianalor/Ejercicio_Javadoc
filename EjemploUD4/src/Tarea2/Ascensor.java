package Tarea2;

public class Ascensor {

	
		private boolean puerta;
		private int piso;
		
		public Ascensor() {
			System.out.println("Ascensor creado.");
		}
		
		public Ascensor(boolean estado, int planta) {
			puerta=estado;
			piso=planta;
			System.out.println("Ascensor con puerta "+puerta+" y en el piso "+piso+" creado.");
		}
		public void abrirPuerta() {
			puerta=true;
		}
		
		private void cerrarPuerta() {
			puerta=false;
		}
		
		public void subir() {
			if(dondeEstas()<10)
				piso++;
		}
		
		public void bajar() {
			if(dondeEstas()>0)
				piso--;
		}
		
		public void irAPiso(int planta) {
			if(planta>=0&& planta<=10)
				piso=planta;
			System.out.println("Ascensor en planta "+piso);
		}
		
		
		public int dondeEstas() {
			return piso;
		}
		

}
