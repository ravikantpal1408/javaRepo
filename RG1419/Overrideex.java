public class Overrideex
{
	void calc(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	
	
	void display()
	{
		System.out.println("String="+s);
		
	}
	
}

class ab extends OverrideEx
{
	void display(int a)
	{
		System.out.println("Num="+a);
		
	}
	
	void calc(int a ,int b)
	{
		System.out.println("pruduct="+(a*b));
		
	}
}

class Main
{
	public static void main(String ar[])
	{
		Ab b=new Ab();
		b.display();
		b.calc();
	}
	
}