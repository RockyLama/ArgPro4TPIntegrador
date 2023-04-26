package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConexionBD {
	
	   // Ruta de nuestra base de datos
    private String servidor;// = "jdbc:mysql://localhost:3306/";
    private String DBname;//="argentina2023";
 // Nuestra librería mysql
    private String driver;// = "com.mysql.jdbc.Driver";
    // Nombre de usuario de mysql
    private String username;// = "root";
    // Clave de usuario de mysql
    private String password;// = "crac";
    
    
    ConexionBD(){
    	Properties properties = new Properties();
    	try {
    		properties.load(new FileInputStream(new File("ConexString.properties")));
    		this.servidor= (String) properties.get("servidor");
    		this.DBname= (String) properties.get("DBname");
    		this.driver= (String) properties.get("driver");
    		this.username= (String) properties.get("username");
    		this.password= (String) properties.get("password");
    	}catch (FileNotFoundException e) {
    		e.printStackTrace();
    	}catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    }

}
