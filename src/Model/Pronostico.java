package Model;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Pronostico {
	public int id;
	public String golesEquipo1Usuario;
	public String golesEquipo2Usuario;
	public String nombreEquipo1Usuario;
	public String nombreEquipo2Usuario;
	private Equipo equipo1Usuario; // = new Equipo(nombreEquipo1, golesEquipo1);
	private Equipo equipo2Usuario; // = new Equipo(nombreEquipo2, golesEquipo2);
	//private Partido partidoUsuario; // = new Partido();
	private ResultadoEnum resultadoproUsuario; // = new ResultadoEnum();
	// private Partido partidofinal = new Partido();
	//ArrayList<Pronostico> pronosticos; // = new ArrayList<>();

	public Pronostico() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGolesEquipo1Usuario() {
		return golesEquipo1Usuario;
	}
	public void setGolesEquipo1Usuario(String golesEquipo1Usuario) {
		this.golesEquipo1Usuario = golesEquipo1Usuario;
	}
	public String getGolesEquipo2Usuario() {
		return golesEquipo2Usuario;
	}
	public void setGolesEquipo2Usuario(String golesEquipo2Usuario) {
		this.golesEquipo2Usuario = golesEquipo2Usuario;
	}
	public String getNombreEquipo1Usuario() {
		return nombreEquipo1Usuario;
	}
	public void setNombreEquipo1Usuario(String nombreEquipo1Usuario) {
		this.nombreEquipo1Usuario = nombreEquipo1Usuario;
	}
	public String getNombreEquipo2Usuario() {
		return nombreEquipo2Usuario;
	}
	public void setNombreEquipo2Usuario(String nombreEquipo2Usuario) {
		this.nombreEquipo2Usuario = nombreEquipo2Usuario;
	}
	public Equipo getEquipo1Usuario() {
		return equipo1Usuario;
	}
	public void setEquipo1Usuario(Equipo equipo1Usuario) {
		this.equipo1Usuario = equipo1Usuario;
	}
	public Equipo getEquipo2Usuario() {
		return equipo2Usuario;
	}
	public void setEquipo2Usuario(Equipo equipo2Usuario) {
		this.equipo2Usuario = equipo2Usuario;
	}
	/*public Partido getPartidoUsuario() {
		return partidoUsuario;
	}
	public void setPartidoUsuario(Partido partidoUsuario) {
		this.partidoUsuario = partidoUsuario;
	}*/
	public ResultadoEnum getResultadoproUsuario() {
		return resultadoproUsuario;
	}
	public void setResultadoproUsuario(ResultadoEnum resultadoproUsuario) {
		this.resultadoproUsuario = resultadoproUsuario;
	}
	
	
	public ResultadoEnum resultado (String golesEquipo1Usuario, String golesEquipo2Usuario) {
		int G1 = Integer.parseInt(golesEquipo1Usuario);
    	int G2 = Integer.parseInt(golesEquipo2Usuario);
		if (G1==G2) {
			resultadoproUsuario.empate = ResultadoEnum.getEmpate();
		} else if (G1>G2){
			resultadoproUsuario.ganador = ResultadoEnum.getGanador();
		} else if (G1<G2){
			resultadoproUsuario.perdedor = ResultadoEnum.getPerdedor();
		}
		return resultadoproUsuario;
	}


	public Integer puntos(ResultadoEnum ResultadoPartido, ResultadoEnum ResultadoPronostico) {

		int puntosPronostico = 0;
		if (ResultadoPartido == ResultadoPronostico) {
			puntosPronostico += 1;
		}
		System.out.println("Puntaje obtenido: " + puntosPronostico);
		return puntosPronostico;
	}

	public ArrayList<Pronostico> leerArchivoUsuario(String ruta) {
		
		ArrayList<Pronostico> pronosticos = new ArrayList<>();
		
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

				Equipo equipo1Usuario = new Equipo(equipo1, gol1);
				equipo1Usuario.setNombre(equipo1);
				equipo1Usuario.setGol(gol1);

				// equipos.add(equipo1Obj);

				Equipo equipo2Usuario = new Equipo(equipo2, gol2);
				equipo2Usuario.setNombre(equipo2);
				equipo2Usuario.setGol(gol2);

				// equipos.add(equipo2Obj);

				Pronostico partidofinish = new Pronostico();
				partidofinish.setId(id);
				partidofinish.setEquipo1Usuario(equipo1Usuario);
				partidofinish.setEquipo2Usuario(equipo2Usuario);
				partidofinish.resultado(gol1, gol2);

				pronosticos.add(partidofinish);

				id += 1;
				
				

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return pronosticos;
	}

	public void SelectPronostico(ArrayList<Pronostico> pronosticos) {
		System.out.println("****************** PRONOSTICOS *******************");				
		for (int i= 0; i<pronosticos.size(); i++) {
			System.out.println(" Equipo1: " + pronosticos.get(i).getNombreEquipo1Usuario() + "\n Goles equipo1: " + pronosticos.get(i).getGolesEquipo1Usuario()
					+ "\n Equipo2: " + pronosticos.get(i).getGolesEquipo2Usuario() + "\n Goles equipo2: " + pronosticos.get(i).getGolesEquipo2Usuario() 
					/*+ "\nResultado: " + p.resultado(p.getGolesEquipo1Usuario(), p.getGolesEquipo2Usuario())*/);
		}
	}

}
