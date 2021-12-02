package com.buaa.udpExample;

import java.net.*;

public class UdpSend {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		String str = "hello world";
		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),
				InetAddress.getByName("127.0.0.1"), 3000);
		ds.send(dp);
		ds.close();
	}
}
