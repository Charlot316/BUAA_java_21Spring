package com.buaa.udpExample;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Chat {
	Frame f = new Frame("我的聊天室");
	TextField tfIP = new TextField(15);
	List lst = new List(6);
	DatagramSocket ds; 

	/*
	 * 由于DatagramSocket的构造函数声明可能抛出异常，我们的程序需要用try…catch语句进行异常捕获处理，
	 * 所以不能直接在这里调用DatagramSocket的构造函数对ds进行初始化，我们需要将ds的初始化放在Chat类的构造函数中去完成。
	 */
	public Chat() {
		try {
			ds = new DatagramSocket(3000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//匿名类
		new Thread(new Runnable() {
			public void run() {
				byte buf[] = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, 1024); 
				while (true) {
					try {
						ds.receive(dp); 
						lst.add(new String(buf, 0, dp.getLength()) + ":from"
								+ dp.getAddress().getHostAddress(), 0); 
					} catch (Exception e) {
						if (!ds.isClosed()) { 
							e.printStackTrace();
						}
					}
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.init();
	}

	public void init() {
		f.setSize(300, 300);
		f.add(lst);

		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add("West", tfIP);
		TextField tfData = new TextField(20);
		p.add("East", tfData);
		f.add("South", p);
		f.setVisible(true);
		f.setResizable(false);// 限制用户改变窗口的大小

		// 增加关闭窗口的事件处理代码
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				ds.close();// 程序退出时，关闭Socket，释放相关资源
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		// 增加在消息文本框中按下回车键的事件处理代码
		tfData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 取出文本框中的消息字符串，并将其转换成字节数组
				byte[] buf;
				buf = e.getActionCommand().getBytes();
				try {
					DatagramPacket dp = new DatagramPacket(buf, buf.length,
							InetAddress.getByName(tfIP.getText()), 3000); 
					ds.send(dp);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				/*
				 * 上面的Exception的引用变量名不能为e，而是改写成了ex，因为e已经在
				 * actionPerformed方法中作为形式参数变量名被定义过了。
				 */
				((TextField) e.getSource()).setText("");
			}
		});
	}
}
