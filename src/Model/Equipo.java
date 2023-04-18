package Model;

public class Equipo {
    String nombre;
    String gol;
  
	
    
	public Equipo(String nombre, String gol) {
		super();
		this.nombre = nombre;
		this.gol = gol;
	}
	public String getNombre() {

		return nombre;
    }
    public void setNombre(String nombre) {

		this.nombre = nombre;
    }

    public String getGol() {
        return gol;
    }
    public void setGol(String descripcion) {

		this.gol = descripcion;
    }

}
