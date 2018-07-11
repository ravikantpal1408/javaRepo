public class Except1
{
	public static void main(String ar[])
	{
		try
		{
		System.out.println(10/2);
		System.out.println(10/3);
		System.out.println(10/0);
		System.out.println(10/4);
		}
		
		catch(RuntimeException a)
		{
		System.out.println(a);
		System.out.println(a.getMessage());
		}
		catch(ArithmeticException a)
		{
		System.out.println(a);
		}
		//System.out.println("Abc");
		/*finally
		{
		System.out.println("F Block");
		}*/
	}
}
