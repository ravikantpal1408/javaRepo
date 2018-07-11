public class LocalClass
{
	void method1()
	{
		class Inner
		{
			void method2()
			{
			System.out.println("In M2");
			}
		}
		Inner i = new Inner();
		i.method2();
		System.out.println("In M1");
	}
}
class Main
{
	public static void main(String ar[])
	{
		LocalClass l = new LocalClass();
		l.method1();
	}
}