import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Register extends JDialog implements ActionListener
{
boolean check(String user,String pass,String rpass,String ques,String ans)
	{
	if(user.trim().equals("")||pass.equals("")||ques.equals("")||ans.equals(""))
		{
			JOptionPane.showMessageDialog(null,"Some fields are blanks","Project",0);
			return false;
		}
	if(!(pass.equals(rpass)))
		{	
			JOptionPane.showMessageDialog(null,"User already Exist","Project",0);
			return false;
		}
		try
		{
		Connection con=MyConnection.getConnection();
		String st="select username from login where username=?";
		PreparedStatement ps=con.prepareStatement(st);ps.setString(1,user);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
		
			JOptionPane.showMessageDialog(null,"password Not Matching","Project",0);
			return false;
		
		}	
	
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			return false;
		}
		return true;
	}	
	
	String user;
	JTextField u;
	JPasswordField p;
	JPasswordField rp;
	JTextField q;
	JPasswordField a;
	JButton submit,cancel;
	public void actionPerformed(ActionEvent ae)
	{
		user=u.getText();
		Object ob=ae.getSource();
		if(ob==submit)
		{
			String user =u.getText();
			String pass =p.getText();
			String rpass =rp.getText();
			String ques =q.getText();
			String ans =a.getText();	
		
			boolean b=check(user,pass,rpass,ques,ans);
			if(b)
			{
				Connection con=MyConnection.getConnection();
				String st ="insert into login (username,password,question,answer) values(?,?,?,?)";
				try
				{
				PreparedStatement ps=con.prepareStatement(st);
				ps.setString(1,user);
				ps.setString(2,pass);
				ps.setString(3,ques);
				ps.setString(4,ans);
				int x=ps.executeUpdate();
				if(x>0)
					{
					String msg ="New User Added\nClick ok to begin";
					JOptionPane.showMessageDialog(null,msg,"Project",1);
					new Login();
					dispose();
					}
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
		    }
				
		}
		if(ob==cancel)
		{
		
			new Login();
			dispose();
		
		}

	}
		
	
	Register()
	{
		setSize(400,500);
		setLayout(null);
		setTitle("Register Here.....");
		u=new JTextField();
		p=new JPasswordField();
		rp=new JPasswordField();
		q=new JTextField();
		a=new JPasswordField();
		submit=new JButton("Submit");
		cancel=new JButton("Cancel");
		
		submit.setMnemonic('S');
		cancel.setMnemonic('C');
		JLabel l1=new JLabel("Username");
		JLabel l2=new JLabel("Password");
		JLabel l3=new JLabel("Retype Password");
		JLabel l4=new JLabel("Question");
		JLabel l5=new JLabel("Answer");
		l1.setBounds(10,20,100,30);
		l2.setBounds(10,60,100,30);
		l3.setBounds(10,100,100,30);
		l4.setBounds(10,140,100,30);
		l5.setBounds(10,180,100,30);
		
		u.setBounds(120,20,130,30);
		p.setBounds(120,60,130,30);
		rp.setBounds(120,100,130,30);
		q.setBounds(120,140,130,30);
		a.setBounds(120,180,130,30);
		submit.setBounds(50,250,80,30);
		cancel.setBounds(150,250,90,30);
		submit.addActionListener(this);
		
		cancel.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(u);
		add(p);
		add(rp);
		add(q);
		add(a);
		add(submit);
		add(cancel);
		setVisible(true);
		
	}
	
	
	public static void main(String ar[])
	{
		new Register();
		MyConnection.getConnection();
	}
	
}
		