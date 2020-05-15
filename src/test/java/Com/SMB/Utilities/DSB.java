package Com.SMB.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import com.mysql.cj.api.jdbc.Statement;

public class DSB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

         Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Class found");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_hr", "root", "jabed");
		java.sql.Statement stmt = con.createStatement();
		//ResultSet rs=stmt.executeQuery("select * from employees where employee_id=\"33391\";");
		ResultSet rs=stmt.executeQuery("select employee_id from employees ;");
		while(rs.next()) {
			String st=rs.getString(1);
			System.out.println(st);
			
			
			
		}
		//System.out.println(rs.);
	}
		
	}


