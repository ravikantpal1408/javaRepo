public class ConstrEx
{
	
	
	ConstrEx(int a,int b)

	{
	System.out.println("Diff="+(a-b));
	}
	ConstrEx()
	{
	this("Ravi");
	System.out.println("Default");
	}
	ConstrEx(String x)
	{
	this(9,7);
	System.out.println("String p="+x);
	}
	
	
	


}	
	
	
class Main
{
	public static void main(String ar[])
	
	{
	new ConstrEx();
	//new ConstrEx();
	//new ConstrEx("Ravi");
	}
	
}