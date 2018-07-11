public class A
{
	void t1()
	{
	System.out.println("1");
	}
	
}

class B extends A
{
	void t2()
	{
	System.out.println("T2");
	}
	void t1()
	{
	System.out.println("T5");
	}
	
	
}

class Main
{
	public static void main(String ar[])
	{
		/*B b=new B();
		
		b.t2();
		b.t1();*/
		A a=new B();//a holding the Object of B
		a.t1();
		
			
	}
	
}
