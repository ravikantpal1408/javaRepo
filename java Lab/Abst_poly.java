import java.io.*;

	
abstract class poly
{
	abstract void add();
	abstract void add();
	abstract void add();

	
}

abstract class A extends poly
{
	public void add(int a,int b)
	{
		
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(float a,float b)
	{
		
		System.out.println("Addition is: "+(a+b));
	}

	public void add(String a,String b)
	{
		
		System.out.println("Addition is: "+(a+b));
	}
}

class B extends A
{

		
}


class Abst_poly
{
	public static void main(String k[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two values: ");

		B obj=new B();

		obj.add(20,30);

		obj.add(2.5,7.5);

		obj.add("Amity","University");

	}
}





