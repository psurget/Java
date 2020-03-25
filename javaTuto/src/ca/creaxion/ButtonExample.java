package ca.creaxion;
import java.awt.event.*;  
import javax.swing.*;    

public class ButtonExample {

    public static void main(String[] args) {
	JFrame f=new JFrame("Button Example");  
	    final JTextField tf=new JTextField();  
	    tf.setBounds(50,50, 150,20);  
	    /*JButton b=new JButton("Click Here");*/
	    JButton b = new JButton(new ImageIcon("D:\\icon.png"));
	    b.setBounds(50,100,95,30);  
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	            tf.setText("Bonjour et bienvenue.");  
	        }  
	    });  
	    f.add(b);f.add(tf);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}  

}
