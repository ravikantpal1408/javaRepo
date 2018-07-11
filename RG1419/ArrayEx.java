public class ArrayEx
{
	public static void main(String ar[])
	{
		int sum=0;
		int y[]={3,7,13,21,42};
		/*for (int i=0;i<5;i++)
		{
		System.out.println(y[i]);
		sum+=y[i];
		}*/
		for(int m:y)
		{
		System.out.println(m);
		sum+=m;
		}
		System.out.println("Total="+sum);
		
	}
}
	