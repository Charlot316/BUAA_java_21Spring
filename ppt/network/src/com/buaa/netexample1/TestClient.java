package com.buaa.netexample1;

import java.io.*;
import java.net.Socket;
public class TestClient {
	public static void main(String args[]) {
		try {
			Socket s1 = new Socket("127.0.0.1", 8888);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.print("服务器端地址信息:"+s1.getInetAddress());
			System.out.println("服务器端通信端口号:"+s1.getPort());	
			System.out.println("接受的信息是*****");
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			dis.close();
			s1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
