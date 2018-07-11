public class CustomEx extends Exception
{
	public String toString()
	{
		return " Cust Str";
	}
	CustomEx()
	{
		System.out.println("Cust Const");
	}
	public String getMessage()
	{
		return "Cust Msg";
		
	}

	
}
class Ab
{
	void testNum(int x)//throws CustomEx
	{
	try
		{
		if(x==13)
			throw new CustomEx();
		else
			System.out.println("Number="+x);
		}
			
		catch(CustomEx c)
			{
			System.out.println(c);
			System.out.println(c.getMessage());
			}
	
	}
	
	
}
				
				
class Main
{
	public static void main(String ar[])//throws CustomEx
	
	{
	Ab a=new Ab();
	a.testNum(4);
	a.testNum(3);
	a.testNum(14);
	a.testNum(13);
	a.testNum(7);
	a.testNum(9);
	}
}
