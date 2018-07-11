public class InheritEx
{
	int a;
	private int b=40;
	void show1()
	{
		System.out.println("Show1");
		System.out.println(++b);//b can be accessed within the InheritEx class
	}
	
}

class Bcy extends InheritEx
{
	void show2()
		{
		System.out.println("Show2");
		show1();
		//System.out.println(b);
		}
		
}


class Main
{	

	public static void main(String ar[])
	{
		Bcy b=new Bcy();
		b.show2();
		//b.show1();
		
		InheritEx i=new InheritEx();
		System.out.println(++i.a);
		//System.out.println(i.b);
		//therefore b cannot be accessed as it is private
	}
	
}
