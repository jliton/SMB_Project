package Com.SMB.Utilities;

import org.testng.annotations.Test;

public class DbconnectionHelp {

	public static void main(String[] args) throws ClassNotFoundException {
		
	
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Class found");
		
	}
}
