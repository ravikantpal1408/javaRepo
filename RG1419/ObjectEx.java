public class ObjectEx
{

 void t1()
	{
	System.out.println("M1");
	}	

 void t2()
	{
	System.out.println("M2");
	}
	
}


class Main
{

	public static void main(String ar[])
	{
	
	ObjectEx b=new ObjectEx();	
	b.t1();
	ObjectEx c=new ObjectEx();

	c.t1();
	c.t2();
	b.t2();
	
	}
	
}