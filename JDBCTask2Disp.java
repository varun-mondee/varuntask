package jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class JDBCTask2Disp {
	static int disp(int n) throws Exception{
		
		
		Scanner scan = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username ="root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		char c=' ';
		while(c != 'n') {
		int eid = 0, esal = 0;
		
		if(n==1) {
		System.out.println("insert:");
		PreparedStatement ps = con.prepareStatement("insert into emp2 values(?,?,?)");
		System.out.println("Enter eid:");
		eid = scan.nextInt();
		System.out.println("Enter ename:");
		scan.nextLine();
		String ename = scan.nextLine();
		System.out.println("Enter esal:");			
		esal = scan.nextInt();
		ps.setInt(1, eid);
		ps.setString(2, ename);
		ps.setInt(3, esal);
		ps.executeUpdate();}
		else if(n == 2) {
			PreparedStatement x = con.prepareStatement("update emp2 set sal = ?  where eid<= ?");
			System.out.println("esal");
			esal = scan.nextInt();
			System.out.println("eid");
			eid = scan.nextInt();		
			x.setInt(1,esal);
			x.setInt(2,eid);
			x.executeUpdate();
			
		}
		else if(n==4) {
			
			ResultSet rs = st.executeQuery("select *from emp2");	
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString("ename")+" "+rs.getInt(3));
		}
		else if(n==3) {
			PreparedStatement x = con.prepareStatement("delete from emp2 where eid = ?");
			System.out.println("Enter eid:");
			eid = scan.nextInt();
			x.setInt(1, eid);
			x.executeUpdate();
		}
		System.out.println("Enter y/n");
		c = scan.next().charAt(0);
		
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
