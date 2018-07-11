public class VarEx
{
 	int a,b;
	static int c;
	
	void testNum()
	{
	
	System.out.println("a="+ ++a);

	System.out.println("b="+ b++);

	System.out.println("c="+ ++c);
	System.out.println(" ");

	}

}


class Main

{

	public static void main(String ar[])

	{
	
	new VarEx().testNum();
	new VarEx().testNum();

	new VarEx().testNum();

	}

}