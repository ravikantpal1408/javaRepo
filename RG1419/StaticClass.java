public class StaticClass
{
	void method1()
	{
		System.out.println("M1");
	}
	static void method2()
	{
		System.out.println("M2");
	}
	static void method3()
	{
		System.out.println("M3");
	}
	static class Inner
	{
		void method4()
		{
			//method1();
			method2();
			method3();
		}
	}
}
class Main
{
	public static void main(String ar[])
	{
		StaticClass s = new StaticClass();
		s.method1();
		StaticClass.Inner i= new StaticClass.Inner();
		i.method4();
	}
}
		
	