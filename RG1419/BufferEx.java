public class BufferEx
{
	public static void main(String ar[])
	{
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb.capacity());
		
		sb=sb.append("Xyzabcdefghijklmyasdafragtahtnjimkipppiiii");
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		sb=sb.reverse();
		
		System.out.println(sb);
	}
}

		