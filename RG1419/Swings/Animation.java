import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.*;
public class Animation extends JDialog implements Runnable 
{
    boolean bouncing=false;
	boolean condition=false;
	Thread bouncer;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	
	String s=new String("PAYROLL SYSTEM.......ravikantpal123@gmail.com");
	Dimension d;
    int x=400;
	Animation()
	{
	  Toolkit kit=getToolkit();
	   d=kit.getScreenSize();
	  setBounds(d.width/4,d.height/4,d.width/2,d.height/2);
	  setVisible(true);
	  x=d.height/4;
	  repaint();
	  bouncing=true;                                                                     
	 
	  }
	public void stop()
	{
		bouncing=false;
		bouncer=null;
	}
	public void run()
   {
     

     while (true)
	 {
	 
	  
	  if (x == -100)
	  	condition = true;
	  else if (x == d.height/2)
	    condition = false;
	  if (!condition)
	   x = x-5;
	  else x = x+5;

	  try
	  {
	  Thread.sleep(50);
	  } catch(InterruptedException ie)
	  {
	  }
	  repaint();
  	  
	 
	 }
   }
	
	
	
	public void paint(Graphics g)
	{
		g.clearRect(0,0,600,600);
	
		Graphics2D g2d=(Graphics2D)g;
		g2d.setColor(Color.black);
	  g2d.drawString(s,x,100);
    	
	}
	public static void main(String arg[])
	{
		Animation a=new Animation();
		Thread b=new Thread(a);
		b.start();
		a.repaint();
	
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		}
	}
	