package Model;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String rutaPartido = "C:\\Users\\lamad\\git\\ArgPro4TPIntegrador\\Partidos.txt";

		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
		
		Partido partido = new Partido();
		ArrayList<Partido> totalPartidos = partido.leerArchivo(rutaPartido);
		partido.SelectPartido(totalPartidos);


		String rutaPronostico = "C:\\Users\\lamad\\git\\ArgPro4TPIntegrador\\Pronosticos.txt";

		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");

		Pronostico pronosticos = new Pronostico();
		ArrayList<Pronostico> totalPronosticos = pronosticos.leerArchivoUsuario(rutaPronostico);
		pronosticos.SelectPronostico(totalPronosticos);
		int puntosPronostico = 0;
		for (int i= 0; i<totalPronosticos.size(); i++) {
			puntos(totalPartidos.get(i).getfinalPartido(), totalPronosticos.get(i).getResultadoproUsuario()
					, puntosPronostico);
			}
		System.out.println("Puntaje obtenido: " + puntosPronostico);
		
		/*for(int i= 0; i<totalPronosticos.size(); i++) {
			}*/
	}
	public static Integer puntos(ResultadoEnum ResultadoPartido, ResultadoEnum ResultadoPronostico/*, ArrayList<Pronostico> pronosticos*/, int puntosPronostico) {
		//for (int i= 0; i<pronosticos.size(); i++) {
		
			if (ResultadoPartido.equals(ResultadoPronostico)) {
			puntosPronostico += 1;
		}
		return puntosPronostico;
	}

}
