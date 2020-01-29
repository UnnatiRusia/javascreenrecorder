import  java.awt.*;
import  java.awt.event.ActionEvent;
import  java.awt.event.ActionListener;
import java.io.IOException;

import  javax.swing.*;
//bhut sare pakage ko ek file me lena usko   jar bolte hai
public class MainForm  extends JFrame //implements ActionListener  {
{
	JButton b1;
	JMenuBar j1;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4;
	JPanel p1;
	public  MainForm()
	{
		setVisible(true);
		setSize(400,400);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  p1=new JPanel();
	   j1=new JMenuBar();
	   
	   m1=new JMenu("Desktop");
	   m2=new JMenu("HElp");
	 
	   i1=new JMenuItem("Logger");
	   i2=new JMenuItem("View");
	   i3=new JMenuItem("Exit");
	   
	   i4=new JMenuItem("Help");
	   
	   j1.add(m1);
	   j1.add(m2);
	   m1.add(i1);
	   m1.add(i2);
	   m1.add(i3);
	   m2.add(i4);
	
		setJMenuBar(j1);
	  getContentPane().add(p1);	  
	   i1.addActionListener(e->actionB1(e));
	   i2.addActionListener(e->actionB2(e));
	   i3.addActionListener(e->actionB3(e));
	   i4.addActionListener(e->actionB4(e));
	   
	}
	public void actionB1(ActionEvent e)
	{
		if(e.getSource()==i1)
		{
			  Logger obj =new Logger();
			  obj.setVisible(true);
			
		}
	}
	public void actionB2(ActionEvent e)
	{
		if(e.getSource()==i2)
		{
		
		View obj1=new View();
		 obj1.setVisible(true);
		}

	}
	public void actionB3(ActionEvent e)
	{
		if(e.getSource()==i3)
		{
			 System.exit(0);
		}
	}
	public void actionB4(ActionEvent e)
	{
		if(e.getSource()==i4)
		{
			
		}
	}
	
	public static void main(String args[])
	{
		new MainForm();
	}
	

	
}
