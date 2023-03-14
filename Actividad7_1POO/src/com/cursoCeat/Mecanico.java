package com.cursoCeat;

public class Mecanico {
	
	String nombre;
	String telefono;
	enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR} //ENUMERADO
	Especialidad especialidad;
	public Mecanico(String nombre, String telefono, Especialidad especialidad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}
	
	
	

}
