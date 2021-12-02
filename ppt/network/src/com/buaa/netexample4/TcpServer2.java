package com.buaa.netexample4;

import java.net.*;
import java.io.*;

class Servicer implements Runnable {
	Socket s;

	public Servicer(Socket s) {
		this.s = s;
	}

	public void run() {
		try {
			InputStream ips = s.getInputStream();
			OutputStream ops = s.getOutputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(ips));
			DataOutputStream dos = new DataOutputStream(ops);
			while (true) {
				String strWord = br.readLine();
				if (strWord.equalsIgnoreCase("quit"))
					break;
				String strEcho = (new StringBuffer(strWord).reverse()).toString();
				dos.writeBytes(strWord + "---->" + strEcho
						+ System.getProperty("line.separator"));
			}
			br.close();
			// 关闭包装类，会自动关闭包装类中所包装的底层类。所以不用调用ips.close()
			dos.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class TcpServer2 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8001);
			while (true) {
				Socket s = ss.accept();
				new Thread(new Servicer(s)).start();
			}
			// ss.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
