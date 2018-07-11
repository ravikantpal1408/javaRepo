import java.io.*;
import java.net.*;
public class Client2
{
	public static void main(String ar[])throws IOException,UnknownHostException
	{
	Socket s=new Socket("127.0.0.1",2500);
	while(true)
		{
		System.out.println("Enter a String");
		DataInputStream dis=new DataInputStream(System.in);
		String st=dis.readLine();
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println(st);
		dis=new DataInputStream(s.getInputStream()); 
		st=dis.readLine();
		System.out.println("From Server=" +st);
		}
	}
}