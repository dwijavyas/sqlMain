package db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBManager {

	public static Connection getConnection(String dbName) {
		
		Connection conn = null;
		
		try {
			
			String propFileName = "db_" + dbName + ".properties"; 
			InputStream fis = DBManager.class.getClassLoader().getResourceAsStream(propFileName);
			Properties prop = new Properties();
			prop.load(fis);
			
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			conn = DriverManager.getConnection(url, username, password);
			
			
		}
		
		catch(Exception e){
			
			e.printStackTrace();
						
		}
		
		return conn;
	
		

	}

}
