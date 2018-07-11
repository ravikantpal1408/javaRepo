import java.io.*;
public class ReadObj
{
	public static void main(String ar[])throws IOException,ClassNotFoundException
	{
	FileInputStream fis=new FileInputStream("Emp.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Employee emp=(Employee)ois.readObject();
	System.out.println("Id="+emp.eid);
	System.out.println("Name="+emp.name);
	System.out.println("Basic="+emp.basic);
	System.out.println("TA="+emp.ta);
	}
}