package vn.edu.vnuk.airlines.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class Sql5010InsertIntoUsers {

	private final Connection connection;
	private final String sqlQuery;
	
	public Sql5010InsertIntoUsers(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "INSERT INTO users (user_type_id,last_name,middle_name,first_name,date_of_birth,address,email,phone number,identification_type_id,identification_nummber,password) "
				+ 	"values"
				+ 	"('2,Đa Minh, Văn , Nguyen, 1989.12.23.,An Thuong 3. Da Nang, xcl@xyc.vn,+842134125,1,JGD1234, Nguyen123'),"
				+ 	"('2,Gioan , Công, Thanh, 1989.12.23.,An Thuong 6. Da Nang, xcl@xyc.vn,+842134125,1,ASD1234, Quang123'),"
				+ 	"('2,Thanh Diêu, Quang , Anh, 1989.12.23.,An Thuong 43. Da Nang, xcl@xyc.vn,+842134125,1,GDC1234, Pho123')"
				+ 	"('2,Công Tăng, Thành,  Nhung, 1989.12.23.,An Thuong 12. Da Nang, xcl@xyc.vn,+842134125,1,KJH1234, Bon123'),"
				+ 	"('2,Lê Minh, Hữu, Phuong,1989.12.23.,An Thuong 56. Da Nang, xcl@xyc.vn,+842134125,1,QWE1234, Random123'),"
				+ 	"('2,Biển Đức, Công, Ngoc, 1989.12.23.,An Thuong 4. Da Nang, xcl@xyc.vn,+842134125,1,DSA1234, Macron123'),"
				+ 	"('1,Mạc Ty Nho, Văn, Giang, 1989.12.23.,An Thuong 1. Da Nang, xcl@xyc.vn,+842134125,1,YXC1234, Duna123'),"
				+ 	"('1,Giuse, Thành, Binh,1989.12.23.,An Thuong 25. Da Nang, xcl@xyc.vn,+842134125,1, CVB1234, Front123')"
				+	";"
				;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql5010InsertIntoUsers started");

		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DATA successfully loaded in \'users\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql5010InsertIntoUsers ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
