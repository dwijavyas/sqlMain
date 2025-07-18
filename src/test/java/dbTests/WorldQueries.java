package dbTests;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBManager;

public class WorldQueries {

	public static void run() throws SQLException {
		
		
		try {
		Connection conn =DBManager.getConnection("world");
		Statement s = conn.createStatement();
		
		
		System.out.println("\n-- World: Top 5 populated cities --");
		String query1 = "SELECT Name, Population FROM city ORDER BY Population DESC LIMIT 5";
		ResultSet rs1 = s.executeQuery(query1);
		
		while(rs1.next()) {
			
			System.out.println("City: "+rs1.getString("Name")+"Population: "+rs1.getInt("Population"));
						
		}
		
		
		System.out.println("\n-- World: Countries in Asia --");
		String query2 = "SELECT Name, Region FROM country WHERE Region LIKE '%Asia%' LIMIT 5";
		ResultSet rs2 = s.executeQuery(query2);
		
		while(rs2.next()) {
			
			System.out.println(rs2.getString("Name")+ " " + rs2.getString("Region"));
			
		}
		
		conn.close();
		
	}
	catch(Exception e) {
		
		
		e.printStackTrace();
	}

}}
