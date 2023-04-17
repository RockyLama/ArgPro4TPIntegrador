package Model;

public class Partido {
    public String golesEquipo1;
    public String golesEquipo2;
    private Equipo equipo1 = new Equipo();
    private Equipo equipo2 = new Equipo();
    private Equipo equipo4 = new Equipo();

    public Partido() {
        super();
    }

    public String getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(String golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public String getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(String golesEquipo2) {
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
    
    public ResultadoEnum resultado(Equipo equipo1, String golesEquipo1, String golesEquipo2) {
    	int G1 = Integer.parseInt(golesEquipo1);
    	int G2 = Integer.parseInt(golesEquipo2);
    	ResultadoEnum Resultado = new ResultadoEnum();
    	
    	if(G1 > G2) {
    		Resultado.getGanador();   		
    	}
    	else if(G1 < G2){
    		Resultado.getPerdedor();   		
    	}
    	else{
    		Resultado.getEmpate();
		}
    	  return Resultado;   
    }

}
