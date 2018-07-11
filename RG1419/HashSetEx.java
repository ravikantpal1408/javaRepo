import java.util.*;
public class HashSetEx
{
public static void main(String ar[])
	{
	HashSet<String>hs=new HashSet<String>();
	hs.add("Two");
	hs.add("One");
	hs.add("Five");
	hs.add("Three");
	hs.add("Four");
	System.out.println(hs);
	
	hs.add("Three");
	System.out.println(hs);

	}
}
