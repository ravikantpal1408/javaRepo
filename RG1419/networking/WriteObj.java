import java.io.*;
public class WriteObj
{
	public static void main(String ar[])throws IOException
	{
	Employee e=new Employee();
	e.name="Nancy";
	e.basic=20000;
	e.eid=22;
	e.ta=10000;
	FileOutputStream fos=new FileOutputStream("Emp.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(e);
	oos.close();
	}
}