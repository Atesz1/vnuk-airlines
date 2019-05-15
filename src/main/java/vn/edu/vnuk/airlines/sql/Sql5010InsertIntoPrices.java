package vn.edu.vnuk.airlines.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class Sql5010InsertIntoPrices {

	private final Connection connection;
	private final String sqlQuery;
	
	public Sql5010InsertIntoPrices(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "INSERT INTO prices (label) "
				+ 	"values"
				+ 	"('1.200.000'),"
				+ 	"('530.000'),"
				+ 	"('672.310'),"
				+ 	"('1.009.234'),"
				+ 	"('1.650.000'),"
				+ 	"('213.000'),"
				+	";"
				;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql5010InsertIntoPrices started");

		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DATA successfully loaded in \'prices\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql5010InsertIntoPrices ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
