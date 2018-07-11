public class EqualsComp
{
	public static void main(String ar[])
		{
			String s1=new String("Abc");
			String s2=new String("Abc");
			String s3=new String(s2);
			String s4="Abc";
			String s5=s2;
			String s6="Abc";
			System.out.println(s1==s2);
			System.out.println(s2==s3);
			System.out.println(s3==s4);
			System.out.println(s2==s5);
			System.out.println(s4==s5);
			System.out.println(s4==s6);
			System.out.println(s5==s6);
			System.out.println(s5.equals(s6));
			
		}
}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
