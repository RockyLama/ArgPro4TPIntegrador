package Model;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Partido {

	public int id;
	public String golesEquipo1;
	public String golesEquipo2;
	public String nombreEquipo1;
	public String nombreEquipo2;
	public Equipo equipo1; // = new Equipo(nombreEquipo1, golesEquipo1);
	public Equipo equipo2; // = new Equipo(nombreEquipo2, golesEquipo2);
	public ResultadoEnum finalPartido = new ResultadoEnum();

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

	public ResultadoEnum getfinalPartido() {
		return finalPartido;
	}

	public void setfinalPartido(ResultadoEnum finalPartido) {
		this.finalPartido = finalPartido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ResultadoEnum resultado(String golesEquipo1, String golesEquipo2) {
		int G1 = Integer.parseInt(golesEquipo1);
		int G2 = Integer.parseInt(golesEquipo2);
		String Empato = "Empato";
		String Perdio = "Perdio";
		String Gano = "Gano";
		
		if (G1 == G2) {
			finalPartido.setEstado(Empato);
		} else if (G1 > G2) {
			finalPartido.setEstado(Gano);
		} else if (G1 < G2) {
			finalPartido.setEstado(Perdio);
		}
		return finalPartido;
	}

	/*
	 * public String resultado(Equipo equipo1, Equipo equipo2) { int G1 =
	 * Integer.parseInt(equipo1.getGol()); int G2 =
	 * Integer.parseInt(equipo2.getGol()); ResultadoEnum Resultado = new
	 * ResultadoEnum();
	 * 
	 * if(G1 > G2) { Resultado.getGanador(); } else if(G1 < G2){
	 * Resultado.getPerdedor(); } else{ Resultado.getEmpate(); } return
	 * Resultado.toString(); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public String resultado(Equipo equipo1, String golesEquipo1, String
	 * golesEquipo2) { int G1 = Integer.parseInt(golesEquipo1); int G2 =
	 * Integer.parseInt(golesEquipo2); ResultadoEnum Resultado = new
	 * ResultadoEnum();
	 * 
	 * if(G1 > G2) { Resultado.getGanador(); } else if(G1 < G2){
	 * Resultado.getPerdedor(); } else{ Resultado.getEmpate(); } return
	 * Resultado.toString(); }
	 */

	public ArrayList<Partido> leerArchivo(String ruta) {
		ArrayList<Partido> partidos = new ArrayList<>();

		int id;
		String equipo1;
		String gol1;
		String equipo2;
		String gol2;

		File file = new File(ruta);

		try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
			while (sc.hasNextLine()) {
				String[] VectorString = (sc.nextLine()).split(";");

				id = 1;
				equipo1 = VectorString[0];
				equipo2 = VectorString[1];
				gol1 = VectorString[2];
				gol2 = VectorString[3];

				Equipo equipo1Obj = new Equipo(equipo1, gol1);
				equipo1Obj.setNombre(equipo1);
				equipo1Obj.setGol(gol1);
				



				Equipo equipo2Obj = new Equipo(equipo2, gol2);
				equipo2Obj.setNombre(equipo2);
				equipo2Obj.setGol(gol2);



				Partido partidofinish = new Partido();
				partidofinish.setId(id);
				partidofinish.setEquipo1(equipo1Obj);
				partidofinish.setEquipo2(equipo2Obj);
				partidofinish.resultado(gol1, gol2);
				

				partidos.add(partidofinish);
				
				

				id += 1;

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return partidos;
	}

	public void SelectPartido(ArrayList<Partido> partidos){
		System.out.println("****************** PARTIDOS *******************");
		for(int i= 0; i<partidos.size(); i++) {
			
			System.out.println(" Equipo1: " + partidos.get(i).equipo1.nombre + "\n Goles equipo1: " + partidos.get(i).equipo1.gol
					+ "\n Equipo2: " + partidos.get(i).equipo2.nombre + "\n Goles equipo2: " + partidos.get(i).equipo2.gol 
					+ "\n Resultado: " + partidos.get(i).finalPartido.estado + " " + partidos.get(i).equipo1.nombre);
			
			
			System.out.println("******************------------------*******************");
			System.out.println("******************------------------*******************");
		}
	
	
}

}
