package com.buaa.netexample1;

import java.io.*;
import java.net.Socket;
public class TestClient {
	public static void main(String args[]) {
		try {
			Socket s1 = new Socket("127.0.0.1", 8888);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.print("�������˵�ַ��Ϣ:"+s1.getInetAddress());
			System.out.println("��������ͨ�Ŷ˿ں�:"+s1.getPort());	
			System.out.println("���ܵ���Ϣ��*****");
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			dis.close();
			s1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
