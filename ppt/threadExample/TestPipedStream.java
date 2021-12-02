package com.dal.threadExample;

import java.io.*;
import java.util.*;

public class TestPipedStream {
	public static void main(String[] args) {
		try {
			PipedOutputStream out = new PipedOutputStream();
			PipedInputStream in = new PipedInputStream();
			out.connect(in);
			ThreadOut to = new ThreadOut(out);
			ThreadIn ti = new ThreadIn(in);
			to.start();
			ti.start();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

class ThreadOut extends Thread {
	private int i1 = 12345;
	private boolean b1 = true;
	private char c1 = 'a';
	private String s1 = "Java �������";
	private DataOutputStream dos;

	public ThreadOut(PipedOutputStream out) {
		dos = new DataOutputStream(out);
	}

	public void run() {
		System.out.println("����ܵ�����������");
		System.out.println("\t������" + i1 + "\t�߼�ֵ��" + b1 + "\t�ַ���" + c1
				+ "\t�ַ�����" + s1);
		try {
			dos.writeInt(i1);
			dos.writeBoolean(b1);
			dos.writeChar(c1);
			dos.writeUTF(s1);
			dos.close();
		} catch (IOException e) {
		}
	}
}

class ThreadIn extends Thread {
	private DataInputStream dis;

	public ThreadIn(PipedInputStream in) {
		dis = new DataInputStream(in);
	}

	public void run() {
		try {
			int i2 = dis.readInt();
			boolean b2 = dis.readBoolean();
			char c2 = dis.readChar();
			String s2 = dis.readUTF();
			System.out.println("��������ܵ����յ�������ܵ����͵����ݣ�");
			System.out.println("\t������" + i2 + "\t�߼�ֵ��" + b2 + "\t�ַ���" + c2
					+ "\t�ַ���" + s2);
			dis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
