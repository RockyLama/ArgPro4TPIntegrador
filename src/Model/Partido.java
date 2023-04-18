package Model;

public class Partido {
    public String golesEquipo1;
    public String golesEquipo2;
    public String nombreEquipo1;
    public String nombreEquipo2;    
    private Equipo equipo1 = new Equipo(nombreEquipo1, golesEquipo1);
    private Equipo equipo2 = new Equipo(nombreEquipo2, golesEquipo2);

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


	public String getNombreEquipo1() {
		return nombreEquipo1;
	}


	public void setNombreEquipo1(String nombreEquipo1) {
		this.nombreEquipo1 = nombreEquipo1;
	}


	public String getNombreEquipo2() {
		return nombreEquipo2;
	}


	public void setNombreEquipo2(String nombreEquipo2) {
		this.nombreEquipo2 = nombreEquipo2;
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
    
    
    


	public String resultado(Equipo equipo1, Equipo equipo2) {
    	int G1 = Integer.parseInt(equipo1.getGol());
    	int G2 = Integer.parseInt(equipo2.getGol());
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
    	  return Resultado.toString();   
    }
    
    
    
    /*
    public String resultado(Equipo equipo1, String golesEquipo1, String golesEquipo2) {
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
    	  return Resultado.toString();   
    }*/

}
