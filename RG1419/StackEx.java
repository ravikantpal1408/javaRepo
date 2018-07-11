public class StackEx
{
	void s1()
	{
		s2();
	}
	void s2()
	{
		s3();
	}
	void s3()
	{
		try
		{
			s4();
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	
	
	}
	void s4()
	{
		System.out.println(10/0);
	}
	
}
class Main
{
	public static void main(String ar[])
	{
		new StackEx().s1();
	}
}
