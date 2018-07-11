/*<applet code="MyApplet" width=800 height=600></applet>*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MyApplet extends Applet implements ActionListener
{
	Button r,g,b;
	TextField tf1,tf2,tf3;
	Label l1,l2,l3;
	
	public void init()
	{
		setLayout(new BorderLayout());
		//setBackground(Color.pink);
		r= new Button("Red");
		g= new Button("Green");
		tf1= new TextField();
		//tf2= new TextField();
		//tf3= new TextField();
		l1= new Label("Name");
		//l2= new Label("Class");
		//l3= new Label("College");
		Font f=new Font("Arial",Font.BOLD,18);
		Color c=new Color(150,80,40);
		setBackground(c);
		tf1.setForeground(c);
		//tf2.setForeground(c);
		//tf3.setForeground(c);
		tf1.setBackground(Color.yellow);
		//tf2.setBackground(Color.yellow);
		//tf3.setBackground(Color.yellow);
		tf1.setFont(f);
		//tf2.setFont(f);
		//tf3.setFont(f);
		l1.setFont(f);
		//l2.setFont(f);
		//l3.setFont(f);
		/*l1.setBounds(20,30,80,30);
		l2.setBounds(10,30,80,30);
		l3.setBounds(20,30,80,30);
		tf1.setBounds(130,30,80,30);
		tf2.setBounds(130,30,80,30);
		tf3.setBounds(130,30,80,30);
		r.setBounds(20,80,80,30);
		g.setBounds(130,80,80,30);*/
		r.addActionListener(this);
		g.addActionListener(this);
		add(l1,BorderLayout.NORTH);//add(l1);
		//add(l2);
		//add(l3);
		add(tf1,BorderLayout.SOUTH);//add(tf1);
		//add(tf2);
		//add(tf3);
		add(r,BorderLayout.EAST);//add(r);
		add(g,BorderLayout.WEST);//add(g);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		tf1.setText(s);
		Object ob=ae.getSource();
		if(ob==r)
		{
			setBackground(Color.red);
		}
		else
		{
			setBackground(Color.GREEN);
		}
	}
}