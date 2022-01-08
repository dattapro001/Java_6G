import java.awt.*;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame {
    JButton jb1, jb2;
    JPanel panel1, panel2;
    JLabel jlabel1, jlabel4;
    JPasswordField jpass;
    JTextField txt1;
    Font font = new Font("Italic", Font.BOLD, 15);

    public Login() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setTitle("Login From");
        setLayout(null);

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 500, 50);
        panel1.setBackground(Color.GREEN);
        panel1.setLayout(null);
        add(panel1);

        jlabel1 = new JLabel("Login From");
        jlabel1.setBounds(190, 0, 500, 50);
        jlabel1.setFont(font);
        panel1.add(jlabel1);

        panel2 = new JPanel();
        panel2.setBounds(0, 50, 500, 250);
        panel2.setBackground(Color.YELLOW);
        panel2.setLayout(null);
        add(panel2);

        jlabel1 = new JLabel("Username :");
        jlabel1.setBounds(80, 30, 200, 40);
        panel2.add(jlabel1);

        txt1 = new JTextField();
        txt1.setBounds(160, 42, 160, 25);
        txt1.setFont(font);
        panel2.add(txt1);

        jlabel4 = new JLabel("Password :");
        jlabel4.setBounds(80, 70, 200, 40);
        panel2.add(jlabel4);

        jpass = new JPasswordField();
        jpass.setBounds(160, 82, 160, 25);
        panel2.add(jpass);

        jb1 = new JButton("Register");
        jb1.setBounds(70, 150, 100, 40);
        panel2.add(jb1);

        jb2 = new JButton("Login");
        jb2.setBounds(300, 150, 100, 40);
        panel2.add(jb2);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
                new Register();
            }
        });


        setVisible(true);


    }

}
