package Model;

public class Ronda {
    private String nro;
    private int cant = 0;
    private Partido partidos[] = new Partido[cant];
    private String gane;

    public Ronda() {
		super();
    }

    public String getNro() {
		return nro;
    }

    public void setNro(String nro) {
		this.nro = nro;
    }

    public int getCant() {
		return cant;
    }

    public void setCant(int cant) {
		this.cant = cant;
    }

    public Partido[] getPartidos() {
		return partidos;
    }

    public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
    }

    public Integer puntos() {
        Integer puntos = 0;
        return puntos;

    }

}
