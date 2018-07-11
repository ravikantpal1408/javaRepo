public class BlockEx
{
static int a;
	{
	System.out.println("B1");
	}
	{
	System.out.println("B2");
	}
	{
	System.out.println("B4");
	}
	{
	System.out.println("B3");
	}
	static //This block will execute first
	{
	System.out.println("Static");
	}
	
}

class Main
{
public static void main(String ar[])
	{
	System.out.println(BlockEx.a);
	//new BlockEx();
	//new BlockEx();
	//new BlockEx();
	}
}