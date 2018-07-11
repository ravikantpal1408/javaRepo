import java.awt.*;
import java.applet.*;
/*<applet code="smilye_applet.class" width=500 height=500> </applet>*/
public class smilye_applet extends Applet
{
	public void init()
	{
		
	}

	public void paint(Graphics g)
	{
		g.drawOval(250,110,200,200);

		//g.fillOval(250,110,200,200);

		g.drawLine(400,170,375,170);

		g.drawLine(325,170,300,170);

		g.drawLine(350,180,350,160);

		//g.drawLine(360,250,335,250);

		g.drawArc(260,130,235,130,-80,-50);
		
		
	}
}
