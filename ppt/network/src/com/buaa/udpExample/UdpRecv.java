package com.buaa.udpExample;

import java.net.*;

public class UdpRecv {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(3000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		ds.receive(dp);
		String strRecv = new String(dp.getData(), 0, dp.getLength()) + " from "
				+ dp.getAddress().getHostAddress() + ":" + dp.getPort();
		System.out.println(strRecv);
		ds.close();
	}
}