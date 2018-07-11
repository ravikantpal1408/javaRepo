interface I1

{
	int x=10;
	void t1();
}

class Ab implements I1
{

	public void t1()
	{
		System.out.println("T1");
		
		//System.out.println(++x); we cannot change the value of final variable
	}
	
}



	interface I1
	{
		void T1();
	}

	interface I2
	{
		void T2();
	}

	interface I3
	{
		void T3();
	}

	interface I4 extends I2,I3
	{
		void T4();
	}



	class Xyz extends Ab implements I1,I4
	{
		public void t2()
		{
			System.out.println("T2");
		}
		public void t3()
		{
			System.out.println("T3");
		}
		public void t4()
		{
			System.out.println("T4");
		}
	
	}	

class Main
{
	public static void main(String ar[])
	{
		//Ab a=new Ab();
		//a.t1();
		Xyz j=new Xyz();
		j.t2();
		j.t3();
		j.t4();
	}
}
