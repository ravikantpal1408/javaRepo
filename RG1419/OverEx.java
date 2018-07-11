public class OverEx
{
	void test(String s)
	{
	System.out.println("Param="+s);
	}
	
	void test(int a ,String b)
	{
	System.out.println("Num & Str="+a+"   "  +b);
	}
	
	void test(int x)
	{
	System.out.println("NUm="+x);
	}
	void test(String a,int n )
	{
	System.out.println("Parameter="+a+" "  +n);
	}
	
	
}


class Main

{
	public static void main(String ar[])
	{
		OverEx e=new OverEx();
		e.test("20");
		e.test(21,"23");
		e.test("23");
		
		e.test("255",55);
	}
}