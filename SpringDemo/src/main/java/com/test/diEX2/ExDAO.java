package com.test.diEX2;

public class ExDAO {
	String msg;
	public ExDAO() {}
	public ExDAO(String msg) {
		this.msg=msg;
	}
	void output() {
		System.out.println("메세지 : "+msg);
	}
}
