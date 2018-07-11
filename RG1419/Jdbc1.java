public class Jdbc1
{
	public static void main(String ar[])
	{
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		}
		
		
		catch()ClassNotFoundException se)
		{
		se.printstackTrace();
		}
	}
}
