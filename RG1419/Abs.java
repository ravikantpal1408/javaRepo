public abstract class Abs
{
	int b =20;
	abstract void test1();
	abstract void test2();
	void test3()
	{
		System.out.println("T3");
	}
	abstract void test4();
	
}
abstract class Abc extends Abs
{
	void test1()
	{
		System.out.println("T1");
		System.out.println(++b);
	}
	void test2()
	{
		System.out.println("T2");
	}
	
}


class Main 
{
	public static void main(String ar[])
	{
		Ab a=new Ab();
		a.test3();
		a.test1();
		a.test2();
		a.test4();
		Abs b=new Ab();
	}
}
class Ab extends Abc
{
	void test4()
	{
		System.out.println("T4");
	}
}

