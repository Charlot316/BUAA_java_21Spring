package com.buaa.netexample2;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class TestClient {
	public static void main(String args[]) {
		try {
			Socket s1 = new Socket("localhost", 8888);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			OutputStream os = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			String info;
			while (true) {
				info = br.readLine();
				dos.writeUTF(info);
				if (info.equals("bye"))
					break;
				info = dis.readUTF();
				System.out.println("对方说: " + info);
				if (info.equals("bye"))
					break;
			}
			dis.close();
			dos.close();
			s1.close();
		} catch (SocketException e) {
			System.out.println("网络连接异常，程序退出!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}