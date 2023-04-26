package Model;

import java.util.ArrayList;

public class Ronda {
	public String nroRda;
	public int cant = 0;
	//public Partido partidos[] = new Partido[cant];
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

    public int getCant() {
		return cant;
    }

    public void setCant(int cant) {
		this.cant = cant;
    }


//para que es este metodo?
    public Integer puntos() {
        Integer puntos = 0;
        return puntos;

    }

}
