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
		//int puntosPronostico = 0;
		for (int i= 0; i<totalPronosticos.size(); i++) {
			puntos(totalPartidos, totalPronosticos);
			}
		System.out.println("Puntaje obtenido: " + puntos(totalPartidos, totalPronosticos));
		
		/*for(int i= 0; i<totalPronosticos.size(); i++) {
			}*/
	}
	public static Integer puntos(ArrayList<Partido> totalPartidos,ArrayList<Pronostico> totalPronosticos) {
		int puntosPronostico = 0;
		for (int i= 0; i<totalPartidos.size(); i++) {
		
			if (totalPartidos.get(i).finalPartido.estado.equals(totalPronosticos.get(i).resultadoproUsuario.estado)) {
			puntosPronostico += 1;
		}
		
	}
	return puntosPronostico;
	}

}
