import java.sql.*;
public class MyConnection
{
	public static Connection con;
	static Connection getConnection()
	{
	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ravi","root","root");
			System.out.println("Connected");
		}
		catch(ClassNotFoundException|SQLException se)
	
		{
			se.printStackTrace();
		}
		return con;
	}
}
	