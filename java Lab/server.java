import java.io.*;
import java.net.*;
public class server
{
	public static void main(String l[])
	{
		try
		{
			String str;

			ServerSocket ss=new ServerSocket(8080);

			System.out.println(ss.toString());

			Socket s=ss.accept();

			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));

			PrintStream out=new PrintStream(s.getOutputStream());
			
			str=in.readLine();

			System.out.println("Server got this : "+str);

			s.close();
			ss.close();

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