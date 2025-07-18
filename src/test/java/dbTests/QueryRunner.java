package dbTests;

import java.sql.SQLException;

public class QueryRunner {

	public static void main(String[] args) throws SQLException {
	
		System.out.println("Running Sakila Queries");
		SakilaQueries.run();
				
		System.out.println("\n Running World Queries");
		WorldQueries.run();
		
		System.out.println("\n Running e2edbt Queries");
		E2EdbtQueries.run();
		
		

	}

}
