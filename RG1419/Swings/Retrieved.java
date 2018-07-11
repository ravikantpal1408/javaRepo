import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Retrieved extends JDialog implements ActionListener
{
	String user;
	JTextField u;
	JTextField q;
	JPasswordField a;
	JTextField p;
	String tans,uans,pass;
	
	JButton get,back;
	
	Retrieved()
	{
		setSize(400,500);
		setLayout(null);
		setTitle("Retreival.....");
		u=new JTextField(Login.user);
		q=new JTextField();
		a=new JPasswordField();
		get=new JButton("Get Password");
		p=new JTextField();
		back=new JButton("Back To Login");
		u.setEditable(false);
		p.setEditable(false);
		q.setEditable(false);
		get.setMnemonic('G');
		back.setMnemonic('B');
		JLabel l1=new JLabel("Username");
		JLabel l2=new JLabel("Question");
		JLabel l3=new JLabel("Answer");
		JLabel l4=new JLabel("Password");
		l1.setBounds(10,20,80,30);
		u.setBounds(120,20,150,30);
		l2.setBounds(10,60,80,30);
		q.setBounds(120,60,150,30);
		l3.setBounds(10,100,80,30);
		a.setBounds(120,100,150,30);
		
		l4.setBounds(10,180,80,30);
		p.setBounds(120,180,150,30);
		
		get.setBounds(30,140,160,30);
		back.setBounds(30,250,160,30);
		
		get.addActionListener(this);
		
		back.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(u);
		add(q);
		add(a);
		add(p);
		
		add(get);
		add(back);
		showValues();
		ImageIcon ii=new ImageIcon(getClass().getResource("Images/IMG_0063.jpg"));
		JLabel img=new JLabel(ii);
		img.setBounds(0,0,400,710);
		add(img);
		
		
		setVisible(true);
		
	}
	
	
	void showValues()
	{
	String s="select * from login where username=?";
		try
		{
			Connection con=MyConnection.getConnection();
		
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1,Login.user);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			pass= rs.getString("password");
			tans=rs.getString("answer");
			q.setText(rs.getString("question"));
			}
		}
		catch(SQLException se)
		{
		se.printStackTrace();
		}
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		
		user=u.getText();
		Object ob=ae.getSource();
		
		
		if(ob==back)
		{
			new Login();
			dispose();
		}
		else if(ob==get)
		{
			uans=a.getText();
			if(uans.equals(tans))
			{
				p.setText(pass);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid answer","Project",0);
			}
		}
	
		
	}	
	public static void main(String ar[])
	{
		new Retrieved();
		MyConnection.getConnection();
	}
	
}
	