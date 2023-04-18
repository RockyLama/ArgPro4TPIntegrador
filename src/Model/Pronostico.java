package Model;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Pronostico {
	
	public String golesEquipo1;
    public String golesEquipo2;
    public String nombreEquipo1;
    public String nombreEquipo2; 
    private Equipo equipo1 = new Equipo(nombreEquipo1, golesEquipo1);
    private Equipo equipo2 = new Equipo(nombreEquipo2, golesEquipo2);
    private Partido partido = new Partido();
    private ResultadoEnum resultadopro = new ResultadoEnum();
    private Partido partidofinal = new Partido();
    ArrayList<Partido> pronosticos = new ArrayList<>();

    public Pronostico() {
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

    public Partido getPartido() {
		return partido;
	}

    public void setPartido(Partido partido) {
		this.partido = partido;
	}

    public ResultadoEnum getResultadopro() {
		return resultadopro;
	}

    public void setResultadopro(ResultadoEnum resultadopro) {
		this.resultadopro = resultadopro;
	}

    public Partido getPartidofinal() {
		return partidofinal;
	}

    public void setPartidofinal(Partido partidofinal) {
		this.partidofinal = partidofinal;
	}
    
    
    
    
    
   /* public ArrayList<Partido> leerArchivo_usuario(String archivo) {
    	
    	
    	
    	
    	return pronosticos;
    	
    }*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

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
