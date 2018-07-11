import java.sql.*;
public class Jdbc1
{
	public static void main(String ar[])
	{
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ravi","root","root");
		System.out.println("Connected");
		int id=7300;String name="Ravi";
		String st="select * from student where stid=? or student=?";
		//String st="select student,stclass,stid from student";//String st="select * from student";
		
		PreparedStatement ps=con.prepareStatement(st);
		ps.setInt(1,id);
		ps.setString(2,name);
		
		ResultSet rs=ps.executeQuery();
		/*while(rs.next())
		{
		/*System.out.println("Id="+rs.getInt(3));
		System.out.println("Name="+rs.getString(1));
		System.out.println("Class="+rs.getString(2));*/
		while(rs.next())
		{
		System.out.println("Id="+rs.getInt("stid"));
		System.out.println("Name="+rs.getString(2));
		System.out.println("Class="+rs.getString("stclass"));
		System.out.println("Subject1="+rs.getInt(4));
		System.out.println("Subject2="+rs.getInt("marks2"));
		System.out.println("Subject3="+rs.getInt(6));
		}
		}
		
		
		catch(ClassNotFoundException|SQLException se)
		{
		se.printStackTrace();
		}
	}
}
