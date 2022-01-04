import java.awt.*;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Currency extends JFrame {
    JButton jb1, jb2 ,jb3;
    JPanel panel1, panel2;
    JLabel jlabel1, jlabel4;
    JTextField txt1,txt2;
    double a;
    Font font = new Font("Italic", Font.BOLD, 15);

    public Currency() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setTitle("Currency");
        setLayout(null);

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 500, 50);
        panel1.setBackground(Color.GREEN);
        panel1.setLayout(null);
        add(panel1);

        jlabel1 = new JLabel("Currency Converter");
        jlabel1.setBounds(150, 0, 500, 50);
        jlabel1.setFont(font);
        panel1.add(jlabel1);

        panel2 = new JPanel();
        panel2.setBounds(0, 50, 500, 250);
        panel2.setBackground(Color.YELLOW);
        panel2.setLayout(null);
        add(panel2);

        jlabel1 = new JLabel("Input :");
        jlabel1.setBounds(90, 30, 200, 40);
        panel2.add(jlabel1);

        txt1 = new JTextField();
        txt1.setBounds(160, 42, 160, 25);
        txt1.setFont(font);
        panel2.add(txt1);

        jlabel4 = new JLabel("Output :");
        jlabel4.setBounds(80, 70, 200, 40);
        panel2.add(jlabel4);

        txt2 = new JTextField();
        txt2.setBounds(160, 82, 160, 25);
        txt2.setFont(font);
        panel2.add(txt2);


        jb1 = new JButton("IND");
        jb1.setBounds(40, 160, 100, 40);
        panel2.add(jb1);

        jb2 = new JButton("USA");
        jb2.setBounds(200, 160, 100, 40);
        panel2.add(jb2);

        jb3 = new JButton("AUS");
        jb3.setBounds(350, 160, 100, 40);
        panel2.add(jb3);


        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jb1){
                    txt1.setText(txt1.getText());
                    String s = txt1.getText();
                    a = Double.parseDouble(s);
                    double c = (a * 0.86 );
                    String str1 = String.valueOf(c);
                    txt2.setText(str1);
                }
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jb2){
                    txt1.setText(txt1.getText());
                    String s = txt1.getText();
                    a = Double.parseDouble(s);
                    double c = (a * 0.012 );
                    String str1 = String.valueOf(c);
                    txt2.setText(str1);
                }
            }
        });

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jb3){
                    txt1.setText(txt1.getText());
                    String s = txt1.getText();
                    a = Double.parseDouble(s);
                    double c = (a * 0.016 );
                    String str1 = String.valueOf(c);
                    txt2.setText(str1);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new	Currency();

    }
}