package dbTests;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DBManager;

public class SakilaQueries {

		
		public static void run() {
			
			try {
				
				Connection conn = DBManager.getConnection("sakila");
				Statement st = conn.createStatement();
				
				System.out.println("\n-- Sakila: Top 3 most rented movies --");
				String query1 = "SELECT film_id, COUNT(rental_id) AS total_rentals" 
						+ " FROM rental JOIN inventory USING(inventory_id)"
						+ " GROUP BY film_id ORDER BY total_rentals DESC LIMIT 3";
				
				ResultSet rs1 = st.executeQuery(query1);
				
				while (rs1.next()){
					
					System.out.println("Film_Id: "+rs1.getInt("film_id") + "Rentals: "+ rs1.getInt("total_rentals"));
					
				}
				
				
				System.out.println("\n-- Sakila: Customers from Store 1 --");
				String query2 = "SELECT first_name, last_name FROM customer WHERE store_id = 1 LIMIT 5";
				ResultSet rs2 = st.executeQuery(query2);
				
				while(rs2.next()) {
					
					System.out.println(rs2.getString("first_name")+" "+rs2.getString("last_name"));
					
				}
					
				conn.close();
			}
			catch(Exception e){
				
				e.printStackTrace();
				
				
			}		
			
		}
		
		
		

	}


