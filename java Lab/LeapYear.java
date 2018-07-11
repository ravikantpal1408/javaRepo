import java.io.*;	

public class LeapYear 
{
	public static void main(String l[])throws IOException
	{
	 
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a Year: ");
		int year=Integer.parseInt(br.readLine());
	    
	        if (year % 100 == 0) 
		{
	            if (year % 400 == 0) 
		    {
	                System.out.println(year + " is a leap year");
	            } 
		    else 
		    {
	                System.out.println(year + " is not a leap year");
	            }
	        } 
		else 
		{
	            if (year % 4 == 0) 
		    {
	                System.out.println(year + " is a leap year");
	            } 
		    else 
		    {
	                System.out.println(year + " is not a leap year");
	            }
	        }
	}
}

