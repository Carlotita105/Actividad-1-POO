package com.cursoCeat;

public class Tren {

	
	Locomotora locomotora;
	Vagon vagones [];
	Maquinista resonsable;
	private int numVagones; //número de vagones que forman el tren
	public Tren(Locomotora locomotora, Maquinista resonsable) {
		this.locomotora = locomotora;
		this.resonsable = resonsable;
		vagones= new Vagon[5]; //creamos la tabña de tamaño 5, pero no se
							  // crea ningún objeto tipo vagón
		numVagones=0; //por ahora no hay vagones enganchados al tren
	}
	
	public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
		if (numVagones >=5) {
			System.out.println("El tren no admite más vagones");
		}else {
			Vagon vagon= new Vagon(numVagones, cargaMax, cargaActual, mercancia);
			numVagones++; //ahora tenemos un vagón más enganchado al tren
		}
	}
	
}
