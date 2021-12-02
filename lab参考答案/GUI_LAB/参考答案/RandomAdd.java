package com.buaa.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import javax.swing.*;
public class RandomAdd extends JFrame{
    JLabel label1=new JLabel("数字一");
    JLabel label2=new JLabel("数字二");
    JLabel label3=new JLabel("结果");
    JButton jb1=new JButton("产生");
    JButton jb2=new JButton("计算");                
    RandomAdd(){
        setTitle("随机生成数 相加计算");
        final JTextArea ja1=new JTextArea(2,4);
        final JTextArea ja2=new JTextArea(2,4);
        final JTextArea ja3=new JTextArea(2,4);
        Box basebox,box1,box2;
        jb1.addActionListener(new ActionListener() {    
            public void actionPerformed(ActionEvent e) {
                ja1.setText(Math.random()*100+"");
                ja2.setText(Math.random()*100+"");
                ja3.setText(null);
            }
        });
        jb2.addActionListener(new ActionListener() {    
            public void actionPerformed(ActionEvent e) {
                try {
                    BigDecimal num1 = new BigDecimal(ja1.getText());
                    BigDecimal num2 = new BigDecimal(ja2.getText());
                    ja3.setText(num1.add(num2).toString());
                }catch (Exception ee) {
                    ja3.setText("请点击产生键");
                }
            }
        });
        
        box1=Box.createVerticalBox();
        box1.add(label1);
        box1.add(Box.createHorizontalStrut(8));
        box1.add(label2);
        box1.add(Box.createHorizontalStrut(8));
        box1.add(label3);
        box1.add(Box.createHorizontalStrut(8));
        box2=Box.createVerticalBox();
        box2.add(ja1);
        box2.add(Box.createHorizontalStrut(8));
        box2.add(ja2);
        box2.add(Box.createHorizontalStrut(8));
        box2.add(ja3);
        box2.add(Box.createHorizontalStrut(8));
        basebox=Box.createHorizontalBox();
        basebox.add(box1);
        basebox.add(Box.createHorizontalStrut(80));
        basebox.add(box2);
        
        setLayout(new GridLayout(2,1));
        JPanel jp=new JPanel();
        add(basebox);
        jp.add(jb1);
        jp.add(jb2);
        add(jp);
        setBounds(100,100,260,190);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
	public static void main(String[] args) {
		new RandomAdd();
	}
}