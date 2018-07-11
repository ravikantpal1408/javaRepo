public class OverExx
{
	public void calc(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	
	
	void display(String s)
	{
		System.out.println("String="+s);
		
	}
	
}

class Ab extends OverExx
{
	void display(int a)
	{
		System.out.println("Num="+a);
		//	super.calc(4,4);
	}
	
	public void calc(int a ,int b)
	{
		System.out.println("pruduct="+(a*b));
		
	}
}

class Main
{
	public static void main(String ar[])
	{
		Ab b=new Ab();
		/*b.display("Java");
		b.calc(4, 4);
		b.display(20);
		b.calc(4,4);*/
		OverExx e=new OverExx();
		OverExx f=new Ab();
		e.calc(4,4);
		f.calc(4,4);
		
		
	}
	
}