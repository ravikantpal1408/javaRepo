public class InsHide
{
	int num;
	
	void set(int num)
	{	
		this.num=num;
		
	}
	
	void get()
	{
		System.out.println("Num ="+num);
		
	}

}


class Main
{

	public static void main(String ar[])
	
	{
		InsHide b=new InsHide();
		
		b.set(33);
		b.get();
		
	}
	
}