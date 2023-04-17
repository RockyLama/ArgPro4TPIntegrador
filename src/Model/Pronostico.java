package Model;

public class Pronostico {
    Equipo equipo1 = new Equipo();
    Equipo equipo2 = new Equipo();
    Partido partido = new Partido();
    ResultadoEnum resultadopro = new ResultadoEnum();
    Partido partidofinal = new Partido();

    public Pronostico() {
		super();
    }

    public Equipo getEquipo1() {
		return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
		return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
    }

    public Partido getPartido() {
		return partido;
    }

    public void setPartido(Partido partido) {
		this.partido = partido;
    }

    public ResultadoEnum getResultado() {
		return resultadopro;
    }

    public void setResultado(ResultadoEnum resultado) {
		this.resultadopro = resultado;
    }
    
    

    public Integer puntos() {
    	ResultadoEnum ResultadoPartido = new ResultadoEnum();
		ResultadoEnum ResultadoPronostico = new ResultadoEnum();
		int puntosPronostico = 0;
		
		if(ResultadoPartido == ResultadoPronostico) {
			puntosPronostico+=1;
		}
		
		System.out.println("Puntaje obtenido: " + puntosPronostico);
        return puntosPronostico;
    }

}
