import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
public class IO extends JFrame{
    public IO() {
    	JFrame f = new JFrame();
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setSize(500,400);
    	f.setLocationRelativeTo(null);
    	f.setLayout(null);
    	f.setVisible(true);
    	JButton btn1 = new JButton("1");
    	JButton btn2 = new JButton("2");
    	JButton btn3 = new JButton("3");
    	JButton btn4 = new JButton("4");
    	JButton btn5 = new JButton("5");
    	JButton btn6 = new JButton("6");
    	JButton btn7 = new JButton("7");
    	JButton btn8 = new JButton("8");
    	JButton btn9 = new JButton("9");
    	
    	f.setLayout(new GridLayout (3,3,4,4));
    	f.add(btn1);
    	f.add(btn2);
    	f.add(btn3);
    	f.add(btn4);
    	f.add(btn5);
    	f.add(btn6);
    	f.add(btn7);
    	f.add(btn8);
    	f.add(btn9);
    	
    	
    }

public static void main(String[] args) {
	new IO();
}
}

		   


