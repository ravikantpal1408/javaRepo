import java.io.*;
public class MExce
{
	public static void main(String ar[])
	{
		try
		{
		
		FileOutputStream f=new FileOutputStream("x");
		}
		catch(FileNotFoundException|IOException ne)
		{
		System.out.println(ne);
		}
	}
}
