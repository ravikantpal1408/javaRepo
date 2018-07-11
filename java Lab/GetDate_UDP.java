import java.net.*;
import java.io.*;

class GetDate_UDP
{
	final static int port_daytime=13;

	public static void main(String l[])throws IOException
	{
		DatagramSocket dgSocket;
		
		DatagramPacket datagram;

		InetAddress dest;

		byte[] msg=new byte[256];

		dgSocket=new DatagramSocket();

		dest=InetAddress getByName("www.sybex.com");

		datagram=new DatagramPacket(msg,msg.length,dest,port_daytime);

		dgSocket.send(datagram);

		datagram=new DatagramPacket(msg,msg.length);

		dgSocket.receive(datagram);

		String rec=new String(datagram.getData());

		System.out.println("The time here is "+rec+" at this moment");

		dgSocket.close();


	}
}