package com.buaa.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Numcompare extends JFrame {
	JTextField text;
	JLabel label;

	Numcompare() {
		setTitle("Number change");
		// 限制输入一个数字
		text = new JTextField(10);
		label = new JLabel();
		label.setText("请输入0-9的数字");
		text.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int getstr = Integer.parseInt(text.getText());
				String showstr = null;
				switch (getstr) {
				case 0:
					showstr = "zero";
					break;
				case 1:
					showstr = "one";
					break;
				case 2:
					showstr = "two";
					break;
				case 3:
					showstr = "three";
					break;
				case 4:
					showstr = "four";
					break;
				case 5:
					showstr = "five";
					break;
				case 6:
					showstr = "six";
					break;
				case 7:
					showstr = "seven";
					break;
				case 8:
					showstr = "eight";
					break;
				case 9:
					showstr = "nine";
					break;
				default:
					showstr = ("请输入0-9的数字");
					break;
				}
				label.setText(showstr);
				text.setText(null);
			}
		});
		setLayout(new FlowLayout());
		add(text);
		add(label);
		setBounds(100, 100, 460, 190);
		setVisible(true);
		validate();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		;
	}
	public static void main(String[] args) {
		   new Numcompare();
	}
}