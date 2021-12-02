package com.buaa.netexample1;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

/*
 * 客户端和服务器端采用TCP协议进行通信，当客户端链接服务器端程序后，
 * 服务器程序向客户端程序发送客户端的IP地址和端口号。
 */
public class TestServer {
	public static void main(String args[]) {
		try {
			ServerSocket s = new ServerSocket(8888);
			while (true) {
				Socket s1 = s.accept();
				OutputStream os = s1.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF("客户端地址信息: " + s1.getInetAddress()
						+ "\t客户端通信端口号: " + s1.getPort());
				dos.writeUTF("再见！");
				dos.close();
				s1.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}