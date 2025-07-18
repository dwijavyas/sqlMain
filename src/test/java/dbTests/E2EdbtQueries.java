package dbTests;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBManager;

public class E2EdbtQueries {

	public static void run() throws SQLException {
		
		try {
		Connection conn = DBManager.getConnection("e2edbt");
		Statement s = conn.createStatement();
		
		System.out.println("\n === ALL RECORDS ===");
        ResultSet rs = s.executeQuery("SELECT * FROM test_customers");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("first_name") + " | " + rs.getString("email") + " | " + rs.getString("status"));
        }

        System.out.println("\n=== Inserting new record ===");
        s.executeUpdate("INSERT INTO test_customers(first_name, email) VALUES('alia', 'alia123@gmail.com')");

        System.out.println("\n=== Updating status ===");
        s.executeUpdate("UPDATE test_customers SET status='inactive' WHERE first_name='alia'");

        System.out.println("\n=== Deleting record ===");
        s.executeUpdate("DELETE FROM test_customers WHERE first_name='alia'");
        
        System.out.println("\n=== Updated Table ===");
        rs = s.executeQuery("SELECT * FROM test_customers");
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " | " + rs.getString("first_name") + " | " + rs.getString("email") + " | " + rs.getString("status"));
        }
		
		conn.close();
	}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}

}
