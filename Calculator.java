import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.Math;

public class Calculator extends JFrame{

    JPanel panel1,panel2,panel3;
    JTextField txt;
    JButton btn1, btn2, btn3, btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnEqual,btnClr,btnADD,btnMin,
            btnDevide,btnMultiple,btnSqrt,btnDouble, btnPercentage,btnPI,btnLog,btnLn;
    double a,b;  int flag;
    

    public Calculator(){

        setSize(400,450);
        setDefaultCloseOperation(3);
        setLayout(null);
        setTitle("Simple Calculator");
        setLocationRelativeTo(null);

        Font font = new Font("Tahoma",Font.BOLD,18);

        panel1 = new JPanel();
        panel1.setBounds(0,0,400,80);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setLayout(null);
        add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(0,80,300,370);
        panel2.setBackground(Color.GRAY);
        add(panel2);

        panel3 = new JPanel();
        panel3.setBounds(300,80,100,370);
        panel3.setBackground(Color.LIGHT_GRAY);
        add(panel3);

        txt = new JTextField();
        txt.setBounds(5,5,375,70);
        txt.setBackground(new Color(255,255,153));
        txt.setFont(font);
        panel1.add(txt);

        panel2.setLayout(new GridLayout(6,0,8,8));
        panel2.setBackground(Color.BLUE);
        btn1 = new JButton("1");btn1.setFont(font);panel2.add(btn1);btn1.setBackground(Color.YELLOW);
        btn2 = new JButton("2");btn2.setFont(font);panel2.add(btn2);btn2.setBackground(Color.YELLOW);
        btn3 = new JButton("3");btn3.setFont(font);panel2.add(btn3);btn3.setBackground(Color.YELLOW);
        btn4 = new JButton("4");btn4.setFont(font);panel2.add(btn4);btn4.setBackground(Color.YELLOW);
        btn5 = new JButton("5");btn5.setFont(font);panel2.add(btn5);btn5.setBackground(Color.YELLOW);
        btn6 = new JButton("6");btn6.setFont(font);panel2.add(btn6);btn6.setBackground(Color.YELLOW);
        btn7 = new JButton("7");btn7.setFont(font);panel2.add(btn7);btn7.setBackground(Color.YELLOW);
        btn8 = new JButton("8");btn8.setFont(font);panel2.add(btn8);btn8.setBackground(Color.YELLOW);
        btn9 = new JButton("9");btn9.setFont(font);panel2.add(btn9);btn9.setBackground(Color.YELLOW);
        btn0 = new JButton("0");btn0.setFont(font);panel2.add(btn0);btn0.setBackground(Color.YELLOW);
        btnDot = new JButton(".");btnDot.setFont(font);panel2.add(btnDot);btnDot.setBackground(Color.YELLOW);
        btnEqual = new JButton("=");btnEqual.setFont(font);panel2.add(btnEqual);btnEqual.setBackground(Color.GREEN);
        btnSqrt = new JButton("√");btnSqrt.setFont(font);panel2.add(btnSqrt);btnSqrt.setBackground(new Color(51,204,255));
        btnDouble = new JButton("00");btnDouble.setFont(font);panel2.add(btnDouble);btnDouble.setBackground(Color.YELLOW);
        btnPercentage = new JButton("%");btnPercentage.setFont(font);panel2.add(btnPercentage);btnPercentage.setBackground(new Color(51,204,255));
        btnPI = new JButton("π");btnPI.setFont(font);panel2.add(btnPI);btnPI.setBackground(new Color(51,204,255));
        btnLog = new JButton("log") ;btnLog.setFont(font);panel2.add(btnLog);btnLog.setBackground(new Color(51,204,255));
        btnLn = new JButton("ln") ;btnLn.setFont(font);panel2.add(btnLn);btnLn.setBackground(new Color(51,204,255));

        panel3.setLayout(new GridLayout(5,1,8,8));
        panel3.setBackground(Color.BLUE);
        btnClr = new JButton("DEL");btnClr.setFont(font);panel3.add(btnClr);btnClr.setBackground(Color.RED);
        btnADD = new JButton("+");btnADD.setFont(font);panel3.add(btnADD);btnADD.setBackground(new Color(51,204,255));
        btnMin = new JButton("-");btnMin.setFont(font);panel3.add(btnMin);btnMin.setBackground(new Color(51,204,255));
        btnMultiple = new JButton("X");btnMultiple.setFont(font);panel3.add(btnMultiple);btnMultiple.setBackground(new Color(51,204,255));
        btnDevide = new JButton("/");btnDevide.setFont(font);panel3.add(btnDevide);btnDevide.setBackground(new Color(51,204,255));


        //Performing Button in Action
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn1) {
                    txt.setText(txt.getText()+"1");
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn2) {
                    txt.setText(txt.getText()+"2");
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn3) {
                    txt.setText(txt.getText()+"3");
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn4) {
                    txt.setText(txt.getText()+"4");
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn5) {
                    txt.setText(txt.getText()+"5");
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn6) {
                    txt.setText(txt.getText()+"6");
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn7) {
                    txt.setText(txt.getText()+"7");
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn8) {
                    txt.setText(txt.getText()+"8");
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn9) {
                    txt.setText(txt.getText()+"9");
                }
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn0) {
                    txt.setText(txt.getText()+"0");
                }
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnDot) {
                    txt.setText(txt.getText()+".");
                }
            }
        });
        btnDouble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnDouble) {
                    txt.setText(txt.getText()+"00");
                }
            }
        });
        btnClr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnClr) {
                    txt.setText(null);
                }
            }
        });

        //Functional keys Performing
        btnADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnADD) {
                    String s = txt.getText();
                    a = Double.parseDouble(s);
                    txt.setText(" ");
                    flag = 1;
                }
            }
        });
        btnMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnMin) {
                    String s = txt.getText();
                    a = Double.parseDouble(s);
                    txt.setText(" ");
                    flag = 2;
                }
            }
        });
        btnMultiple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnMultiple) {
                    String s = txt.getText();
                    a = Double.parseDouble(s);
                    txt.setText(" ");
                    flag = 3;
                }
            }
        });
        btnDevide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnDevide) {
                    String s = txt.getText();
                    a = Double.parseDouble(s);
                    txt.setText(" ");
                    flag = 4;
                }
            }
        });
        btnSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnSqrt) {
                    String s = txt.getText();
                    b = Double.parseDouble(s);
                    double c = Math.sqrt(b);
                    txt.setText(Double.toString(c));
                    flag = 5;
                }
            }
        });
        btnPercentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnPercentage) {
                    String s = txt.getText();
                    a = Double.parseDouble(s);
                    txt.setText(" ");
                    flag = 10;
                }
            }
        });
        btnPI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnPI) {
                    String s = txt.getText();
                    b = Double.parseDouble(s);
                    double c = Math.PI*b;
                    txt.setText(Double.toString(c));

                }
            }
        });
        btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnLog) {
                    String s = txt.getText();
                    a = Double.parseDouble(s);
                    double c = Math.log10(a);
                    txt.setText(Double.toString(c));
                }
            }
        });
        btnLn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btnLn) {
                    String s = txt.getText();
                    a = Double.parseDouble(s);
                    double c = Math.log(a);
                    txt.setText(Double.toString(c));
                }
            }
        });

        // Equal Function
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnEqual) {
                    {
                        if (flag == 1) {
                            String s2 = txt.getText();
                            b = Double.parseDouble(s2);
                            double c = a + b;
                            txt.setText(Double.toString(c));

                        } else if (flag == 2) {
                            String s3 = txt.getText();
                            b = Double.parseDouble(s3);
                            double c = a - b;
                            txt.setText(Double.toString(c));
                        } else if (flag == 3) {
                            String s4 = txt.getText();
                            b = Double.parseDouble(s4);
                            double c = a * b;
                            txt.setText(Double.toString(c));

                        } else if (flag == 4) {
                            String s5 = txt.getText();
                            b = Double.parseDouble(s5);
                            double c = a / b;
                            txt.setText(Double.toString(c));

                        } else if (flag == 10) {
                            String s10 = txt.getText();
                            b = Double.parseDouble(s10);
                            double c = a % b;
                            txt.setText(Double.toString(c));
                        }

                    }

                }


            }

        });
        setVisible(true);
    }
    public static void main(String[] args)
    {

        new Calculator();
    }
}

