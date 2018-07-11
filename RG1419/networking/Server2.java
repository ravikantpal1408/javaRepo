import java.io.*;
import java.net.*;
public class Server2
{
	public static void main(String ar[])throws IOException
	{
	ServerSocket ss=new ServerSocket(2500);
	Socket s=ss.accept();
	while(true)
		{
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String st=dis.readLine();
		System.out.println("From client="+st);
		System.out.println("Enter a String ");
		dis=new DataInputStream(System.in);
		st=dis.readLine();
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println(st);
		}
	}
}
		