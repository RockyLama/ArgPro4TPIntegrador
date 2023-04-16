package Model;

public class Partido {
    private int golesEquipo1;
    private int golesEquipo2;
    private Equipo equipo1 = new Equipo();
    private Equipo equipo2 = new Equipo();

    public Partido() {
        super();
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
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
    //*********************************
// Optimozar codigo
    //*************************************
    
    public ResultadoEnum resultado(Equipo equipo1) {
    	if(golesEquipo1 > golesEquipo2) {
    		ResultadoEnum Resultado = new ResultadoEnum();
    		Resultado.getGanador();   		
    	}
    	else if(golesEquipo1 < golesEquipo2){
    		ResultadoEnum Resultado = new ResultadoEnum();
    		Resultado.getPerdedor();   		
    	}
    	else if(golesEquipo1 == golesEquipo2){
    		ResultadoEnum Resultado = new ResultadoEnum();
    		Resultado.getEmpate();
		}
    	  return resultado(equipo1);   
    }

}
