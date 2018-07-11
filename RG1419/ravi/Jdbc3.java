import java.sql.*;
public class Jdbc3
{
	public static void main(String ar[])
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ravi","root","root");
		System.out.println("Connected");
		int id =393,m=0;
		
		String c="M Tech";
		String st="update student set stclass=?,marks1=?,marks2=?,marks3=? where stid=?";
		PreparedStatement ps=con.prepareStatement(st);
		ps.setString(1,c);
		ps.setInt(2,m);
		ps.setInt(3,m);
		ps.setInt(4,m);
		ps.setInt(5,id);
		int x=ps.executeUpdate();
		System.out.println(x);
		/*String st= "insert into student(stid,stclass,student) values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(st);
		ps.setInt(1,9018);
		ps.setString(2,"Class 1");
		ps.setString(3,"Name 1");
		ps.addBatch();
		ps.setString(2,"Class 2");
		ps.setString(3,"Name 2");
		ps.setInt(1,9015);
		ps.addBatch();
		ps.setInt(1,9016);
		ps.setString(2,"Class 3");
		ps.setString(3,"Name 3");
		ps.addBatch();
		int x[]=ps.executeBatch();
		System.out.println(x.length);

		*/
		}
		catch(ClassNotFoundException|SQLException se)
		{
		se.printStackTrace();
		}
	}
}