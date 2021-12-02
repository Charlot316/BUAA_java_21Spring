package com.buaa.netexample2;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.SocketException;

/*
 * �򵥵�һ��һ������򡣳���ֻ��һ��һ���죬����ֻ��һ��˵һ�䣬���ܶ�˵����Ϊ�����ǵ��̵߳ġ�
 */
public class TestServer {
	public static void main(String args[]) {
		try {
			ServerSocket s = new ServerSocket(8888);
			Socket s1 = s.accept();
			OutputStream os = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			String info;
			while (true) {
				info = dis.readUTF();
				System.out.println("�Է�˵: " + info);
				if (info.equals("bye"))
					break;
				info = br.readLine();
				dos.writeUTF(info);
				if (info.equals("bye"))
					break;
			}
			dis.close();
			dos.close();
			s1.close();
			s.close();
		} catch (SocketException e) {
			System.out.println("���������쳣�������˳�!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
 * 
 *��ҵ��
 *�����������:Ϊ�˱�֤һ�ο���˵��䣬����ʹ�ö��̣߳�һ���߳�����˵��һ���߳����������������ţ�����
 */