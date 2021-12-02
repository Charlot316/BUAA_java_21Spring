package com.buaa.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class J_InetAddress
{
	public static void main(String[] args){
		String s="www.buaa.edu.cn";
		InetAddress ts=null;
		try{
			ts=InetAddress.getByName(s);
		}
		catch(UnknownHostException e){
			System.err.println(e);
		}
		if(ts!=null){
			System.out.println("The IP address of beihang is :"+ts.getHostAddress());
			System.out.println("The host name of beihang is :"+ts.getHostName());
		}
		else{
			System.out.println("can not access "+s);
		}
	}
}

