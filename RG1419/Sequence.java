public class Sequence 
{
	
	Sequence(int y)
	{
		System.out.println("M2");
	}
	
	Sequence()
	{
		System.out.println("M3");
	}
	
}


class Ab extends Sequence	
{
	Ab()
	{
	//super(10);
	System.out.println("M1");
	}
	
}



class Main
{
	public static void main(String ar[])
	{
		new Ab();
	}
	
}

	