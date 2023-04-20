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
		/*ArrayList<Partido> totalPartido = */;
		partido.SelectPartido(partido.leerArchivo(rutaPartido));


		String rutaPronostico = "C:\\Users\\lamad\\git\\ArgPro4TPIntegrador\\Pronosticos.txt";

		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");

		Pronostico pronosticos = new Pronostico();
		ArrayList<Pronostico> totalPronosticos = pronosticos.leerArchivoUsuario(rutaPronostico);
		pronosticos.SelectPronostico(totalPronosticos);
		
		/*for(int i= 0; i<totalPronosticos.size(); i++) {
			pronosticos.puntos(partido.resultado(partido.getGolesEquipo1(), partido.getGolesEquipo2()),
					pronosticos.resultado(pronosticos.getGolesEquipo1Usuario(), pronosticos.getGolesEquipo2Usuario()));
		}*/
		

	}

}
