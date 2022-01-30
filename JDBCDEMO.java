package jdbcdemo;
import java.sql.*;
public class JDBCDEMO {

	
	public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/employee";
	String username ="root";
	String password = "root";
	Connection con = DriverManager.getConnection(url, username, password);
	if(con!=null)
	   System.out.print("connection established");	
	}

}
