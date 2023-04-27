package Model;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void conexionBD(int Operacion) {
			try {
				ConexionBD conn = new ConexionBD();
				Connection conexion = conn.getConnection();
				if(Operacion == 1) {
					ResultSet partido= SelectPartido(conexion);
					while(partido.next()) {
						System.out.println(partido.getRow() + "| " + partido.getString("nombreEquipo1") + "| " + partido.getString("nombreEquipo2") + "| " + partido.getString("golesEquipo1") + "| " + partido.getString("golesEquipo2") + "| " + partido.getString("id_resultadoEnum") + "| " + partido.getString("id_ronda"));
					}
				}
				if(Operacion == 2) {
					ResultSet pronostico= SelectPronostico(conexion);
					while(pronostico.next()) {
						
						System.out.println(pronostico.getRow() + "| " + pronostico.getString("nombreEquipo1Usuario") + "| " + pronostico.getString("nombreEquipo2Usuario") + "| " + pronostico.getString("golesEquipo1Usuario") + "| " + pronostico.getString("golesEquipo2Usuario") + "| " + pronostico.getString("id_resultadoEnumUsuario") + "| " + pronostico.getString("id_ronda"));
						
					}
					CalcularPuntaje(conexion);
					}
				if(Operacion == 3) {
								
				}
				
			}catch (Exception e){
				System.out.println("Error!" + e);
			}
		}
	
	public static ResultSet SelectPartido(Connection conn) {
		ResultSet partido = null;
		try {
			String Selectquery = "select * from partido";
			Statement st = conn.createStatement();
			return partido = st.executeQuery(Selectquery);
		} catch (SQLException e) {
			System.out.println("Error!, Metodo SelectTablas");
		}
		return partido;	
	}
	
	public static ResultSet SelectPronostico(Connection conn) {
		ResultSet pronostico = null;
		try {
			String Selectquery = "select * from pronostico";
			Statement st = conn.createStatement();
			return pronostico = st.executeQuery(Selectquery);
		} catch (SQLException e) {
			System.out.println("Error!, Metodo SelectTablas");
		}
		return pronostico;	
	}
	
	public static void CalcularPuntaje(Connection conn) {
		ResultSet pronostico = null;
		ResultSet partido = null;
		//String UpdatePuntaje="";
		int puntos = 0;
		int cont =0;
		try {
			String SelectqueryPronostico = "select * from pronostico";
			Statement stpro = conn.createStatement();
			pronostico = stpro.executeQuery(SelectqueryPronostico);
			
			String SelectqueryPartido = "select * from partido";
			Statement stpar = conn.createStatement();
			partido = stpar.executeQuery(SelectqueryPartido);
			
			while (/*pronostico.next() && */partido.next()) {
				while (pronostico.next()/* && partido.next()*/) {
				if(pronostico.getInt("id_resultadoEnumUsuario") == partido.getInt("id_resultadoEnum")) {
					puntos+=3;
				
				}
				
			}
				//System.out.println("El resultado del Pronostico es: " + puntos);	
			}
			System.out.println("El resultado del Pronostico es: " + puntos);
			
		} catch (SQLException e) {
			System.out.println("Error!, no se actualizo");
		}
	}
	

	public static void main(String[] args) {
		
		
		
		conexionBD(1);
		conexionBD(2);
		conexionBD(3);
		
        //////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		/*String rutaPartido = "C:\\Users\\lamad\\git\\ArgPro4TPIntegrador\\Partidos.txt";

		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
		
		Partido partido = new Partido();
		ArrayList<Partido> totalPartidos = partido.leerArchivo(rutaPartido);
		partido.SelectPartido(totalPartidos);


		String rutaPronostico = "C:\\Users\\lamad\\git\\ArgPro4TPIntegrador\\Pronosticos.txt";

		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");

		Pronostico pronosticos = new Pronostico();
		ArrayList<Pronostico> totalPronosticos = pronosticos.leerArchivoUsuario(rutaPronostico);
		pronosticos.SelectPronostico(totalPronosticos);*/
		///////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////
		/*for (int i= 0; i<totalPronosticos.size(); i++) {
			puntos(totalPartidos, totalPronosticos);
			}
		System.out.println("Puntaje obtenido: " + puntos(totalPartidos, totalPronosticos));
		
		/*for(int i= 0; i<totalPronosticos.size(); i++) {
			}*/
	}
	/*public static Integer puntos(ArrayList<Partido> totalPartidos,ArrayList<Pronostico> totalPronosticos) {
		int puntosPronostico = 0;
		for (int i= 0; i<totalPartidos.size(); i++) {
		
			if (totalPartidos.get(i).finalPartido.estado.equals(totalPronosticos.get(i).resultadoproUsuario.estado)) {
			puntosPronostico += 1;
		}
		
	}
	return puntosPronostico;
	}*/

}
