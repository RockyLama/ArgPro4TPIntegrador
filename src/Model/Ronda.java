package Model;

import java.util.ArrayList;

public class Ronda {
	public String nroRda;
	public String descripcion;
	// public Partido partidos[] = new Partido[cant];
	public ArrayList<Pronostico> rondaPronosticos = new ArrayList<>();

	public Ronda() {
		super();
	}

	public ArrayList<Pronostico> getRondaPronosticos() {
		return rondaPronosticos;
	}

	public void setRondaPronosticos(ArrayList<Pronostico> rondaPronosticos) {
		this.rondaPronosticos = rondaPronosticos;
	}

	public String getNroRda() {
		return nroRda;
	}

	public void setNroRda(String nroRda) {
		this.nroRda = nroRda;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// para que es este metodo?
	public Integer puntos() {
		Integer puntos = 0;
		return puntos;

	}

}
