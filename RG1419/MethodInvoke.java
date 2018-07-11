public class MethodInvoke


{

	static void show()
	{
	System.out.println("Show");
	}

	public static void main(String ar[])
	{
	System.out.println("Start");
	int y=add(4,91);
	System.out.println("sum="+y);
		
	show();

	System.out.println("End");
	
	}
	
	static int add(int a,int b)

	{
	
	return(a+b);
	}



}