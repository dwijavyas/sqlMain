package db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBManager {

	public static Connection getConnection(String dbName) {
		
		Connection conn = null;
		
		try {
			
			String propFileName = "/config.db_"+dbName+".properties"; 
			FileInputStream fis = new FileInputStream(propFileName);
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
