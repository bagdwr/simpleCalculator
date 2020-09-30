package GUI2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mainframe2  extends JFrame {
      private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bc,be,bm,bmul,bdiv,bdir;
      private JTextField text;
      private String res="";
      private Double firstNum;
      private Double secondNum;
      private char operation;
      private String answer;

      public Mainframe2()
      {
          setSize(380,520);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLayout(null);
          setTitle("Calculator na minimalkah");
          setResizable(false);

          text=new JTextField();
          text.setBounds(50,30,260,50);
          add(text);
          Font f=new Font(Font.SANS_SERIF,Font.ITALIC,25);
          text.setFont(f);

          bdir=new JButton("<--");
          bdir.setBounds(120,120,50,50);
          add(bdir);
          bdir.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=pop_back(res);
                  text.setText(res);
              }
          });

          bp=new JButton("+");
          bp.setBounds(190, 120, 50, 50);
          add(bp);
          bp.setFont(f);
          bp.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                    firstNum=Double.parseDouble(text.getText());
                    res="";
                    text.setText(res);
                    operation='+';
              }
          });

          bm=new JButton("-");
          bm.setFont(f);
          bm.setBounds(260,120,50,50);
          add(bm);
          bm.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  firstNum=Double.parseDouble(text.getText());
                  res="";
                  text.setText(res);
                  operation='-';
              }
          });

          bmul=new JButton("x");
          bmul.setFont(f);
          bmul.setBounds(260,200,50,50);
          add(bmul);
          bmul.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  firstNum=Double.parseDouble(text.getText());
                  res="";
                  text.setText(res);
                  operation='x';
              }
          });

          bdiv=new JButton("/");
          bdiv.setFont(f);
          bdiv.setBounds(260,270,50,50);
          add(bdiv);
          bdiv.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e) {
                  firstNum=Double.parseDouble(text.getText());
                  res="";
                  text.setText(res);
                  operation='/';
              }
          });

          bc=new JButton("c");
          bc.setFont(f);
          bc.setBounds(50,120,50,50);
          add(bc);
          bc.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res="";
                  text.setText(res);
              }
          });

          b7=new JButton("7");
          b7.setFont(f);
          b7.setBounds(50,200,50,50);
          add(b7);
          b7.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'7';
                  text.setText(res);
              }
          });

          b8=new JButton("8");
          b8.setFont(f);
          b8.setBounds(120,200,50,50);
          add(b8);
          b8.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'8';
                  text.setText(res);
              }
          });

          b9=new JButton("9");
          b9.setFont(f);
          b9.setBounds(190,200,50,50);
          add(b9);
          b9.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'9';
                  text.setText(res);
              }
          });

          b4=new JButton("4");
          b4.setFont(f);
          b4.setBounds(50,270,50,50);
          add(b4);
          b4.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'4';
                  text.setText(res);
              }
          });

          b5=new JButton("5");
          b5.setFont(f);
          b5.setBounds(120,270,50,50);
          add(b5);
          b5.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'5';
                  text.setText(res);
              }
          });

          b6=new JButton("6");
          b6.setFont(f);
          b6.setBounds(190,270,50,50);
          add(b6);
          b6.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'6';
                  text.setText(res);
              }
          });

          b1=new JButton("1");
          b1.setFont(f);
          b1.setBounds(50,340,50,50);
          add(b1);
          b1.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'1';
                  text.setText(res);
              }
          });

          b2=new JButton("2");
          b2.setFont(f);
          b2.setBounds(120,340,50,50);
          add(b2);
          b2.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'2';
                  text.setText(res);
              }
          });

          b3=new JButton("3");
          b3.setFont(f);
          b3.setBounds(190,340,50,50);
          add(b3);
          b3.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'3';
                  text.setText(res);
              }
          });

          b0=new JButton("0");
          b0.setFont(f);
          b0.setBounds(75,410,140,50);
          add(b0);
          b0.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  res=res+'0';
                  text.setText(res);
              }
          });

          be=new JButton("=");
          be.setFont(f);
          be.setBounds(260,340,50,50);
          add(be);
          be.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                   Operation();
              }
          });
      }
      public String pop_back(String s)
      {
          String res="";
          for(int i=0; i<s.length()-1; i++)
          {
              res=res+s.charAt(i);
          }
          return res;
      }
      public void Operation() {
          secondNum = Double.parseDouble(text.getText());
          if (operation == '+')
              res = String.valueOf(firstNum + secondNum);
          if (operation == '-')
              res = String.valueOf(firstNum - secondNum);
          if (operation == 'x')
              res = String.valueOf(firstNum * secondNum);
          if (operation == '/')
              res = String.valueOf(firstNum / secondNum);
          text.setText(res);
      }
}
