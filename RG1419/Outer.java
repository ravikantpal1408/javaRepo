public class Outer
{
	int a=10;
	void OuterMethod()
	{
		System.out.println("Outer m");
	}
	class Inner
	{
		int b=20;
		void InnerMethod()
		{
			OuterMethod();
			System.out.println("Outer Var a="+ ++a);
			System.out.println("Inner Method");
		}
	}
}
class Main
{
	public static void main(String ar[])
	{
	Outer o=new Outer();
	o.OuterMethod();
	Outer.Inner i=o.new Inner();
	i.InnerMethod();
	i.OuterMethod();
	}
}