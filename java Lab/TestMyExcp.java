import java.io.*;

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);

	}

}

class TestMyExcp
{
	public static void main(String h[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.println("Enter a No.: ");
		n=Integer.parseInt(br.readLine());

		try
		{
			if(n>10)
			{
				throw new MyException("Number is Greater Than 10");

			}
		}

		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}

	}
}

