import java.io.*;
import java.net.*;
public class client
{
public static void main(String l[])
{
	try
	{
		Socket s=new Socket("127.0.0.1",8080);
		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		
		PrintStream out=new PrintStream(s.getOutputStream());

		System.out.println("Enter your name: ");

		String str=stdin.readLine();

		out.println(str);

		str=in.readLine();

		System.out.println(str);

		s.close();

		
	}
	catch(UnknownHostException e)
	{
		System.out.println(e);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
}
}