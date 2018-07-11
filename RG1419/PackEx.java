import Pack.*;
import Pack.Calculation.Calc;
public class PackEx
{
	public static void main(String ar[])
	{
		Add a=new Add();
		String s=a.add(4,3);
		System.out.println(s);
		
		
		Calc c=new Calc();
		c.diff(10,2);
		c.product(10,3);
		
	}
}