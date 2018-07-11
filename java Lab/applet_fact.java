import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=applet_fact.class width=100 height=100></applet>*/
public class applet_fact extends Applet implements ActionListener
{
	Button b1;
	TextField t1,t2;
	
	public void init()
	{
		add(new Label("Enter a No. ",Label.CENTER));
		
		t1=new TextField(30);

		add(t1);

		add(new Label("Factorial is ",Label.CENTER));
		
		t2=new TextField(30);

		add(t2);

		b1=new Button("Compute");
		add(b1);
		b1.addActionListener(this);
		
		

	}
	public void actionPerformed(ActionEvent e)
	{
		int n;
		if(e.getSource()==b1)
		{
			int f=1;
			n=Integer.parseInt(t1.getText());
			for(int i=1;i<=n;i++)
			{
				f=f*i;
			}
			t2.setText(String.valueOf(f));
		}
	}

	
}
