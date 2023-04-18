package Model;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		
		String rutaPartido="C:\\Users\\lamad\\git\\ArgPro4TPIntegrador\\Partidos.txt";
		
		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
		
		//ScannerClass(rutaPartido);
		
		String rutaPronostico="C:\\Users\\lamad\\git\\ArgPro4TPIntegrador\\Pronosticos.txt";
		
		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
		
		ArrayList<Partido> partidos = new  ArrayList<>();
				partidos.leerArchivo(rutaPartido);
		ArrayList<Partido> leerArchivo(rutaPronostico);
		
		ArrayList<Partido> pronosticos = new ArrayList<>();
		
	}
		
		public ArrayList<Partido> leerArchivo(String ruta){
			ArrayList<Partido> partidos = new ArrayList<>();
			//int Line=1;
			String equipo1;
			String gol1;
			String equipo2;
			String gol2;
			
			File file = new File(ruta);
			
			//Partido partidofinish = new Partido();
			
			try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
			{
			while (sc.hasNextLine()) 
			{
			String[] VectorString= (sc.nextLine()).split(";");
			
			equipo1=VectorString[0];
			equipo2=VectorString[1];
			gol1=VectorString[2];
			gol2=VectorString[3];
			
			
			Equipo equipo1Obj = new Equipo(equipo1, gol1);
			equipo1Obj.setNombre(equipo1);
			equipo1Obj.setGol(gol1);
			Equipo equipo2Obj = new Equipo(equipo2, gol2);
			equipo2Obj.setNombre(equipo2);
			equipo2Obj.setGol(gol2);
			
			Partido partidofinish = new Partido();
			partidofinish.setEquipo1(equipo1Obj);
			partidofinish.setEquipo2(equipo2Obj);
			
			partidofinish.resultado(equipo1Obj, equipo2Obj);
			
			partidos.add(partidofinish);
			
			
			/*String uno = partidofinish.resultado(equipo1Obj, equipo2Obj).toString();
			System.out.println("resultdo obtenido: " + uno);*/
			
			//Line+=1;
			
		}
		
			}
			catch (IOException e) {
				e.printStackTrace();
				}
			return partidos;
		}
		
		
				
		
		
		}

