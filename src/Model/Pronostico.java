package Model;

public class Pronostico {
	Equipo equipo1= new Equipo();
	Equipo equipo2= new Equipo();
	Partido partido= new Partido();
	ResultadoEnum resultado = new ResultadoEnum();
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
		return resultado;
	}
	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}
	
	public Integer puntos() {
		Integer puntos = 0;
		return puntos;
		
	}

}
