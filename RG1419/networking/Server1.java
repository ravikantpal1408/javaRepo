import java.io.*;
import java.net.*;
public class Server1
{
	public static void main(String ar[])throws IOException
	{
	ServerSocket ss=new ServerSocket(2000);
	Socket s=ss.accept();
	while(true)//request is made then it comes inside the loop
		{
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String st=dis.readLine();
		int n =Integer.parseInt(st);
		double d=Math.pow(n,3);
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println(d);//reply back to client
		}
	}
}
		