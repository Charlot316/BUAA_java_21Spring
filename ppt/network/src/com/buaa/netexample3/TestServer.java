package com.buaa.netexample3;
import java.io.*;
import java.net.*;

public class TestServer {
	public static void main(String args[]) {
		try {		
			ServerSocket s = new ServerSocket(8888);
			Socket s1 = s.accept();
			OutputStream os = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);

			new MyServerReader(dis).start();			
			new MyServerWriter(dos).start();
		}catch (IOException e) {
			e.printStackTrace();		
		}
	}
}

class MyServerReader extends Thread{
	private DataInputStream dis;
	public MyServerReader(DataInputStream dis ){
		this.dis = dis;	
	}
	public void run(){
		String info;
		try{
			while(true){
				info = dis.readUTF();
				System.out.println("对方说: " + info);
				if(info.equals("bye")){
					System.out.println("对方下线，程序退出!");
					System.exit(0);
				}
			}		
		}catch (IOException e) {
			e.printStackTrace();		
		}	
	} 	
}

class MyServerWriter extends Thread{
	private DataOutputStream dos;
	public MyServerWriter(DataOutputStream dos){
		this.dos = dos;	
	}
	public void run(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String info;
		try{
			while(true){
				info = br.readLine();
				dos.writeUTF(info);
				if(info.equals("bye")){
					System.out.println("自己下线，程序退出!");
					System.exit(0);
				}
			}		
		}catch (IOException e) {
			e.printStackTrace();		
		}	
	} 	
}
