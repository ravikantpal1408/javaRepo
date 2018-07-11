//import java.io.*;
public class Thread2 extends Thread
{
	public void run()//throws InterruptedException
	{
	try
	{
		for(int i=1;i<=5;i++)
		{
			Thread t=Thread.currentThread();
			String n=t.getName();
			System.out.println(n+" "+i);
			Thread.sleep(1000);
		}
	}
		catch(InterruptedException z)
		{
		System.out.println(z);
		System.out.println(z.getMessage());
		}
	}
		
	
}

class Main
{
	public static void main(String ar[]) throws InterruptedException
	{
		Thread2 t=new Thread2();
		Thread t1=new Thread(t,"ONE");
		Thread t2=new Thread(t,"TWO");
		Thread t3=new Thread(t,"THREE");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}
}
		
	