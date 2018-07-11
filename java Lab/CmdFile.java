import java.io.*;

class CmdFile
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str,n;
		int i=0;
		String s=args[0];

		FileWriter fw=new FileWriter(s);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);

		for(i=1;i<=5;i++)
		{
			System.out.println("Enter name "+i+":");
			n=br.readLine();
			pw.println(n);

		}

		pw.close();

		FileReader f=new FileReader(s);
		BufferedReader bd=new BufferedReader(f);

		while((str=bd.readLine())!=null)
		{
			
			
			System.out.println(str);
		}
		
		
		bd.close();
	}
}