package com.oo.cc;
import com.oo.bb.*;
public class C {
	private B b;
	public C(int i) {
		b = new B(i);
		System.out.println("C" + i);
	}
}