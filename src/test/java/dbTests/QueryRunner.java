package dbTests;

import java.sql.SQLException;

public class QueryRunner {

	public static void main(String[] args) throws SQLException {
	
		System.out.println("Running Sakila Queries");
		SakilaQueries.run();
				
		System.out.println("Running World Queries");
		WorldQueries.run();
		

	}

}
