import javax.swing.*;

public class View  extends JFrame implements Runnable{

	 JLabel l1;
	 Thread th1;
	 int i=0;

	 public View()
	 {
		 setVisible(true);
		 setSize(400,400);
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 l1=new JLabel();
		 getContentPane().add(l1);
		 
		 getContentPane().add(l1);
		 th1=new Thread(this);
		 th1.start();
	 }
	 public void run()
	 {
		 for(;;)
		 {
			 try
			 {
				ImageIcon ico=new ImageIcon("c:\\pic\\"+i+".jpg");
				l1.setIcon(ico);
				i++;
				th1.sleep(300);
			 }
		   catch(Exception ex)
			 {
			   
			 }
		 }
		 
		 
	 }
	 public static void main(String args[])
	 {
		 new View();
	 }
	 }

