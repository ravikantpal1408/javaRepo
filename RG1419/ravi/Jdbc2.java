import java.sql.*;
public class Jdbc2
{
	public static void main(String ar[])
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ravi","root","root");
		System.out.println("Connected");
		int id =393,m1=97,m2=99,m3=98;
		String c="BCA",n="Sidharth";
		String st="insert into student (stid,marks1,marks2,marks3,student,stclass) values(?,?,?,?,?,?)";
		
		//String st="insert into student value(391,'Rashi','BCA',98,99,78)";
		//String st="insert into student(stid,student,stclass) value(397,'Shashi','BCA')";
		PreparedStatement ps=con.prepareStatement(st);
		ps.setInt(1,id);
		ps.setInt(2,m1);
		ps.setInt(3,m2);
		ps.setInt(4,m3);
		ps.setString(5,n);
		ps.setString(6,c);
		
		
		
		int x=ps.executeUpdate();
		System.out.println("Rows affected="+x);
		}
		catch(ClassNotFoundException|SQLException se)
		{
		se.printStackTrace();
		}
	}
}