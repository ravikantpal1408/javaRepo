import java.io.*;
public class CheckedEx
{
	public static void main(String ar[])//throws FileNotFoundException
	{
		try
		{
			
			FileInputStream f=new FileInputStream("F3.txt");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe);
		}
		
	
	}
}
