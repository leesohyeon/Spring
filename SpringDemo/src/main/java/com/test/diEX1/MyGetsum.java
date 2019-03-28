package com.test.diEX1;

public class MyGetsum { 
	public Getsum getGetsum() {
		return getsum;
	}
	public void setGetsum(Getsum getsum) {
		this.getsum = getsum;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	Getsum getsum;
	int a;
	int b;
	void sum() {
		getsum.sum(a,b);
	}
}
