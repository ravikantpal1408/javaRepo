import java.io.*;
class ifLoop
{
	public static void main(String a[])throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Enter a value:");
		int x=Integer.parseInt(br.readLine());

		if(x%2==0)
		{
		System.out.println("Entered Value "+ x +"is EVEN");
		}
		else if(x%2==1)
		{
		System.out.println("Entered Value "+ x +"is ODD");
		}
	}

}