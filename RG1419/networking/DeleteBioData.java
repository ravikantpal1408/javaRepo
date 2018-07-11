import javax.swing.*;
import javax.swing.ImageIcon.*;
import javax.swing.JPanel.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class DeleteBioData extends JDialog implements ActionListener
{
JButton b1,b2;
JTextField  textField1;
JLabel label1; 
 
 
  public DeleteBioData() {
			setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
 			Toolkit theKit=getToolkit();
			Dimension wndSize=theKit.getScreenSize();
			
		
			
			setBounds(5,10,590,350);
			GridLayout grid=new GridLayout(6,1,10,20);
			Container content=getContentPane();
			content.setLayout(grid);
			EtchedBorder edge=new EtchedBorder(EtchedBorder.RAISED);
																	

label1=new JLabel("Employee ID");
 
textField1=new JTextField();


b1=new JButton("cancel");
b2=new JButton("Delete");


            b1.setBorder(edge);
			b2.setBorder(edge);
	
			
			content.add(label1);
			content.add(textField1);		
					content.add(b1);
					content.add(b2);
					setVisible(true);
								
									
             b1.addActionListener(this);
             b2.addActionListener(this);
			



				}
public void actionPerformed(ActionEvent ae)
	 
	 
	 {  
	 
	      Object source=ae.getSource();
	 
 
		if (ae.getActionCommand().equals("cancel")||source==b1)
		   {
		
   			System.exit(0);

		   }
		else if(ae.getActionCommand().equals("Delete")||source==b2)
		{	
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String sourceURL="jdbc:odbc:database";
			Connection databaseConnection=DriverManager.getConnection(sourceURL);

			Statement statement=databaseConnection.createStatement();
			String str = "DELETE FROM BiosData WHERE EmployeeID="+textField1.getText();
			ResultSet authorNames=statement.executeQuery(str);
			/*if (authorNames.next())
				{
			
	      		 JOptionPane.showMessageDialog(null,"Information Saved");
				}
				
			else {
					JOptionPane.showMessageDialog(null,"Invalid Password");
				}*/ 		

		  
			}
			catch(Exception cnfe)
				{
				//System.err.println(cnfe);
				 JOptionPane.showMessageDialog(null,"Information Deleted");

				}	
			
			 //JOptionPane.showMessageDialog(null,"");		
			
			
			
		}
		
	
	
	
	
	
	
	}//action performed
 
public static void main(String args[])
{
	DeleteBioData a=new DeleteBioData();
}


}