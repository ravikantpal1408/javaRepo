import javax.swing.*;
import java.awt.event.*;
public class Login extends Jdialog implements ActionListener
{
	static String user;
	JTextField u;
	JPasswordField p;
	JButtonField submit,forgot ,register;
	
	Login()
	{
		setSize(400,300)
		setLayout(null);
		setTitle("Login Here.....");
		u=new JTextField();
		p=new JPasswordField();
		submit=new JBotton("Login");
		forgot=new JBotton("Forgot Password");
		register=new JBotton("New User");
		submit.setMremonic('L');
		forgot.setMremonic('F');
		register.setMremonic('N');
		JLabel l1=new JLabel("Username");
		JLabel l2=new JLabel("Password");
		l1.setBounds(10,20,80,30);
		l2.setBounds(10,60,80,30);
		u.setBounds(120,20,100,30);
		p.setBounds(120,60,100,30);
		submit.setBounds(50,110,80,30);
		register.setBounds(10,150,90,30);
		forgot.setBounds(110,150,150,30);
		submit.addActionListener(this);
		
		forgot.addActionListener(this);
		add(l1);
		add(l2);
		add(u);
		add(p);
		add(submit);
		add(forgot);
		add(register);
		setVisible(true);
		
	}
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		user=u.getText();
		object ob=ae.getSource();
		if(ob==submit)
		{
		}
		
		if(ob==register)
		{
		}
		
		if(ob==forgot)
		{
		}
		
		public static void main(String ar[])
		{
			new Login();
		}
	}
}
		