import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class Swing extends JFrame  {
	public Swing() {
		
	//process of creating JFrame
		setSize(800,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);   //Visible the frame on middle of the screen.
	    setLayout(null);
		  
	
		//Adding component to the JFrame
		JLabel label = new JLabel("Hello World");
		label.setBounds(400,300,250,250);  // decide the perfect place for label/world.
		label.setForeground(Color.RED);   // this is for foreground color.
		//label.setOpaque(true);
		add(label);                      //very import to show the label in frame.
		
		
		//Adding Button to the JFrame
		JButton btn = new JButton("Click");
		btn.setBounds(400,150,100,40);
		add(btn);
		
		
        //Adding JtextField to the JFrame
        JTextField txt = new JTextField("Write any thing!");
        txt.setBounds(400,100,200,50);
        txt.setFont(new Font("Cursive",Font.ITALIC,15));   // this is the font size set coding.
        add(txt);
        
        
        //Adding Password to the JFrame
        JPasswordField pass = new JPasswordField();
        pass.setBounds(270,200,150,30);
        pass.setForeground(Color.YELLOW);
        pass.setBackground(Color.CYAN);
        add(pass);
        
        
        //Adding Text Area to the JFrame
        JTextArea area = new JTextArea();
        area.setBounds(300,270,200,30);
        area.setFont(new Font("Verdana",Font.BOLD,15));
        area.setBackground(Color.YELLOW);
        add(area);
        
        
        //Adding Image Button to the JFrame
        ImageIcon img = new ImageIcon("H:\\button.JPG");  //copy the path and image name
        JButton btn1 = new JButton (img);
        btn1.setBounds(700,70,300,250);
        add(btn1);
        
        
        
        //Adding JPanel to the JFrame
        JPanel jp = new JPanel();
        jp.setBounds(450,350,200,40);
        jp.setBackground(Color.ORANGE);
        add(jp);
        
        
	//Adding Border Layout to the JFrame
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);   //Visible the frame on middle of the screen.

        JButton b1 = new JButton("NORTH");; // the button will be labeled as NORTH
        JButton b2 = new JButton("SOUTH");; // the button will be labeled as SOUTH
        JButton b3 = new JButton("EAST");; // the button will be labeled as EAST
        JButton b4 = new JButton("WEST");; // the button will be labeled as WEST
        JButton b5 = new JButton("CENTER");; // the button will be labeled as CENTER

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);
        f.setVisible(true);
		
		
        //Adding JRadio Button to the JFrame
        JRadioButton r1 = new JRadioButton("1.Computer Engineering");
        JRadioButton r2 = new JRadioButton("2.Civil Engineering");
        JRadioButton r3 = new JRadioButton("3.Software Engineering");
        JRadioButton r4 = new JRadioButton("4.Artifitial Engineering");   
        r1.setBounds(100,50,200,30);    
        r2.setBounds(100,100,200,30);    
        r3.setBounds(100,150,200,30);    
        r4.setBounds(100,200,200,30);  
        ButtonGroup bg = new ButtonGroup();    //All button will be in a group and only one option can be selected.
                                                  //iF we dont use group option then multiple can be selected.
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        JButton btn4 = new JButton("Click");
        btn4.setBounds(100,250,100,50);
        add(btn4);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
       
    	  btn4.addActionListener(new ActionListener() {
    		  
    	  @Override
        public void actionPerformed(ActionEvent e){ 
    		  if(r1.isSelected()) {
    			  JOptionPane.showMessageDialog(btn4,"You are Computer Engineer");
    		  }
    		  if(r2.isSelected()) {
    			  JOptionPane.showMessageDialog(btn4,"You are Civil Engineer");
    		  }
    		  if(r3.isSelected()) {
    			  JOptionPane.showMessageDialog(btn4,"You are Software Engineer");
    		  }
    		  if(r4.isSelected()) {
    			  JOptionPane.showMessageDialog(btn4,"You are Artifitial Engineer");
    		  }
    	  }
    	  
        	
        });
        
        
        //Adding Image Icon to the JFrame.
        ImageIcon image = new ImageIcon (new ImageIcon("H:\\\\button.JPG").getImage().getScaledInstance(230,230,DO_NOTHING_ON_CLOSE));
        JButton btn2 = new JButton(image);
        btn2.setBounds(500,200,150,30);
        add(btn2);
        
        btn2.addActionListener(new ActionListener() {    //this is for print anything on console by clicking in the JFrame Button.

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Anything");
            }
        });
        
        setVisible(true);               //very important to visible whole JFrame.
		}
	
	public static void main(String[] args) {
		
              new Swing();
	}

}
