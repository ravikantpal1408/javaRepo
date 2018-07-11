public class StatInvoke
{
	static void t1()
	{
	System.out.println("M1");
		
	t2();
	}
	
	static void t2()
	{
		
	System.out.println("M2");
		
	
	}
}

class Main
{
	public static void main(String ar[])
	
	{
	//new StatInvoke().t1();
	StatInvoke.t2();
	}
	
}

	