import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Sum extends JFrame {
	public Sum() {
		
		setSize(350,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(null);
		setLocationRelativeTo(null);
		
		
		JLabel label = new JLabel("1st Number :");
		label.setBounds(30,30,100,50);
		add(label);
		JLabel label1 = new JLabel("2nd Number :");
		label1.setBounds(30,60,100,50);		
		add(label1);
		
		JTextField txt = new JTextField();
		txt.setBounds(140,50,100,20);
		add(txt);
		JTextField txt1 = new JTextField();
		txt1.setBounds(140,80,100,20);
		add(txt1);
		JButton btn = new JButton("ADD");
		btn.setBounds(140,120,60,20);
		add(btn);

		setVisible(true);
	
		btn.addActionListener(new ActionListener() {
  		  
	    	  @Override
	        public void actionPerformed(ActionEvent e){ 
	    		  
	    		  int sum = Integer.parseInt(txt.getText()) + Integer.parseInt(txt1.getText());
	    		  
	    		  JOptionPane.showMessageDialog(null,"Output is : " + sum);
	    		  
	    	  }
		});
	}
		
	
	public static void main(String[] args)  {
		
		new Sum();
		
	

	}
}


