package Model;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		String rutaPartido="C:\\...";
		
		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
		
		ScannerClass(rutaPartido);
		
		String rutaPronostico="C:\\...";
		
		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
		
		ScannerClass(rutaPartido);
		ScannerClass(rutaPronostico);
		
		
		
	}
		
		public static void ScannerClass(String ruta)
		{
			int Line=1;
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
			
			Partido partidofinish = new Partido();
			
			Equipo equipo1Obj = new Equipo();
			equipo1Obj.setNombre(equipo1);
			Equipo equipo2Obj = new Equipo();
			equipo2Obj.setNombre(equipo2);
			
			partidofinish.golesEquipo1=gol1;
			partidofinish.golesEquipo2=gol2;
			
			partidofinish.resultado(equipo1Obj, gol1, gol2);
			
			System.out.println("resultdo obtenido: " + partidofinish);
			
			Line+=1;
			
		}
		
			}
			catch (IOException e) {
				e.printStackTrace();
				}

		}
		
		
				
		
		
		}

