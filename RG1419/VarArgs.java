public class VarArgs
{
	void test(String b,int...y)
	{
	System.out.println("Start");
	
	for(int x:y)
		{
		System.out.println(x);
		}
		System.out.println("End");
		
	}
}

class Main
{
	public static void main(String ar[])
		{
		VarArgs a=new VarArgs();
		
		a.test("4",7);
		a.test( "ab");
		a.test("9",21,42);
		a.test("40");
		}
}

		