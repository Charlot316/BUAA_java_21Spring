package com.buaa.gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;
public class ChooseChair extends JFrame implements ActionListener{
    ChooseChair(){
        JButton jb0=new JButton("座位0");
        JButton jb1=new JButton("座位1");
        JButton jb2=new JButton("座位2");
        JButton jb3=new JButton("座位3");
        JButton jb4=new JButton("座位4");
        JButton jb5=new JButton("座位5");
        jb0.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        JLabel label=new JLabel("讲台",JLabel.CENTER);
        JPanel jp=new JPanel();
        jp.setLayout(new GridLayout(2,3));
        jp.add(jb0);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        jp.add(jb5);
        add(jp,BorderLayout.CENTER);
        add(label,BorderLayout.NORTH);
        setBounds(100,100,260,190);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand()+"被选中");
    } 
	public static void main(String[] args) {
		new ChooseChair();
	}
}
