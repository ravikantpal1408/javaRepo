import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
public class Login extends JDialog implements ActionListener
{
	static String user;
	JTextField u;
	JPasswordField p;
	JButton submit,forgot,register;
	
	Login()
	{
		setSize(800,511);
		setLayout(null);
		getContentPane().setBackground(Color.red);
		setTitle("Login Here.....");
		u=new JTextField();
		u.setForeground(Color.black);
		p=new JPasswordField();
		p.setForeground(Color.magenta);
		submit=new JButton("Login");
		forgot=new JButton("Forgot Password");
		register=new JButton("New User");
		submit.setMnemonic('L');
		forgot.setMnemonic('F');
		register.setMnemonic('N');
		JLabel l1=new JLabel("Username");
		l1.setForeground(Color.black);
		JLabel l2=new JLabel("Password");
		l2.setForeground(Color.black);
		l1.setBounds(10,20,80,30);
		u.setBounds(80,20,140,30);
		l2.setBounds(230,20,80,30);
		p.setBounds(300,20,140,30);
		submit.setBounds(460,20,80,30);
		register.setBounds(50,60,150,30);
		forgot.setBounds(50,100,150,30);
		submit.addActionListener(this);
		register.addActionListener(this);
		forgot.addActionListener(this);
		add(l1);
		add(l2);
		add(u);
		add(p);
		add(submit);
		add(forgot);
		add(register);
		ImageIcon ii=new ImageIcon(getClass().getResource("Images/IMG3.jpg"));
		JLabel img=new JLabel(ii);
		img.setBounds(550,135,200,317);
		add(img);
		ImageIcon ii2=new ImageIcon(getClass().getResource("Images/IMG_0063.jpg"));
		JLabel img2=new JLabel(ii2);
		img2.setBounds(0,0,800,511);
		add(img2);
		getRootPane().setDefaultButton(submit);
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		user=u.getText();
		Object ob=ae.getSource();
		if(ob==submit)
		
		{
			String pass=p.getText() ;
			String st="select *from login where username=? and password=?";
			Connection con=MyConnection.getConnection();
			try
			{
				PreparedStatement ps=con.prepareStatement(st);
				ps.setString(1,user);
				ps.setString(2,pass);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null,"ok","Project",1);
				}
			else
				{
					JOptionPane.showMessageDialog(null,"Invalid","Project",0);
				}
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		
		}
		
		if(ob==register)
		{
		new Register();
		dispose();//MyConnection.getConnection();
		}
		
		if(ob==forgot)
		{
		new Retrieved();
		dispose();
		MyConnection.getConnection();
		}
	}	
	public static void main(String ar[])
	{
		new Login();
		MyConnection.getConnection();
	}
	
}
		