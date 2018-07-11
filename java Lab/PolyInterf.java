import java.io.*;

interface Area
{
	static final float pi=3.14f;
	
	float compute(float x,float y);

}
class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return(x*y);

	}
}
class Circle implements Area
{
	public float compute(float x,float y)
	{
		return(pi*x*x);
	}
}

class PolyInterf
{
	public static void main(String l[])
	{
		Rectangle rect=new Rectangle();

		Circle cir=new Circle();

		System.out.println("Area of Rectangle "+rect.compute(10f,20f));

		System.out.println("Area of Circle "+cir.compute(10f,0f));
	}
}