package jdbcdemo;
import java.sql.*;
public class JDBCDEMO {

	
	public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/employee";
	String username ="root";
	String password = "root";
	Connection con = DriverManager.getConnection(url, username, password);
	if(con!=null)
	   System.out.println("connection established");	
	
	Statement st = con.createStatement();
	int i = st.executeUpdate("insert into emp values(4,'michale','hyd',34000,'tester')");
	if(i != 0)
		System.out.print("Record Inserted!!");	
	
	}
	

}
