import java.awt.*;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.*;

public class Register extends JFrame {
    JButton jb1, jb2;
    JPanel panel1, panel2;
    JLabel jlabel1, jlabel2, jlabel3, jlabel4, jlabel5;
    JPasswordField jpass, cpass;
    JTextField txt1, txt2, txt3, txt4;

    public Register() {
        setSize(400, 450);
        setDefaultCloseOperation(3);
        setTitle("Registration");
        setLayout(null);
        setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 30);
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 400, 80);
        panel1.setBackground(Color.YELLOW);
        panel1.setLayout(null);
        add(panel1);


        panel2 = new JPanel();
        panel2.setBounds(0, 80, 400, 450);
        panel2.setBackground(Color.GREEN);
        panel2.setLayout(null);
        add(panel2);


        jlabel1 = new JLabel("Registration");
        jlabel1.setBounds(105, 0, 400, 80);
        jlabel1.setFont(font);
        panel1.add(jlabel1);


        jlabel2 = new JLabel("Username                 :");
        jlabel2.setBounds(20, 5, 200, 40);
        panel2.add(jlabel2);

        txt1 = new JTextField();
        txt1.setBounds(150, 15, 150, 30);
        panel2.add(txt1);

        jlabel3 = new JLabel("Email                          :");
        jlabel3.setBounds(20, 40, 200, 40);
        panel2.add(jlabel3);

        txt2 = new JTextField();
        txt2.setBounds(150, 50, 150, 30);
        panel2.add(txt2);

        jlabel3 = new JLabel("Moblie                        :");
        jlabel3.setBounds(20, 75, 200, 40);
        panel2.add(jlabel3);

        txt3 = new JTextField();
        txt3.setBounds(150, 85, 150, 30);
        panel2.add(txt3);


        jlabel4 = new JLabel("Password                 :");
        jlabel4.setBounds(20, 110, 200, 40);
        panel2.add(jlabel4);

        jlabel4 = new JLabel("Confirm Password :");
        jlabel4.setBounds(20, 145, 200, 40);
        panel2.add(jlabel4);

        jpass = new JPasswordField();
        jpass.setBounds(150, 155, 150, 30);
        panel2.add(jpass);

        cpass = new JPasswordField();
        cpass.setBounds(150, 120, 150, 30);
        panel2.add(cpass);

        jlabel5 = new JLabel("Address                    :");
        jlabel5.setBounds(20, 180, 200, 40);
        panel2.add(jlabel5);

        txt4 = new JTextField();
        txt4.setBounds(150, 190, 150, 30);
        panel2.add(txt4);


        jb1 = new JButton("Login");
        jb1.setBounds(50, 250, 100, 50);
        panel2.add(jb1);

        jb2 = new JButton("Register");
        jb2.setBounds(250, 250, 100, 50);
        panel2.add(jb2);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login();
            }
        });

        //Get the value from text field.
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = txt1.getText();
                String email = txt2.getText();
                String mobile = txt3.getText();
                String pass = jpass.getText();
                String conpass = cpass.getText();
                String add = txt4.getText();

                //Validation

                String userNameRegex = "^[a-zA-Z0-9.]+$";
                
                if(!Pattern.matches(userNameRegex,userName)){
                    JOptionPane.showMessageDialog(null, "In-valid User Name");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Valid user Name");
                }
                
                String emailRegex = "^[a-z0-9]+@[a-z]+.[a-z]+$";
                
                if(!Pattern.matches(emailRegex,email)){
                    JOptionPane.showMessageDialog(null, "In-valid Email Address");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Valid Email Address");
                }
                String mobileRegex = "(\\+88)?-?01[3-9]\\d{8}";

               if(!Pattern.matches(mobileRegex,mobile)){
                    JOptionPane.showMessageDialog(null, "In-valid Mobile Number");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Valid Mobile Number");
                }
               
               String passRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{6,20}";
               

               if(!Pattern.matches(passRegex,pass)){
                    JOptionPane.showMessageDialog(null, "In-valid Password");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Valid password");
                }
               
              String conpassRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{6,20}";
               

               if(!Pattern.matches(conpassRegex,conpass)){
                    JOptionPane.showMessageDialog(null, "In-valid Confirm Password");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Valid Confirm Password");
                }
               
              String addressRegex = "^(?=.*[0-9])(?=.*[a-z])+,(?=.*[a-z]).{6,30}";
               

               if(!Pattern.matches(addressRegex,add)){
                    JOptionPane.showMessageDialog(null, "In-valid Address");
                }
                 else{
                    JOptionPane.showMessageDialog(null,"Valid Address");
                }
               

                String insertQuery = "INSERT INTO `record`(`Name`, `Email`, `Mobile`, `Password`, `Confirm Password`, `Address`) VALUES ('" + userName + "','" + email + "','" + mobile + "','" + pass + "','" + conpass + "','" + add + "')";

                DbConnect db = new DbConnect();
                db.InsertRegister(insertQuery);

            }
        });

        setVisible(true);
    }
}
