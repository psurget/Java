package ca.creaxion;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class FindYourAddress extends Frame implements ActionListener{
    
    JTextField tf; 
    JLabel l1;
    JLabel l2; 
    JButton b;
    
    FindYourAddress(){  
        tf=new JTextField();  
        tf.setBounds(50,50,200,20); 
        l1=new JLabel();
        l1.setBounds(5,50,50,20);
        l1.setText("DNS:");
        l2=new JLabel();  
        l2.setBounds(50,100,400,20);
        //l2.setBounds(x, y, width, height);
        b=new JButton("Find IP");  
        b.setBounds(50,150,95,30);  
        b.addActionListener(this);  
        
        add(b);add(tf);add(l2);add(l1);    
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
        try{  
            String host=tf.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();  
            l2.setText("IP of "+host+" is: "+ip);  
            }
        catch(Exception ex){
            System.out.println(ex);
        }  
    }  

    public static void main(String[] args) {
	new FindYourAddress();
    }

}
