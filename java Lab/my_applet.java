import java.awt.*;
import java.applet.*;
/*<applet code="my_applet.class" width=400 height=400> </applet>*/
public class my_applet extends Applet
{
	String msg="";
	int x=100,y=200;
	public void init()
	{
		msg=msg+"init();";
	}
	public void start()
	{
		msg=msg+"start();";
		x=x+20;
		y=y+20;
	}
	public void stop()
	{
		msg=msg+"stop();";
		x=x+20;
		y=y+20;
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
		g.drawLine(10,20,300,300);
		setForeground(Color.pink);
		g.fillRect(20,40,100,100);
	}
	public void destroy()
	{
		msg=msg+"destroy();";
		x=x+20;
		y=y+20;
	}
}