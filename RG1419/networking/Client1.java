import java.io.*;
import java.net.*;
public class Client1
{
	public static void main(String ar[])throws IOException,UnknownHostException
	{
	Socket s=new Socket("127.0.0.1",2000);
	while(true)
		{
		System.out.println("Enter a Number");
		DataInputStream dis=new DataInputStream(System.in);
		String st=dis.readLine();
		PrintStream ps=new PrintStream(s.getOutputStream());
		ps.println(st);//request to server
		dis=new DataInputStream(s.getInputStream());//receiving back the message from server side and storing it in dis variable 
		st=dis.readLine();
		System.out.println("From Server=" +st);
		}
	}
}