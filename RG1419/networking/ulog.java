
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ulog extends JFrame implements ActionListener 
{
	private static final long serialVersionUID = 1L;
	static String user;
	JTextField u;
	JPasswordField p;
	JButton PROCEED,NEWUSER;
	
	ulog()
	{
		setSize(400,300);
		setLayout(null);
		setTitle("LOGIN TO SU");
		u=new JTextField();
		
		p=new JPasswordField();
		
		
		NEWUSER=new JButton("NEWUSER");
		PROCEED=new JButton("PROCEED");
		NEWUSER.setMnemonic('N');
		PROCEED.setMnemonic('P');
		JLabel l1=new JLabel("User name");
		JLabel l2=new JLabel("Password");
		
		l1.setBounds(10,20,120,30);
		l2.setBounds(10,60,120,30);
		
		u.setBounds(140,20,100,30);
		p.setBounds(140,60,100,30);
		
		NEWUSER.setBounds(10,220,100,30);
		PROCEED.setBounds(150,220,100,30);
		NEWUSER.addActionListener(this);
		PROCEED.addActionListener(this);
		add(l1);
		add(l2);
		
		add(u);
		add(p);
		
		add(NEWUSER);
		add(PROCEED);
		setVisible(true);
	}
	//@SuppressWarnings("deprecation")
	
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	
	public static void main(String args[])
	{
		new ulog();
		//MyConnection.getConnection();
	}
}