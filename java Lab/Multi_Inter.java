import java.io.*;

interface f1
{
	int code=100;

	String name="Apple";
}

interface f2
{
	void display();

}

class Multiple implements f1,f2
{
	public void display()
	{
		System.out.println("Fruit Code: "+code);

		System.out.println("Fruit Name: "+name);
	}	
}

class Multi_Inter
{
	public static void main(String l[])
	{
		Multiple obj=new Multiple();

		obj.display();

	}
}